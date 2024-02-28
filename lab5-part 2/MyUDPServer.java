import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;

class MyUDPServer {
    public static void main(String args[]) {
        DatagramSocket socket = null;

        try {
            socket = new DatagramSocket(9876);

            while (true) {
                byte[] receiveData = new byte[1024];

                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);

                String clientRequest = new String(receivePacket.getData(), 0, receivePacket.getLength());

                if (clientRequest.equals("getTime")) {
                    new Thread(new ClientHandler(socket, receivePacket)).start();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
        }
    }

    private static String getCurrentTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(new Date());
    }

    private static class ClientHandler implements Runnable {
        private DatagramSocket socket;
        private DatagramPacket receivePacket;

        public ClientHandler(DatagramSocket socket, DatagramPacket receivePacket) {
            this.socket = socket;
            this.receivePacket = receivePacket;
        }

        @Override
        public void run() {
            try {
                String serverTime = getCurrentTime();
                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();
                byte[] sendData = serverTime.getBytes();

                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
                socket.send(sendPacket);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

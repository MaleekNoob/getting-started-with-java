import java.net.*;

class MyUDPClient {
    public static void main(String args[]) {
        try {
            for (int i = 0; i < 5; i++) {
                new Thread(() -> sendRequest()).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void sendRequest() {
        DatagramSocket socket = null;

        try {
            socket = new DatagramSocket();

            String request = "getTime";
            byte[] sendData = request.getBytes();
            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPort = 9876;

            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
            socket.send(sendPacket);

            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            socket.receive(receivePacket);

            String serverTime = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Server time: " + serverTime);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
        }
    }
}

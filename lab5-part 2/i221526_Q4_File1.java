import java.net.*;

class i221526_Q4_File1 {
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
                    new Thread(new i221526_Q4_File3(socket, receivePacket)).start();
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

}

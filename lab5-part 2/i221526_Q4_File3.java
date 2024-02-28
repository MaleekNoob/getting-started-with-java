import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;

class i221526_Q4_File3 implements Runnable {
    private DatagramSocket socket;
    private DatagramPacket receivePacket;

    public i221526_Q4_File3(DatagramSocket socket, DatagramPacket receivePacket) {
        this.socket = socket;
        this.receivePacket = receivePacket;
    }

    private static String getCurrentTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(new Date());
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
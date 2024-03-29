import java.net.*;
import java.io.*;

class i221526_Q3_File1 {
    public static void main(String args[]) {

        try {
            ServerSocket ss = new ServerSocket(3333);
            Socket s = ss.accept();
            DataInputStream dataIn = new DataInputStream(s.getInputStream());
            DataOutputStream dataOut = new DataOutputStream(s.getOutputStream());

            File receivedFolder = new File("ReceivedFiles");
            if (!receivedFolder.exists()) {
                receivedFolder.mkdir();
            }

            String fileName = "";
            long fileSize = 0;

            fileName = dataIn.readUTF();
            fileSize = dataIn.readLong();

            System.out.println("Receiving file: " + fileName);

            FileOutputStream fileOutputStream = new FileOutputStream(new File(receivedFolder, fileName));

            byte[] buffer = new byte[1024];
            int bytesRead;

            while (fileSize > 0
                    && (bytesRead = dataIn.read(buffer, 0, (int) Math.min(buffer.length, fileSize))) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
                fileSize -= bytesRead;
            }

            fileOutputStream.close();
            dataIn.close();
            s.close();
            ss.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

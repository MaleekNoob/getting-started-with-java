import java.net.*;
import java.io.*;

class MyFileServer {
    public static void main(String args[]) throws Exception {
        ServerSocket ss = new ServerSocket(3333);
        Socket s = ss.accept();
        DataInputStream dataIn = new DataInputStream(s.getInputStream());
        DataOutputStream dataOut = new DataOutputStream(s.getOutputStream());

        // Create a folder to store received files
        File receivedFolder = new File("ReceivedFiles");
        if (!receivedFolder.exists()) {
            receivedFolder.mkdir();
        }

        String fileName = "";
        long fileSize = 0;

        // Receive file details (name and size)
        fileName = dataIn.readUTF();
        fileSize = dataIn.readLong();

        System.out.println("Receiving file: " + fileName);

        // Create FileOutputStream to write the received file
        FileOutputStream fileOutputStream = new FileOutputStream(new File(receivedFolder, fileName));

        // Receive file content
        byte[] buffer = new byte[1024];
        int bytesRead;

        while (fileSize > 0 && (bytesRead = dataIn.read(buffer, 0, (int) Math.min(buffer.length, fileSize))) != -1) {
            fileOutputStream.write(buffer, 0, bytesRead);
            fileSize -= bytesRead;
        }

        // Close streams
        fileOutputStream.close();
        dataIn.close();
        s.close();
        ss.close();
    }
}

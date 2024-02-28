import java.net.*;
import java.io.*;

class MyFileClient {
    public static void main(String args[]) throws Exception {
        Socket s = new Socket("localhost", 3333);
        DataInputStream dataIn = new DataInputStream(s.getInputStream());
        DataOutputStream dataOut = new DataOutputStream(s.getOutputStream());

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Enter the file path to be sent
        System.out.print("Enter the file path to be sent: ");
        String filePath = bufferedReader.readLine();

        // Open FileInputStream to read the file
        FileInputStream fileInputStream = new FileInputStream(filePath);

        // Send file details (name and size)
        File file = new File(filePath);
        dataOut.writeUTF(file.getName());
        dataOut.writeLong(file.length());
        dataOut.flush();

        System.out.println("Sending file: " + file.getName());

        // Send file content
        byte[] buffer = new byte[1024];
        int bytesRead;

        while ((bytesRead = fileInputStream.read(buffer)) != -1) {
            dataOut.write(buffer, 0, bytesRead);
            dataOut.flush();
        }

        // Close streams
        fileInputStream.close();
        dataOut.close();
        s.close();
    }
}

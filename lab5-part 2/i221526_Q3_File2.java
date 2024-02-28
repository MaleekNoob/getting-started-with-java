import java.net.*;
import java.io.*;

class i221526_Q3_File2 {
    public static void main(String args[]) throws Exception {

        try {
            Socket s = new Socket("localhost", 3333);
            DataInputStream dataIn = new DataInputStream(s.getInputStream());
            DataOutputStream dataOut = new DataOutputStream(s.getOutputStream());

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the file path to be sent: ");
            String filePath = bufferedReader.readLine();

            FileInputStream fileInputStream = new FileInputStream(filePath);

            File file = new File(filePath);
            dataOut.writeUTF(file.getName());
            dataOut.writeLong(file.length());
            dataOut.flush();

            System.out.println("Sending file: " + file.getName());

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                dataOut.write(buffer, 0, bytesRead);
                dataOut.flush();
            }

            fileInputStream.close();
            dataOut.close();
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}

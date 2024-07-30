import java.util.*;
import java.io.*;
import java.net.*;

public class server {
    public static void main(String str [])
    {
        try {
            int num ,temp;
            ServerSocket ss = new ServerSocket(1234);
            Socket s = ss.accept();

            DataInputStream dis = new DataInputStream(s.getInputStream());
            num = dis.readInt();
            System.out.println("Number send from Client: "+num);
            

            
			DataInputStream dis1 = new DataInputStream(s.getInputStream());
            String message = dis1.readUTF();
            System.out.println("Message from Client: "+message);
			

            DataOutputStream dos1 = new DataOutputStream(s.getOutputStream());
            dos1.writeInt(num*num);

            DataOutputStream dos2 = new DataOutputStream(s.getOutputStream());
            dos1.writeUTF("Hi!Client");

            DataOutputStream dos3 = new DataOutputStream(s.getOutputStream());
            dos1.writeInt(num+num);


           
            


            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


/*  Name : Swapnil Sawant 
    Division : TE4
    Roll No : 47
    Batch : D
*/
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            System.out.println("Establishing connection....");
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();// establishes connection
            System.out.println("Connection done successfully..");
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String) dis.readUTF();
            System.out.println("message= " + str);
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
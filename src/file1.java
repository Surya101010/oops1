import java.io.*;
public class file1 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("demo.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("welcome ");
        FileInputStream fin = new FileInputStream("demo.txt");
        DataInputStream din = new DataInputStream(fin);
        String str = din.readUTF();
        System.out.println(str);
    }
}

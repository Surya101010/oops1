import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
public class file2 {
    public static void main(String[] args)  throws Exception {
        FileOutputStream f1= new FileOutputStream("test1.txt");
        BufferedOutputStream bout = new BufferedOutputStream(f1);
        String s ="z";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        f1.close();
        FileInputStream fin= new FileInputStream("test1.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);
        int i;
        while (((i= bin.read())!=-1)){
            System.out.println((char)i);
            System.out.println(i);
        }
        bin.close();
        fin.close();
    }
}

import java.io.*;

public class WriteByteToFile {
    public static void main(String[] args) {
        String fileName = "bytesToFile.txt";
        byte b = -64;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(-0xc0));
        byte[] a = new byte[]{b, b};
//        File file = new File(fileName);
//
//        try {
//            OutputStream os = new FileOutputStream(file);
//            os.write(a);
//            System.out.println("write to file done.");
//            os.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }
}
import java.io.*;

public class ReadFromNonUTF8 {
    public static void main(String[] args) {
        try {
//            File path = new File("./bytesToFile.txt");
            File path = new File("./yzwifi.csv");
            InputStream inputStream = new FileInputStream(path);
            BufferedInputStream buffer = new BufferedInputStream(inputStream);
            Reader reader = new InputStreamReader(buffer);
            reader.close();
        } catch (UnsupportedEncodingException e) {
            System.out.println("UnsupportedEncodingException:" + e);
        } catch (Exception e) {
            System.out.println(e);
        } finally {

        }

        try {
            System.out.println("1:  " + "中文");
            System.out.println("2:  " + "中文".getBytes());
            System.out.println("3:  " + "中文".getBytes("GB2312"));
            System.out.println("4:  " + "中文".getBytes("ISO8859_1"));
            System.out.println("5:  " + new String("中文".getBytes()));
            System.out.println("6:  " + new String("中文".getBytes(), "GB2312"));
            System.out.println("7:  " + new String("中文".getBytes(), "ISO8859_1"));
            System.out.println("8:  " + new String("中文".getBytes("GB2312")));
            System.out.println("9:  " + new String("中文".getBytes("GB2312"), "GB2312"));
            System.out.println("10: " + new String("中文".getBytes("GB2312"), "ISO8859_1"));
            System.out.println("11: " + new String("中文".getBytes("ISO8859_1")));
            System.out.println("12: " + new String("中文".getBytes("ISO8859_1"), "GB2312"));
            System.out.println("13: " + new String("中文".getBytes("ISO8859_1"), "ISO8859_1"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
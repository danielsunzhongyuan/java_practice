import java.nio.charset.Charset;


public class SystemDefaultCharacterSet {
    public static void main(String[] args) {
        String a = System.getProperty("file.encoding");
        System.out.println("file.encoding:" + a);
        System.out.println("Charset.defaultCharSet():" + Charset.defaultCharset());
        System.out.println("Charset.defaultCharSet().name():" + Charset.defaultCharset().name());
    }
}
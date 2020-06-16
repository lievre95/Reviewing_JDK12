import java.lang.*;
import java.io.ByteArrayInputStream;

public class Test28_ByteArrayInputStream {
    public static void main(String[] args) {
        byte[] array1 = new byte[]{1, 6, 3, 4, 5, 8};
        ByteArrayInputStream byteStream1 = new ByteArrayInputStream(array1);
        int b;
        while ((b = byteStream1.read()) != -1) {
            System.out.println(b);
        }
        String text = "Hello World!";

        byte[] array2 = text.getBytes();
        ByteArrayInputStream byteStream2 = new ByteArrayInputStream(array2, 0, 5);
        int c;
        while ((c = byteStream2.read()) != -1) {
            System.out.println((char) c);
        }
    }
}

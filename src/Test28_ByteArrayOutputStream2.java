import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class Test28_ByteArrayOutputStream2 {
    public static void main(String[] args) {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String text = "Hello Jorik!";
        byte[] buffer = text.getBytes();

        try {
            baos.write(buffer);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try (FileOutputStream fos = new FileOutputStream("D:\\Projects\\First\\src\\res\\text1.txt")) {
            baos.writeTo(fos);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}


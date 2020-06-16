import java.io.ByteArrayOutputStream;

public class Test28_ByteArrayOutputStream {
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String text = "Hello World!";
        byte[] buffer = text.getBytes();
        try {
            baos.write(buffer);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        //transforming an array to String
        System.out.println(baos.toString());
        byte [] array = baos.toByteArray();
        for(byte b: array){
            System.out.println((char)b);
        }

    }
}

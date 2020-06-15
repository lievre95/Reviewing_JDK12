import java.io.FileInputStream;
import java.io.IOException;

class Test27_Streams_try_with_resources {
    public static void main(String[] args) {

        try(FileInputStream fin = new FileInputStream("D:\\Projects\\First\\src\\res\\text1.txt");
            FileInputStream fos = new FileInputStream("D:\\Projects\\First\\src\\res\\text2.txt");
        ) {
            int i = -1;
            while ((i = fin.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }


// close() is invoked automatically because that is implements interface AutoCloseable(try-with-resources)
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Test28_PrintStream {
    public static void main(String[] args) {
        String text = "Hello Junior!";
        try (FileOutputStream fos = new FileOutputStream("D:\\Projects\\First\\src\\res\\text3.txt");
             PrintStream printStream = new PrintStream(fos)) {
            printStream.println(text);
            System.out.println("Recording in file was done");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}


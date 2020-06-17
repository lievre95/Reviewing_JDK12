import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Test28_PrintStream2 {
    public static void main(String[] args) {
        try (PrintStream printStream = new PrintStream("D:\\Projects\\First\\src\\res\\text4.txt")) {
            printStream.print("Hello Junior!");
            printStream.println("Welcome to Java");
            printStream.printf("Name: %s Age: %d \n", "Tom", 34);
            String message = "PrintStream";
            byte[] message_toBytes = message.getBytes();
            printStream.write(message_toBytes);
            System.out.println("The file has been updated");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }


    }

}



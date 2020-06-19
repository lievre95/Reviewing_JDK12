import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test30_BufferedReader {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("notes.txt"))) {
            int c;
            while ((c = br.read()) != -1) {
                System.out.println((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

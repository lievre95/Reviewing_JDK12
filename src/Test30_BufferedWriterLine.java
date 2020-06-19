import java.io.*;

public class Test30_BufferedWriterLine {
    public static void main(String[] args) {
        try (
                BufferedReader brl = new BufferedReader(new FileReader("notes.txt"))) {
            String s;
            while ((s = brl.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}



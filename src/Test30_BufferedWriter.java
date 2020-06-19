import java.io.*;

public class Test30_BufferedWriter {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("notes.txt"))) {
            String text = "Hello Buffer!\nHey! What's new mate?";
            bw.write(text);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }
    }
}


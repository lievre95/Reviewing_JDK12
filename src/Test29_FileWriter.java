import java.io.*;
import java.io.FileWriter;

class FileWriter_test {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("notes.txt", true)) {
            //recording whole String
            String text = "Hello Gold!";
            writer.write(text);
            //recording by symbols
            writer.append('\n');
            writer.append('E');
            writer.flush();


        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}


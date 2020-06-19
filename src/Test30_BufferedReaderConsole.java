import java.io.*;

import static java.lang.System.*;

public class Test30_BufferedReaderConsole {
    public static void main(String[] args) {
        try (BufferedReader brc = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter("notes.txt"))) {
            String text;
            while (!(text = brc.readLine()).equals("ESC")) {
                bw.write(text + "\n");
                bw.flush();
            }
        } catch (IOException ex) {
            out.println(ex.getMessage());
        }
    }
}

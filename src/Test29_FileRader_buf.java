import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

class Test29_FileRader_buf {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("notes.txt")) {
            char[] buf = new char[256];
            int c;
            while ((c = reader.read(buf)) > 0) {
                if (c < 256) {
//                    System.out.println(buf);
//to truncate the useless space in the array use close of copying*(copyOf) and thereby the rest is the symbols which is needed to us
                    buf = Arrays.copyOf(buf, c);
                    System.out.println(buf);
                }
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}


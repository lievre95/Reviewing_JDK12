import java.io.File;
import java.io.PrintWriter;

public class Test28_PrintWriter {

    //PrintStream like class PrintWriter that allows to print information on console /file / stream
    //Class PrintWriter implements interfaces Appendable, Closeable, Flushable and its need to close to prevent memory leaking
    public static void main(String[] args) throws Exception {
        //Data to write on Console using PrintWriter
        PrintWriter writer = new PrintWriter(System.out);
        writer.write("Writing in the file is being processed..");
        writer.flush();
        writer.close();
        //Data to write in File using PrintWriter
        PrintWriter writer1 = null;
        File file = new File("D:\\\\Projects\\\\First\\\\src\\\\res\\\\text5.txt");

        writer1 = new PrintWriter(new File(String.valueOf(file)));
        writer1.write("Java is the best programming language!");
        writer1.flush();
        writer1.close();
    }
}

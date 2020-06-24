import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.*;

public class Test32_ZipEntry {
    public static void main(String[] args) {

        String filename = "D:\\Projects\\First\\src\\newFile.txt";

        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("d:\\Projects\\First\\src\\output.zip"));
             FileInputStream fis = new FileInputStream(filename)) {
            ZipEntry entry1 = new ZipEntry("notes.txt");
            zout.putNextEntry(entry1);
            byte[] buffer = new byte[fis.available()];
            //adding files in archive
            fis.read(buffer);
            //closing the current recording for new record
            zout.write(buffer);
            zout.closeEntry();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

}



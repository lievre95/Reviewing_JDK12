import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Test33_String {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String();
        String str3 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        String str4 = new String(new char[]{'w', 'e', 'l', 'c', 'o', 'm', 'e'});
        String s = "";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        System.out.println(str1.length());
        System.out.println(str2.toCharArray());

        if (s.length() == 0) System.out.println("String is Empty");
        if (s.isEmpty()) System.out.println("String is Empty");

        String n = null;
        if (n == null) {
            System.out.println("var n is null"); //null!=0

            if (n != null && n.length() == 0) {
                System.out.println("String is empty");
            }
        }
    }

}



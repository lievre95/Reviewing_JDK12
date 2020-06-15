import java.io.*;

class Test27_Streams {
    public static void main(String[] args) {
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("D:\\Projects\\First\\src\\res\\text1.txt");
            int i = -1;
            while ((i = fin.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}



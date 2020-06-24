import java.io.File;

public class Test32_FileSystem {
    public static void main(String[] args) {

        // creating object File for catalog
        File dir1 = new File("d:\\Projects\\First\\src\\");
        // creating obj for files, which are in catalog
        File file1 = new File("d:\\Projects\\First\\src\\", "Hello.txt");
        File file2 = new File(dir1, "Hello.txt");

        //defining obj for dir
        File dir = new File("d:\\Projects\\First\\src\\");
        if (dir.isDirectory()) {
            //getting all nested object in directory
            for (File item : dir.listFiles()) {
                if (item.isDirectory()) {
                    System.out.println(item.getName());
                } else {
                    System.out.println(item.getName());
                }
            }
        }
    }
}



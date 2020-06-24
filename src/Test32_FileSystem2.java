import java.io.File;
import java.io.IOException;

public class Test32_FileSystem2 {
    public static void main(String[] args) {

     // defining obj for the dir
     File myFile = new File("d:\\Projects\\First\\src\\notes.txt");
        System.out.println("File name: " + myFile.getName());
        System.out.println("Parent folder:" + myFile.getParent());
        if(myFile.exists()){
            System.out.println("File " + myFile.getName() + " exists.");
        } else {
            System.out.println("File " + myFile.getName() + " does not exist");
        }
        System.out.println("File size " + myFile.length());
        if (myFile.canRead()) {
            System.out.println("File can be read");
        }else {
            System.out.println("File can not be read");
        }

        //creating a file
        File newFile = new File ("d:\\Projects\\First\\src\\newFile.txt");
        try{
            boolean x = newFile.createNewFile();
            if (x){
                System.out.println("File is created");
            } else {
                System.out.println("File is not created");
            }
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}



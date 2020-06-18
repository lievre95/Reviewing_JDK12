import java.io.*;
import java.io.FileReader;

class Test29_FileRader_test {
    public static void main(String[] args) {
try(FileReader reader = new FileReader("notes.txt"))
{
    //reading by symbols
    int c;
    while((c=reader.read())!=-1){
        System.out.println((char)c);
    }
}catch(IOException ex){
    System.out.println(ex.getMessage());
}
    }
}


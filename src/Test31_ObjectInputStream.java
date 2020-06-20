import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test31_ObjectInputStream {
    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat"))) {
            Person_s p = (Person_s)ois.readObject();
            System.out.println("Name: " + p.getName() + "Age: " + p.getAge());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }
}

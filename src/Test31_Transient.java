import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Test31_Transient {
    public static void main(String[] args) {
        String filename = "people.dat";
        // creating the list of obj. in which will record
        ArrayList<Person_tr> people = new ArrayList<Person_tr>();
        people.add(new Person_tr("Tom", 33, 165, false));
        people.add(new Person_tr("Bob", 32, 186, true));
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename)))
        {
            oos.writeObject(people);
            System.out.println("File has been written");

        } catch (Exception e) {
            e.getMessage();
        }
    }

    static class Person_tr implements Serializable {
        private String name;
        private int age;
        private transient double height;
        private transient boolean married;

        Person_tr(String name, int age, double height, boolean married) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.married = married;
        }

        String getName() {
            return name;
        }

        int getAge() {
            return age;
        }

        double getHeight() {
            return height;
        }

        boolean getMarried() {
            return married;
        }
    }
}




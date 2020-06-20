import java.io.*;
import java.io.FileReader;
import java.io.IOException;

public class Test31_Serializable {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            Person_s person_s = new Person_s("Sam", 33, 178, true);
            oos.writeObject(person_s);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
class Person_s implements Serializable{
    private String name;
    private int age;
    private double height;
    private boolean married;

    public Person_s(String name, int age, double height, boolean married) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public boolean isMerried() {
        return married;
    }
}



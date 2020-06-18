import java.io.*;

class Person_DataOutputStream {
    public String name;
    public int age;
    public double height;
    public boolean married;

    public Person_DataOutputStream(String n, int a, double h, boolean m) {
        this.name = n;
        this.height = h;
        this.age = a;
        this.married = m;
    }
}

public class Test29_DataOutputStream {
    public static void main(String[] args) {
        Person_DataOutputStream tom = new Person_DataOutputStream("Tom", 34, 1.55, false);
        // recording in the file

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:\\\\Projects\\\\First\\\\src\\\\res\\\\data.bin"))) {
            dos.writeUTF(tom.name);
            dos.writeInt(tom.age);
            dos.writeDouble(tom.height);
            dos.writeBoolean(tom.married);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        // reverse reading the file
        try (DataInputStream dis = new DataInputStream(new FileInputStream("D:\\\\Projects\\\\First\\\\src\\\\res\\\\data.bin"))) {
            //Inputting the values
            String name = dis.readUTF();
            int age = dis.readInt();
            double height = dis.readDouble();
            boolean married = dis.readBoolean();
            System.out.println("Name: " + name + "; Age: " + age +  "; Height: " + height + "; Married: "+ married +";");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}


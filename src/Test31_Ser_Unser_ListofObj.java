//import org.w3c.dom.ls.LSOutput;
//
//import java.io.*;
//import java.util.ArrayList;
//
//public class Test31_Ser_Unser_ListofObj {
//    public static void main(String[] args) {
//        String filename = "people.dat";
//        // creating the list of obj. in which will record
//        ArrayList<Person_s> people = new ArrayList<Person_s>();
//        people.add(new Person_s("Tom", 33, 165, false));
//        people.add(new Person_s("Bob", 32, 186, true));
//    try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename)))
//        {
//        oos.writeObject(people);
//            System.out.println("File has been written");
//
//        } catch (Exception e) {
//        e.getMessage();
//    }
//
//
//
//        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename)))
//        {
//            ois.readObj(people);
//            System.out.println("File has been written");
//
//        } catch (Exception e) {
//            e.getMessage();
//        }
//
//    }
//}

/*
package OReilly;

import java.io.FileNotFoundException;

public class Catch {
    public static void main(String... unused) {
        System.out.println("a");
        try (StringBuilder reader = new StringBuilder()) {    //StringBuilder does not implement AutoCloseable
            System.out.println("b");
            throw new IllegalArgumentException();
        } catch (Exception e ||RuntimeException e){ //RuntimeException is a subclass of Exception making it redundant
            System.out.println("c");
            throw new FileNotFoundException(); // is not handled or declared by the method
        } finally{
            System.out.println("d");
        }
    }
}
//File contains 3 errors
*/

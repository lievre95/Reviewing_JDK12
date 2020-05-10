import java.util.Scanner;

import static java.lang.System.*;
import static java.lang.Math.*;


public class Test9_static_import {
    public static void main(String[] args) {
        out.println("Enter please the number: ");

        Scanner in = new Scanner(System.in);

        String myobj = in.nextLine();
        out.println("Your num is: " + myobj);

        double x = do_sqrt(myobj);
        out.println("Sqrt from this number is: " + x);
    }

    static double do_sqrt(String myobj) {
        int x = Integer.parseInt(myobj);
        return sqrt(x);
    }

}

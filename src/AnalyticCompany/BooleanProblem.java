/*    Write a method with only one boolean parameter. Depending on the parameter the method has to
return “a”, “b”, or “c”. =
PS: Scanner in the bonus  */
package AnalyticCompany;

import java.util.Optional;
import java.util.Scanner;

public class BooleanProblem {
    private static boolean ObjectBoolean;
    public static Optional<Boolean> TRI_UNKNOWN = Optional.empty();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer num = scanner.nextInt();
        if (num < 0) {
            System.out.println(returnResult(true));
        } else if (num > 0) {
            System.out.println(returnResult(false));
        } else {
            System.out.println(returnResult(TRI_UNKNOWN));

        }
//        System.out.println(resultParam);
//        System.out.println(returnResult(true));
//        System.out.println(returnResult(TRI_UNKNOWN));
    }

    private static <ObjectBoolean> String returnResult(ObjectBoolean o) {
        Boolean a = true;
        Boolean b = false;
        Optional<Object> c = Optional.empty();
        String result = null;
        if (o.equals(true)) {
            result = "a";
        } else if (o.equals(false)) {
            result = "b";
        } else if (o.equals(TRI_UNKNOWN)) {
            result = "c";
        }
        return result;
    }
}

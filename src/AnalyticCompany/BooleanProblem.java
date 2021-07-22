/*    Write a method with only one boolean parameter. Depending on the parameter the method has to
return “a”, “b”, or “c”.*/
package AnalyticCompany;

import java.util.Scanner;

public class BooleanProblem {
    private static java.lang.Object Object;
    Object x = new Object();
    boolean a = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 0) {
            BooleanProblem.Object = false;
        } else if (num > 0) {
            BooleanProblem.Object = true;
        } else {
            BooleanProblem.Object = "stop";
        }
        String resultParam = returnResult(num);
        System.out.println(resultParam);
    }

    private static String returnResult(Object o) {
        String result = null;
        if (BooleanProblem.Object.equals(true)) {
            result = "a";
        } else if (BooleanProblem.Object.equals(false)) {
            result = "b";
        } else if (BooleanProblem.Object.equals("stop")) {
            result = "c";
        }
        return result;
    }
}

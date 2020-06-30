import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Test35_Lambda {
    public static void main(String[] args) {
        Operationable operation;
        operation = (x, y) -> x + y;
        Operationable2 operation1;
        operation1 = (x, y) -> x * y;
        Operationable3 operation2;
        operation2 = (x, y) -> x - y;
        int result = operation.calculate(10, 20);
        int result2 = operation1.calculate(10, 20);
        int result3 = operation2.calculate(10, 20);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

    }
}

interface Operationable {
    int calculate(int x, int y);
}

interface Operationable2 {
    int calculate(int x, int y);
}

interface Operationable3 {
    int calculate(int x, int y);
}


// lambda as anonymous classes
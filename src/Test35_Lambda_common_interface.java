public class Test35_Lambda_common_interface {

    public static void main(String[] args) {
        Operationable_c<Integer> op = (x, y) -> x + y;
        Operationable_c<String> op2 = (x, y) -> x + y;

        System.out.println(op.calculate(20, 10));
        System.out.println(op2.calculate("20", "10"));
    }
}

interface Operationable_c<T> {
    T calculate(T x, T y);
}


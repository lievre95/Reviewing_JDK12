import java.util.function.Predicate;

class Test35_Embedded_functional_interfaces {
    interface Predicate<T> {
        boolean test(T t);
    }

    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println(isPositive.test(5));
        System.out.println(isPositive.test(-7));
    }
}


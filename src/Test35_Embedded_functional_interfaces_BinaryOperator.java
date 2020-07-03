class Test35_Embedded_functional_interfaces_BinaryOperator {
    interface BinaryOperator<T> {
        T apply(T t1, T t2);
    }

    public static void main(String[] args) {
        BinaryOperator<Integer> multiply = (x, y) -> x * y;
        System.out.println(multiply.apply(5, 5));
        System.out.println(multiply.apply(5, 2));
    }
}


class Test35_Embedded_functional_interfaces_UnaryOperator {
    interface UnaryOperator<T> {
        T apply(T t1);
    }

    public static void main(String[] args) {
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5));
        System.out.println(square.apply(2));
    }
}


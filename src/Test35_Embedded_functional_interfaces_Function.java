class Test35_Embedded_functional_interfaces_Function {
    interface Function<T, R> {
        R apply(T t1);
    }

    public static void main(String[] args) {
        Function<Integer, String> convert = x -> String.valueOf(x) + " dollars";
        System.out.println(convert.apply(5));
    }
}


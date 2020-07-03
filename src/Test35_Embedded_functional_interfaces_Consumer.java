import java.util.function.Consumer;

class Test35_Embedded_functional_interfaces_Consumer {
    interface Consumer<T> {
        void accept(T t1);
    }

    public static void main(String[] args) {
        Consumer<Integer> printer = x -> System.out.printf("Dollars: %d ;\n", x);
        printer.accept(600);
    }
}


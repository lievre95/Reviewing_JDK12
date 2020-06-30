class Test35_Lambda3 {
    public static void main(String[] args) {
        Printable_lambda printer = s -> System.out.println(s);
        printer.print("Hello Lambda!");

    }
}

interface Printable_lambda {
    void print(String s);
}
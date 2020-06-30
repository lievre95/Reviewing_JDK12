class Test35_lambda_lv_class {
    static int x = 10;
    static int y = 20;

    public static void main(String[] args) {
        Operation_lv op = () -> {
            x = 30;
            return x + y;
        };
        System.out.println(op.calculate());
        System.out.println(x);
    }
}

// if want to change var in lambda use final. it's kinda const
interface Operation_lv {
    int calculate();
}
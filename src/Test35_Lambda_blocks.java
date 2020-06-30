public class Test35_Lambda_blocks {

    public static void main(String[] args) {
        Operation_block op = (int x, int y) -> {
            if (y == 0) return 0;
            else return x / y;
        };
        System.out.println(op.calculate(20, 10));
        System.out.println(op.calculate(20, 0));
    }
}

interface Operation_block {
    int calculate(int x, int y);
}

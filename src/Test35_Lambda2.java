// anonymous class
class Test35_Lambda1 {
    public static void main(String[] args) {


        Operationable1 op = new Operationable1() {
            public int calculate(int x, int y) {
                return x + y;
            }
        };
        int z = op.calculate(10, 45);
        System.out.println(z);

    }
}

interface Operationable1 {
    int calculate(int x, int y);
}

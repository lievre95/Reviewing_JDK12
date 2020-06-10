public class Test21_enum4 {
    enum Operatione {
        SUM {
            public int actione(int x, int y) {
                return x + y;
            }
        },
        SUBSTRACT {
            public int actione(int x, int y) {
                return x - y;
            }
        },
        MULTIPLY {
            public int actione(int x, int y) {
                return x * y;
            }
        };

        public abstract int actione(int x, int y);
    }


    public static void main(String[] args) {
        Operatione op = Operatione.SUM;
        System.out.println(op.actione(10, 4));
        op = Operatione.MULTIPLY;
        System.out.println(op.actione(8, 8));

    }
}



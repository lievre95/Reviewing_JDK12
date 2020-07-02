class Test35_Lambda_as_result_methods {
    interface Operation_r {
        int execute(int x, int y);

    }

    static class Lambda_r {
        public static void main(String[] args) {
            // formal type of action is interface Operation_r, and returned lambda-expression matches this interface
            Operation_r func = action(1);
            int a = func.execute(6, 5);
            System.out.println(a);


            int b = action(2).execute(6, 5);
            System.out.println(b);

        }

        private static Operation_r action(int number) {
            switch (number) {
                case 1:
                    return (x, y) -> x + y;
                case 2:
                    return (x, y) -> x - y;
                case 3:
                    return (x, y) -> x * y;
                default:
                    return (x, y) -> 0;
            }
        }
    }
}
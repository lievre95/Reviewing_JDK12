class Test35_Links_on_method_as_parameters2 {
    //functional interface
    interface Expression3 {
        boolean isEqual(int n);
    }

    //defined methods within class
    static class ExpressionHelper2 {
        boolean isEven(int n) {
            return n % 2 == 0;
        }
    }

    public static class LambaApp2 {
        public static void main(String[] args) {
            int nums[] = {0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5};
            // syntax Name_of_class::name_of_static_method
            // syntax Name_of_class::name_of_non-static_method

            ExpressionHelper2 expr2 = new ExpressionHelper2();
            System.out.println(sum(nums, expr2::isEven));

        }

        private static int sum(int[] numbers, Expression3 func) {
            int result = 0;
            for (int i : numbers) {
                //condition is transmitted as obj of functional interface Expression2 
                if (func.isEqual(i))
                    result += i;
            }
            return result;
        }
    }
}


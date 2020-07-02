class Test35_Links_on_method_as_parameters {
    //functional interface
    interface Expression2 {
        boolean isEqual(int n);
    }

    //defined methods within class
    static class ExpressionHelper {
        static boolean isEven(int n) {
            return n % 2 == 0;
        }
        static boolean isPositive(int n) {
            return n > 0;
        }
    }

    public static class LambaApp {
        public static void main(String[] args) {
            int nums[] = {0, -1, -2, -3, -4, -5, 1, 2, 3, 4, 5};
            // syntax Name_of_class::name_of_static_method
            // syntax Name_of_class::name_of_non-static_method
            System.out.println(sum(nums, ExpressionHelper::isEven));

            Expression2 expr2 = ExpressionHelper::isPositive;
            System.out.println(sum(nums, expr2));
        }

        private static int sum(int[] numbers, Expression2 func) {
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


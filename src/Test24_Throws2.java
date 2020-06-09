class Factorial_throws2 {


    public static int getFactorial(int num) throws Exception {
        int result = 1;
        try {
            if (num < 1) throw new

                    Exception("The number is less than 1");


            for (int i = 1; i <= num; i++) {
                result *= i;

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            result = num;
        }
        return result;
    }
}


class myMainClass19 {
    public static void main(String[] args) {
        try {
            int result = Factorial_throws2.getFactorial(-6);
            System.out.println("Passed this block");

        } catch (Exception ex) {}
    }
}

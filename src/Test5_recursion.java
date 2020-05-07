public class Test5_recursion {
    public static void main(String args[]){
    int res = factorial1(4);
        System.out.println(res);
    }
//    static int factorial(int x){
//
//        if (x == 1){
//
//            return 1;
//        }
//        return x * factorial(x - 1);
//    }
    static int factorial1(int x){
        int result=1;
        for (int i = 1; i <= x; i++)
        {
            result *= i;
        }
        return  result;
    }
}
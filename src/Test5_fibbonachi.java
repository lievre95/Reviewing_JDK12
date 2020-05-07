public class Test5_fibbonachi {
    public static void main(String args[]){
      int fib = fibonachi(6);
        System.out.println(fib);
    }
    static int fibonachi(int n){

        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        else{
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }

}

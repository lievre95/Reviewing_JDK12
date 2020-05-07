import java.util.Scanner;

public class Test6_throw {
    public static void main(String args[]) {
//        Scanner in = new Scanner(System.in);
//        int x = in.nextInt();

//        if ( x > 30 ){
//            System.out.println("jopa");
//        }else{
//            System.out.println("nejopa");
//        }
        try {
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            if (x > 30) {
                throw new Exception("jopa");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("END");
    }
}

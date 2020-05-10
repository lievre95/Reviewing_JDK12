package SL.learning;

public class Test {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                result += 10;
                System.out.println(result);
                System.out.println(i);
            } else {
//                result = +i; //4
                result += i;  //17
            }
        }
        System.out.println(result);
    }
}

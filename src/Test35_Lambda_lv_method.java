public class Test35_Lambda_lv_method {

    public static void main(String[] args) {
        int n = 70;
        int m = 30;
        Calculate_lv_method op = () -> {
            //cannot put ex. n = 100
            return m + n;
        };
        System.out.println(op.calculate());

    }
}

interface Calculate_lv_method {
    int calculate();
}


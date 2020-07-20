import java.lang.Math;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

class Test42_Additional {
    public static void main(String[] args) {
        double absolut = Math.abs(-13); //13
        System.out.println(absolut);
        double arccos = Math.acos(1); //0.0
        System.out.println(arccos);
        // asin, atan

        double cbrt = Math.cbrt(27); //3
        System.out.println(cbrt);
        double mindouble = Math.ceil(2.34); //2
        System.out.println(mindouble);
        double maxdouble = Math.floor(2.43); //2
        System.out.println(maxdouble);

        System.out.println(Math.floorDiv(4, 2)); //2
        System.out.println(Math.floorDiv(5, 6)); //0
        System.out.println(Math.floorDiv(1, 3)); //0


        System.out.println(Math.rint(2.3));    //2
        System.out.println(Math.rint(3.5001)); //4
        System.out.println(Math.rint(3.5000)); //4

        System.out.println(Math.round(2.4)); //2
        System.out.println(Math.round(2.5));  //3
        System.out.println(Math.round(3.50001)); //4

        System.out.println(Math.scalb(5, 3)); // 5*2*2*2

        //signum. if<0 == - 1; if>0 ==1; if =0 ==0
        System.out.println(Math.signum(2.3)); //1
        System.out.println(Math.signum(-2.3)); //-1
        System.out.println(Math.signum(0)); //0

        double sqrt = Math.sqrt(16);
        System.out.println(Math.toDegrees(3.14159));//180
        System.out.println(Math.toRadians(90));//1.57079

        System.out.println("Enter radius of a circle:");
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();
        long area = Math.round(Math.PI * Math.pow(radius, 2));
        System.out.println("The area of a circle with radius " + radius + " equals " + area);

        BigInteger a = BigInteger.valueOf(221212121);
        BigInteger b = BigInteger.valueOf(321212121);
        // c = a+b; // can not do that
        a = a.multiply(b);
        System.out.println(a);
        long x = a.longValue();
        System.out.println(x);

        BigDecimal c = BigDecimal.valueOf(2325.06);
        BigDecimal d = BigDecimal.valueOf(215.06);
        c = c.subtract(d.multiply(BigDecimal.valueOf(2.1)));// difference between two numbers
        System.out.println(c);
        double y = c.doubleValue();
        System.out.println(y);

        LocalDate date = LocalDate.now(); //get the current date
        int year = date.getYear();
        int month = date.getMonthValue();
        int dayOfMonth = date.getMonthValue();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println(date);
        System.out.println(dayOfWeek);
        System.out.printf("%d.%d.%d \n", dayOfMonth, month, year);

        LocalDate date2 = LocalDate.of(1914, 12, 31);
        System.out.println(date2);
        date2 = date2.plusYears(4);
        date2 = date2.plusMonths(4);
        date2 = date2.minusDays(1);
        System.out.println(date2);

    }
}




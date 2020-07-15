import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

class Test40_StreamSorting4 {
    public static void main(String[] args) {
        Stream<String> phoneStream = Stream.of("Phone6", "Motorola", "Xiaomi Redmi S4", "Samsung Galaxy A63", "Nexus5", "Nokia5");
        phoneStream.skip(1).limit(2).forEach(n -> System.out.println(n));

        List<String> phones = new ArrayList<String>();
        phones.addAll(Arrays.asList(new String[]{
                "Phone6", "Motorola", "Xiaomi Redmi S4", "Samsung Galaxy A63", "Nexus5", "Nokia5"
                , "LG 5", "Meizu 5", "Sony Xperia Z9", "Lenovo5"}));
        int pageSize = 5;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the number of page");
            int page = scanner.nextInt();
            if (page < 1) break; //if the page is lower than 1 exits the loop
            phones.stream().skip((page - 1) * pageSize).limit(pageSize).forEach(n -> System.out.println(n));
        }
    }
}

import java.util.Scanner;
import java.util.function.Supplier;

class Test35_Embedded_functional_interfaces_Supplier {
    public static void main(String[] args) {
        Supplier<User_s> userFactory = () -> {
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter name");
            String name = in.nextLine();
            return new User_s(name);
        };
        User_s user1 = userFactory.get();
        User_s user2 = userFactory.get();

        System.out.println("User user1: " + user1.getName());
        System.out.println("User user2: " + user2.getName());
    }
}

class User_s {
    private String name;

    String getName() {
        return name;
    }

    User_s(String n) {
        this.name = n;
    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

class Test40_StreamSorting6 {
    public static void main(String[] args) {
        ArrayList<Phone_opt> phones = new ArrayList<Phone_opt>();
        phones.addAll(Arrays.asList(new Phone_opt[]{
                new Phone_opt("iPhoneX", 1200),
                new Phone_opt("LG-5", 600),
                new Phone_opt("SamsungXX", 1444),
                new Phone_opt("HTC U13", 800),
                new Phone_opt("Motorola E", 800)
        }));
        Phone_opt min = phones.stream().min(Phone_opt::compare).get();
        Phone_opt max = phones.stream().max(Phone_opt::compare).get();
        System.out.printf("MIN name: %s; Price: %d \n", min.getName(), min.getPrice());
        System.out.printf("MAX name: %s; Price: %d \n", max.getName(), max.getPrice());
    }
}

class Phone_opt {
    private String name;
    private int piece;

    public Phone_opt(String name, int piece) {
        this.name = name;
        this.piece = piece;
    }

    public static int compare(Phone_opt p1, Phone_opt p2) {
        if (p1.getPrice() > p2.getPrice()) return 1;
        return -1;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return piece;
    }
}
import java.util.Comparator;
import java.util.stream.Stream;

class Test39_StreamSorting2 {
    public static void main(String[] args) {
        Stream<Phone_Ss> phoneStream = Stream.of(new Phone_Ss("iPhone X", "Apple", 600),
        new Phone_Ss("Pixel 3", "Google", 700),
        new Phone_Ss("Nokia 10", "HMD Global", 599),
        new Phone_Ss("Galaxy S20", "Samsung", 5000));
        phoneStream.sorted(new PhoneComparator()).forEach(p-> System.out.printf("%s (%s) - %d \n", p.getName(),p.getCompany(), p.getPrice()));

    }
}
class PhoneComparator implements Comparator<Phone_Ss> {
    public int compare(Phone_Ss a, Phone_Ss b){
        return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
    }
}

class Phone_Ss {
    private String name;
    private String company;
    private int price;

    Phone_Ss(String name, String company, int price) {
        this.name = name;
        this.company = company;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getPrice() {
        return price;
    }
}

import java.util.stream.Stream;

class Test38_StreamAPI3 {
    public static void main(String[] args) {
        Stream<Phone2> phoneStream2 = Stream.of(new Phone2("iPhone", 600), new Phone2("Xiaomi E3", 1000),
                new Phone2("Samsung Galaxy Note 13", 900));
        phoneStream2
                .map(p->p.getName())
                .forEach(s-> System.out.println(s));
    }
}

class Phone2 {
    private String name;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Phone2(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

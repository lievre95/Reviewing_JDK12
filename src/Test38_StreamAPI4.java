import java.util.stream.Stream;

class Test38_StreamAPI4 {
    public static void main(String[] args) {
        Stream<Phone4> phoneStream3 = Stream.of(new Phone4("iPhone", 600), new Phone4("Xiaomi E3", 1000),
                new Phone4("Samsung Galaxy Note 13", 900));
        phoneStream3
                .flatMap(p -> Stream.of(
                        String.format("Name: %s price without the discount: %d", p.getName(), p.getPrice()),
                        String.format("Name: %s price with the discount: %d", p.getPrice(), p.getPrice() - (int) (p.getPrice() * 0.1))
                )).forEach(s -> System.out.println(s));
    }
}

class Phone4 {
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

    public Phone4(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

class Test38_StreamAPI2 {
    public static void main(String[] args) {
        Stream<String> citiesStream = Stream.of("x", "y", "j", "k");
        citiesStream.forEach(System.out::println);
        //filtering
        Stream<String> citiesStream2 = Stream.of("Paris", "Monaco", "Moscow");
        citiesStream2.filter(s -> s.length() == 6).forEach(s -> System.out.println(s));

        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone", 600), new Phone("Xiaomi E3", 1000),
                new Phone("Samsung Galaxy Note 13", 900));
        phoneStream.filter(p -> p.getPrice() < 800).forEach(p -> System.out.println(p.getName()));

//        phoneStream.map(p -> p.getName()).forEach(System.out::println);
//        phoneStream.map(p -> "Name: " + p.getName() + "Price: " + p.getPrice()).forEach(s -> System.out.println(s));

    }
}

class Phone {
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

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

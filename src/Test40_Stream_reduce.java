import java.util.Optional;
import java.util.stream.Stream;

class Test40_Stream_reduce {
    public static void main(String[] args) {
        Stream<Integer> numbersStream = Stream.of(1, 23, 4, 5, 6, 7);
        Optional<Integer> result = numbersStream.reduce((x, y) -> x * y);
        System.out.println(result.get());

        Stream<String> wordsStream = Stream.of("Monarchie", "Kaiser Krone", "Federalismus");
        String sentence = wordsStream.reduce("Result: ", (x, y) -> x + " " + y);
        System.out.println(sentence);

        Stream<Phone_reduce> phoneStream = Stream.of(
                new Phone_reduce("iPhone 8", 54000),
                new Phone_reduce("Samsung Galaxy G6", 500),
                new Phone_reduce("Xiaomi Redmi S3", 444),
                new Phone_reduce("Pixel 4", 800));

        int sum = phoneStream.reduce(0,
                (x,y)->{
            if(y.getPrice()<501) return x+y.getPrice();
            else
                return x+0;
                },
                (x,y)->x+y);
        System.out.println(sum);
    }
}

class Phone_reduce {
    private String name;
    private int price;

    public Phone_reduce(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
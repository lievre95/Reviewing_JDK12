import java.util.*;
import java.util.stream.Stream;

class Test41_StreamParallel {
    public static void main(String[] args) {
        Stream<Integer> numbersStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Optional<Integer> result = numbersStream.parallel().reduce((x, y) -> x * y);
        System.out.println(result.get());

        Stream<String> wordStream = Stream.of("John", "eats", "pancakes");
        String sentence = wordStream
                .parallel()
                .reduce("Result:", (x, y) -> x + " " + y);
        System.out.println(sentence);

        Stream<String> numbersStream2 = Stream.of("Jora", "wishes", "about", "piech");
        String sentence2 = numbersStream2
                //.parallel()
                .filter(s -> s.length() < 5)
                .sequential()
                .reduce("Result: ", (x, y) -> x + " " + y);
        System.out.println(sentence2);

        Stream<Integer> numbersStream3 = Stream.of(1, 3, 5, 7, 11);
        Integer result2 = numbersStream3.parallel().reduce(1, (x, y) -> x * y);
        System.out.println(result2);
        System.out.printf("---------------\n");

        Stream<String> x = Stream.of("iPhone 8", "HTC U12", "Huawei Nexus 6P",
                "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
                "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850");
        x.parallel()
                .sorted()
                .forEachOrdered(s -> System.out.println(s));
        System.out.printf("---------------\n");

        Stream<String> y = Stream.of("iPhone 8", "HTC U12", "Huawei Nexus 6P",
                "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
                "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850");
        y.parallel()
                .sorted()
                .unordered()
                .forEach(s -> System.out.println(s));

    }
}




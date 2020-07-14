import java.util.stream.Stream;

class Test39_StreamSorting3 {
    public static void main(String[] args) {
        //takeWhile select all elements which corresponds to an condition, if it faced an element which doesn;t the method ends its work
        Stream<Integer> numbers = Stream.of(-3, -2, -1, 0, 1, 2, 3, -5);
        numbers.takeWhile(n -> n < 0)
                .forEach(n -> System.out.println(n)); // will return not all elements because the elements are not filtered

        Stream<Integer> numbers2 = Stream.of(-3, -2, -1, 0, 1, 2, 3, -5);
        numbers2.sorted().takeWhile(n -> n < 0)
                .forEach(n -> System.out.println(n)); // will return not all elements because of sorting

        Stream<Integer> numbers3 = Stream.of(-3, -2, -1, 0, 1, 2, 3, -5);
        numbers3.dropWhile(n -> n < 0)
                .forEach(n -> System.out.println(n)); // passing all elements which corresponds to condition while an element don't pass


        Stream<String> people = Stream.of("Tom", "Bob", "Sam");
        Stream<String> people2 = Stream.of("Jora", "Peter", "Alexei");
        Stream.concat(people, people2).forEach(n -> System.out.println(n));

        Stream<String> people_distinct = Stream.of("Tom", "Bob", "Kate", "Jora", "Tom");
        people_distinct.distinct().forEach(p -> System.out.println(p));


    }
}

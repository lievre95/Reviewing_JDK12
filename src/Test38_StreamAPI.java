import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.*;

class Test38_StreamAPI {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<String>();
        Collections.addAll(cities, "London", "Madrid", "Berlin");
        cities.stream() //getting the stream
                .filter(s -> s.length() == 6) //applying the filter by length of string
                .forEach(s -> System.out.println(s));//outputting just filtered strings

        ArrayList<String> cities2 = new ArrayList<String>();
        Collections.addAll(cities2, "Chisinau", "Minsk", "Kiev");
        Stream<String> citiesStream = cities2.stream(); // getting the stream
        citiesStream = citiesStream.filter(s -> s.length() == 6); //applying the filter by length of string
        citiesStream.forEach(s -> System.out.println(s));

        IntStream intStream = Arrays.stream(new int[]{1, 2, 3, 4, 6, 8});
        intStream.forEach(i -> System.out.println(i));

        LongStream longStream = Arrays.stream(new long[]{155, 156, 178, 788});
        longStream.forEach(l -> System.out.println(l));

        DoubleStream doubleStream = Arrays.stream(new double[]{4.1, 3.4, 55.33, 55});
        doubleStream.forEach(d -> System.out.println(d));

        Stream<String> citiesStream_ = Stream.of("London", "Madrid", "Berlin");
        citiesStream_.forEach(s -> System.out.println(s));

        // passing an array
        String[] cities_ = {"London", "Madrid", "Berlin"};
        Stream<String> citiesStream2 = Stream.of(cities_);

        IntStream intStream1 = IntStream.of(1, 3, 4, 5, 6);
        intStream1.forEach(i -> System.out.println(i));

        LongStream longStream1 = LongStream.of(111, 322, 433, 533, 446);
        longStream1.forEach(l -> System.out.println(l));

        DoubleStream doubleStream1 = DoubleStream.of(1.2, 3, 4.5, 5.4, 6.3);
        doubleStream1.forEach(d -> System.out.println(d));
    }
}

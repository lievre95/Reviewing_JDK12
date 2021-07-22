package OReilly;

import java.util.function.Predicate;

public class Lamda {
    public static void main(String[] args) {
        System.out.println(test(i -> i==5)); // +
//        System.out.println(test(i -> {i==5; })); won't compile => return needed when curly braces.
        System.out.println(test((i) -> i==5)); // +
//        System.out.println(test((int i) -> i==5)); //Predicate is Integer, but found int in lambda
//        System.out.println(test((int i) ‐> {return i == 5;})); // incorrect because the type is Integer in the predicate and int in the lambda.
        System.out.println(test((i) -> {return i == 5;})); // +
    }
    private static boolean test (Predicate< Integer > p) {
        return p.test(5);
    }
}

//test(i ‐> i == 5)
//test(i ‐> {i == 5;})
//test((i) ‐> i == 5)
//test((int i) ‐> i == 5)
//test((int i) ‐> {return i == 5;})
//test((i) ‐> {return i == 5;})
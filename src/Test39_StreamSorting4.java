import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Random;

class Test39_StreamSorting4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        System.out.println(min.get());//1

        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        Optional<Integer> min2 = numbers2.stream().min(Integer::compare);
        //System.out.println(min2.get());//noSuchElementException
        //boolean isPresent
        if (min.isPresent()) {
            System.out.println(min.get());
        }
        //orElse an alternative when no elements found
        System.out.println(min2.orElse(-1));
        System.out.println(min.orElse(-1));
        //orElseGet returns default value
        ArrayList<Integer> numbers3 = new ArrayList<Integer>();
        Optional<Integer> min3 = numbers3.stream().min(Integer::compare);
        Random rnd = new Random();
        System.out.println(min3.orElseGet(()->rnd.nextInt(100)));

        Optional<Integer> min4 = numbers.stream().min(Integer::compare);
        min.ifPresent(v-> System.out.println(v)); // if no such element then no errors

        min2.ifPresentOrElse(v -> System.out.println(v), // ifPresentOrElse passing to func; first when there is such element,
                () -> System.out.println("Value not found") // second one when no such element
        );
    }
}

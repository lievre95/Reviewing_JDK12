import java.util.*;
import java.util.stream.Stream;

class Test40_StreamSorting5 {
    //Mix operations
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.addAll(Arrays.asList(new String[]{"Tom", "Sam", "Jora", "Karen", "Luisa"}));
        System.out.println(names.stream().count());

        //count the elements with length GT 3
        System.out.println(names.stream().filter(n -> n.length() > 3).count());

        Optional<String> first = names.stream().findFirst();
        System.out.println(first.get());

        Optional<String> any = names.stream().findAny();
        System.out.println(first.get());

        boolean anyMatch = names.stream().anyMatch(s -> s.length() > 3);
        System.out.println(anyMatch);

        boolean allMatch = names.stream().allMatch(s -> s.length() == 3);
        System.out.println(allMatch);

        boolean noneMatch = names.stream().noneMatch(s -> s == "Jora");
        System.out.println(noneMatch);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9,0}));
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        Optional<Integer> max = numbers.stream().max(Integer::compare);
        System.out.println(min.get());
        System.out.println(max.get());
    }
}

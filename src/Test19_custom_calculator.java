//import java.util.function.IntPredicate;
//import java.util.stream.IntStream;
//
//public class Test19_custom_calculator implements CustomCalculator {
//
//    public static void main(String[] args) {
//
//        CustomCalculator demo = new Test19_custom_calculator();
//
//int sumOfEvents =  demo.addEvenNumbers(1,2,2,2,3,3,5);
//        System.out.println(sumOfEvents);
//
//        int sumOfOdds = demo.addOddNumbers(3,4,5,6,7,88,8,8);
//        System.out.println(sumOfOdds);
//
//    }
//}
//public interface CustomCalculator{
//    default int addEvenNumbers(int... nums){
//        return add(n -> n % 2 == 0, nums);
//    }
//    default int addOddNumbers(int... nums){
//        return add( n -> n % 2 != 0, nums);
//    }
//    private int add(IntPredicate predicate, int... nums ){
//        return IntStream.of(nums)
//                .filter(predicate)
//                .sum();
//    }
//}
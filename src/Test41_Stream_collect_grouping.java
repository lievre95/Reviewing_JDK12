import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Test41_Stream_collect2 {
    public static void main(String[] args) {
        Stream<Phone_collect_g> phoneStream = Stream.of(new Phone_collect_g("iPhone 8", "Apple", 700),
                new Phone_collect_g("Pixel 3", "Google", 800),
                new Phone_collect_g("Pixel 2", "Google", 600),
                new Phone_collect_g("iPhone X", "Apple", 1200),
                new Phone_collect_g("Meizu S9", "Xiaomi", 400
                ));
        //groupingBy
//        Map<String, List<Phone_collect_g>> phonesByCompany = phoneStream.collect(Collectors.groupingBy(Phone_collect_g::getCompany));
//        for (Map.Entry<String, List<Phone_collect_g>> item : phonesByCompany.entrySet()) {
//            System.out.println(item.getKey());
//            for (Phone_collect_g phone : item.getValue()) {
//                System.out.println(phone.getName());
//            }
//            System.out.println();
//        }
        //partitioningBy (checking the condition)
//        Map<Boolean, List<Phone_collect_g>> phonesByCompany2 = phoneStream.collect(Collectors.partitioningBy(p -> p.getCompany() == "Apple"));
//        for (Map.Entry<Boolean, List<Phone_collect_g>> item : phonesByCompany2.entrySet()) {
//            System.out.println(item.getKey());
//            for (Phone_collect_g phone : item.getValue()) {
//                System.out.println(phone.getName());
//            }
//            System.out.println();
//        }
        //counting
//        Map<String, Long> phonesByCompany3 = phoneStream.collect(Collectors.groupingBy(Phone_collect_g::getCompany, Collectors.counting()));
//        for (Map.Entry<String, Long> item : phonesByCompany3.entrySet()) {
//            System.out.println(item.getKey() + " - " + item.getValue());
//        }
        ///summingInt
//        Map<String, Integer> phonesByCompany4 = phoneStream.collect(
//                Collectors.groupingBy(Phone_collect_g ::getCompany, Collectors.summingInt(Phone_collect_g::getPrice)));
//        for(Map.Entry<String,Integer> item: phonesByCompany4.entrySet()){
//            System.out.println(item.getKey()+" "+item.getValue());
//        }
        //minBy, maxBy
//        Map<String, Optional<Phone_collect_g>> phonesByCompany5 = phoneStream.collect(
//                Collectors.groupingBy(Phone_collect_g::getCompany,
//                        Collectors.minBy(
//                                Comparator.comparing((Phone_collect_g::getPrice)))));
//        for (Map.Entry<String, Optional<Phone_collect_g>> item : phonesByCompany5.entrySet()) {
//            System.out.println(item.getKey() + " - " + item.getValue().get().getName());
//        }
        //summarizing. IntSummaryStatistics
//        Map<String, IntSummaryStatistics> priceSummary = phoneStream.collect(
//                Collectors.groupingBy(Phone_collect_g::getCompany,
//                        Collectors.summarizingInt(Phone_collect_g::getPrice)));
//        for (Map.Entry<String, IntSummaryStatistics> item : priceSummary.entrySet()) {
//            System.out.println(item.getKey() + " - " + item.getValue().getAverage());
//        }
        //mapping
        Map<String, List<String>> phonesByCompany = phoneStream.collect(
                Collectors.groupingBy(Phone_collect_g::getCompany,
                        Collectors.mapping(Phone_collect_g::getName,Collectors.toList())));
        for(Map.Entry<String,List<String>> name : phonesByCompany.entrySet()){
            System.out.println(name);
        }
    }
}

class Phone_collect_g {
    private String name;
    private String company;
    private int price;

    public String getName() {
        return name;
    }
    public String getCompany() {
        return company;
    }
    public int getPrice() {
        return price;
    }

    public Phone_collect_g(String name, String company, int price) {
        this.name = name;
        this.company = company;
        this.price = price;
    }
}
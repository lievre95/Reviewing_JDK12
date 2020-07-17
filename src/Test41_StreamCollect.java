import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Test41_Stream_collect {
    public static void main(String[] args) {
        List<String> phones = new ArrayList<String>();
        Collections.addAll(phones, "iPhone", "HTC 12", "Huawei G7", "Nexus", "Xiaomi PRO", "Samsung Galaxy S7");
        List<String> filteredPhones = phones.stream()
                .filter(s -> s.length() < 10)
                .collect(Collectors.toList());
        for (String s : filteredPhones) {
            System.out.println(s);
        }
        Set<String> filteredPhones2 = phones.stream()
                .filter(s -> s.length() < 10)
                .collect(Collectors.toSet());
        System.out.println(filteredPhones2);

        Stream<Phone_collect> phoneStream3 = Stream.of(new Phone_collect("iPhone 6", 300),
                new Phone_collect("Meizu 9", 666),
                new Phone_collect("Samsung Galaxy E4", 689),
                new Phone_collect("LG R6", 558),
                new Phone_collect("Motorolla S7", 657));
        Map<String, Integer> phones3 = phoneStream3.collect(Collectors.toMap(p -> p.getName(), t -> t.getPrice()));

        phones3.forEach((k, v) -> System.out.println(k + " " + v));

        Stream<String> phones_new = Stream.of("iPhone 8", "HTC U12", "Huawei Nexus 6P",
                "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
                "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850");
        HashSet<String> filteredPhones3 = phones_new.filter(s -> s.length() < 12)
                .collect(Collectors.toCollection(HashSet::new));
        filteredPhones3.forEach(s -> System.out.println(s));

        Stream<String> phones_new2 = Stream.of("iPhone 8", "HTC U12", "Huawei Nexus 6P",
                "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
                "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850");
        ArrayList<String> filteredPhones5 = phones_new2.filter(s -> s.length() < 12).collect(
                () -> new ArrayList<String>(),
                (list, item) -> list.add(item),
                (List1, list2) -> list2.addAll(list2));
        filteredPhones5.forEach(s -> System.out.println(s));
    }
}


class Phone_collect {
    private String name;
    private int price;

    public Phone_collect(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
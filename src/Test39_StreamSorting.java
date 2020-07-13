import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.Collections;
import java.util.List;

class Test39_StreamSorting {
    public static void main(String[] args) {
        List<String> phones = new ArrayList<String>();
        Collections.addAll(phones, "iPhoneX", "Nokia5", "Huawei PRO4", "Samsung S5", "LG G5", "Xiaomi MI9");
        phones.stream().filter(p->p.length()<12)
                .sorted()
                .forEach(s-> System.out.println(s));
    }
}

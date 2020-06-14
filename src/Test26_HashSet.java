import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


class Test26_HashSet {
    public static void main(String[] args) {
        Map<Integer, String> states = new HashMap<Integer, String>();
        states.put(1, "Germany");
        states.put(2, "England");
        states.put(3, "France");
        states.put(4, "Italy");
        states.put(5, "Moldova");
        //getting obj with key 2
        String first = states.get(2);
        System.out.println(first);

        //getting all set of keys
        Set<Integer> keys = states.keySet();
        System.out.println(keys);
        //getting all values of set
        Collection<String> values = states.values();
        //replacing element
        states.replace(1, "Poland");
        // removing the element with key 2
        states.remove(2);
        //enumeration of elements
        for (Map.Entry<Integer, String> item : states.entrySet()) {
            System.out.println("Key " + item.getKey() +" "+  item.getValue());
        }
        Map<String, Person_hm> people = new HashMap<String, Person_hm>();
        people.put("1230i15", new Person_hm("Tom"));
        people.put("1230i14", new Person_hm("John"));
        people.put("1230i13", new Person_hm("Jora"));
        people.put("1230i12", new Person_hm("Stas"));

        for (Map.Entry<String, Person_hm> item : people.entrySet()) {
            System.out.println("Key " + item.getKey() +" "+  item.getValue().getName());
        }
    }
}

class Person_hm {
    private String name;

    public Person_hm(String value) {
        name = value;
    }

    String getName() {
        return name;
    }

}






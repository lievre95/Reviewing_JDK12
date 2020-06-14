import java.util.*;
class Person_snt{
    private String name;

    public Person_snt(String value) {
        name = value;
    }

    String getName() {
        return name;
    }


}
class Test26_SortedMap_NavigableMap_TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> states = new TreeMap<Integer, String>();
        states.put(10, "Germany");
        states.put(2, "France");
        states.put(15, "Netherlands");
        states.put(3, "Belgium");
        states.put(4, "Moldova");

        //getting obj with key=2
        String first = states.get(2);
        for(Map.Entry<Integer, String> item: states.entrySet()){
            System.out.println(item.getKey()+ " "+item.getValue());
        }

        //getting all set of keys
        Set<Integer> keys = states.keySet();
        //getting all values
        Collection<String> values = states.values();
        //getting all elements which after obj with key 4
        Map<Integer, String> afterMap = states.tailMap(4);
        //getting all elements which before obj with key 10
        SortedMap<Integer, String> beforeMap = states.headMap(10);
        //getting the last tree's element
        Map.Entry<Integer, String> lastItem= states.lastEntry();
        System.out.println("Last item has key " + lastItem.getKey() + " "+ lastItem.getValue());

        Map<String, Person_snt>people = new TreeMap<String, Person_snt>();
        people.put("123213e21", new Person_snt("Tom"));
        people.put("123213e13", new Person_snt("Bob"));
        people.put("123213e44", new Person_snt("Jora"));

        for(Map.Entry <String, Person_snt> item : people.entrySet()){
            System.out.println("Key " + item.getKey() + " with value " + item.getValue().getName());
        }
    }
}

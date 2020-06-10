import java.util.ArrayList;

class myMainClass20 {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<String>();
        //adding
        people.add("Tom");
        people.add("Bob");
        people.add("Kate");
        people.add("Alice");
        people.add("Jora");
        people.add("Sam");
        people.add(1, "Vasea"); //adding element index 1
        people.set(0, "Ivan");
        String p = people.get(0);
        System.out.println(p);

        // System.out.println(people.get(1));
        people.set(1, "Vadim");
        //System.out.println(people.get(1));
        people.remove("Jora");
        people.remove(1);
        /*     Object[] peopleArray = people.toArray();

        for (Object person : peopleArray) {
            System.out.println(person);
        }*/
        System.out.println("ArrayList has " + people.size() + " elements.");
    }
}

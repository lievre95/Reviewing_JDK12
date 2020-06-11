import java.util.HashSet;

class Test25_HashSet {
    public static void main(String[] args) {
        HashSet<String> states = new HashSet<String>();
        //adding in list the row of elements
        states.add("Germany");
        states.add("France");
        states.add("Great Britain");
        states.add("Italy");

        //trying to add the existing element
        boolean isAdded =states.add("Germany");
        System.out.println(isAdded);

        System.out.println("List has " + states.size() + " elements.");

        for (String s : states) {
            System.out.println(s);
        }
        //checking If element exists
        if (states.contains("Germany")) {
            System.out.println("List contains Germany");
        }

        states.remove("Germany");



        HashSet<Personhs> people = new HashSet<Personhs>(10,0.8f);
        people.add(new Personhs("Mike"));
        people.add(new Personhs("Nick"));
        people.remove("Nick");
        //people.removeAll(people);
        people.add(new Personhs("Jora"));

        //adding and removing an element
        Personhs s1 = new Personhs("Keval");
        people.add(s1);
        people.remove(s1);

        //reinitialize with obj type Personhs the var and adding
        s1 = new Personhs("Demo");
        people.add(s1);

        for (Personhs p : people) {
            System.out.println(p.getName());
        }
    }

    static class Personhs {
        private String name;

        Personhs(String value) {
            name = value;
        }

        String getName() {
            return name;
        }

    }
}

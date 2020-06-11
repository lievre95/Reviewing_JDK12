import java.util.LinkedList;

class Test25_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<String>();
        //adding in list the row of elements
        states.add("Germany");
        states.add("France");
        states.add("Great Britain");
        states.addFirst("Spain");
        states.addLast("Moldova");
        states.add(1, "Italy");

        System.out.println("List has " + states.size() + " elements.");
        System.out.println(states.get(1));
        states.set(1, "Portugal");
        for (String state : states) {
            System.out.println(state);
        }
        //checking If element exists
        if (states.contains("Germany")) {
            System.out.println("List contains Germany");
        }

        states.remove("Germany");
        states.removeFirst();
        states.removeLast();

        LinkedList<Personll> people = new LinkedList<Personll>();
        people.add(new Personll("Mike"));
        people.addFirst(new Personll("Nick"));
        people.addLast(new Personll("Jora"));
        people.remove(1);

        for (Personll p : people) {
            System.out.println(p.getName());
        }


    }

    static class Personll {
        private String name;

        Personll(String value) {
            name = value;
        }

        String getName() {
            return name;
        }

    }
}

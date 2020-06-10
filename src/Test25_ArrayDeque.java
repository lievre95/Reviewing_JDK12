import java.util.ArrayDeque;

class Test25_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> states = new ArrayDeque<String>();
        //standard adding  elements
        states.add("Germany");
        states.add("France");
        states.add("Great Britain");
        states.add("Moldova");
        states.add("Italy");

        //getting the first element without deleting
        String fElement = states.getFirst();
        System.out.println(fElement);

        //getting the last element without deleting
        String lElement = states.getLast();
        System.out.println("Queue size: " + states.size());
        //enumeration of elements
        while (states.peek() != null) {
            System.out.println(states.pop());
        }

//        ArrayDeque<Person_deque> people = new ArrayDeque<Person_deque>();
//        people.addFirst(new Person("Jora"));
//        people.addLast(new Person("Kolea"));
//
//        //enumeration without extraction
//        for(Person p: people){
//            System.out.println(p.getName());

        }
    }
}
//class Person_deque{
//    private String name;
//    public Person_deque(String value){
//        name = value;
//    }
//    String getName(){return name;}
//}

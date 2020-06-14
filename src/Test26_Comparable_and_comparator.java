import java.util.TreeSet;
import java.util.Comparator;

class Test26_Comparable_and_comparator {
    public static void main(String[] args) {

        PersonComparator pcomp = new PersonComparator();
        TreeSet<Person_cc> people = new TreeSet<Person_cc>(pcomp);
        people.add(new Person_cc("Tom"));
        people.add(new Person_cc("Nick"));
        people.add(new Person_cc("Alice"));
        people.add(new Person_cc("Bill"));

        for (Person_cc p : people) {
            System.out.println(p.getName());
        }
    }

    static class Person_cc implements Comparable<Person_cc> {
        private String name;

        Person_cc(String name) {
            this.name = name;
        }

        String getName() {
            return name;
        }

        public int compareTo(Person_cc p){
            return name.length()-p.getName().length();
        }
    }


    static class PersonComparator implements Comparator<Person_cc>{
        public int compare (Person_cc a, Person_cc b){
        return a.getName().compareTo(b.getName());
    }
    }

}





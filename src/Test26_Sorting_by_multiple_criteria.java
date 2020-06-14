import java.util.Comparator;
import java.util.TreeSet;

class Test26_Sorting_by_multiple_criteria {
    static class Person_criteria {
        private String name;
        private int age;

        public Person_criteria(String name, int age) {
            this.name = name;
            this.age = age;
        }

        String getName() {
            return name;
        }

        int getAge() {
            return age;
        }
    }

    static class PersonNameComparator implements Comparator<Person_criteria> {
        public int compare(Person_criteria a, Person_criteria b) {
            return a.getName().compareTo(b.getName());
        }

        static class PersonAgeComparator implements Comparator<Person_criteria> {
            public int compare(Person_criteria a, Person_criteria b) {
                if (a.getAge() > b.getAge()) return 1;
                else if (a.getAge() < b.getAge()) return -1;
                else return 0;
            }
        }


        public static void main(String[] args) {
            Comparator<Person_criteria> pcomp = new PersonAgeComparator().thenComparing(new PersonNameComparator()); //comparing by AGE
            TreeSet<Person_criteria> people = new TreeSet(pcomp);
            people.add(new Person_criteria("Tom", 23));
            people.add(new Person_criteria("Nick", 25));
            people.add(new Person_criteria("Bob", 28));
            people.add(new Person_criteria("Allice", 20));

            for (Person_criteria p : people) {
                System.out.println(p.getName() + "  " + p.getAge());
            }
        }
    }
}






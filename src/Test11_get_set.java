public class Test11_get_set {

    public static void main(String[] args) {

        Person_get_set person_get_set = new Person_get_set("Jora", 34);
        System.out.println(person_get_set.getAge());
        person_get_set.setAge(33);
        System.out.println(person_get_set.getAge());
        person_get_set.setAge(123450);
        System.out.println(person_get_set.getAge());
    }

    static class Person_get_set {
        private String name;
        private int age;

        public Person_get_set(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return this.age;
        }

        public void setAge(int age) {
            if (age > 0 && age < 110) ;
            this.age = age;
        }

    }
}
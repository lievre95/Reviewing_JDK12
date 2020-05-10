package SL.learning;

public class Test2 {
    public static void main(String[] args) {
        Person serghei = new Person("Serghei", 28);
        serghei.display_info();
    }


   static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.age = age;
            this.name = name;
        }

        void display_info() {
            System.out.println("Name: " + name + "\nAge: " + age);
            System.out.printf("Name: %s \nAge: %d",  name, age);
        }
    }
}
public class Test8_constructors{

    public static void main(String[] args) {

        Person undef = new Person();
        undef.displayInfoUndef();

        Person tom = new Person("Tom");
        tom.displayInfo();

        Person sam = new Person("Sam", 25);
        sam.displayInfo();
    }
}
class Person{

    String name;    // имя
    int age;        // возраст
    Person()
    {
        this("Undefined", 18);
    }
    Person(String name)
    {
        this(name, 18);
    }
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
    void displayInfoUndef(){
        System.out.printf("Name: %s\t Age: %d\n", name, age);
    }
}
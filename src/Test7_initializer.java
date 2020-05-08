class Test7_initializer {

    public static void main(String[] args) {

        Person_initializer undef = new Person_initializer();
        undef.displayInfoUndef();

        Person_initializer tom = new Person_initializer("Tom");
        tom.displayInfo();

//            Person sam = new Person("Sam", 25);
//            sam.displayInfo();
    }
}

class Person_initializer {
    String name;    // имя
    int age; // возраст

    //initializer
    {
        name = "Undefined";
        age = 14;
    }
    Person_initializer(){} //creating empty pbj and use above initializer

    Person_initializer(String name) {
        this(name, 18);
    }

    Person_initializer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }

    void displayInfoUndef() {
        System.out.printf("Name: %s\t Age: %d\n", name, age);
    }
}

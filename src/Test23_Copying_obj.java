class Copying_obj {
    private String name;
    private int age;

    Copying_obj(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + " age: " + age);
    }

}

class myMainClass15 {
    public static void main(String[] args) {
        Copying_obj tom = new Copying_obj("Tom", 44);
        tom.display();
        Copying_obj bob = tom;
        bob.setName("Bob");
        tom.display();
    }
}

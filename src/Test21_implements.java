interface Animal {
    public void animalSound();

    public void sleep();// interface method (does not have a body)

    public void displayName(String x);
}

class Pig implements Animal {
    int age;
    String name;

    public void animalSound() {
        System.out.println("The Pig says: wee weee");      //the body is provided here

    }

    public void displayName(String x) {
        System.out.println("Name of Pig is " + name);
    }

    public void sleep() {
        System.out.println("zzzzzzzz");     //the body is provided here
    }


    public Pig(int age, String name) {
        this.age = age;
        this.name = name;
    }


}

class myMainClass {
    public static void main(String[] args) {

        Pig piggy = new Pig(4, "Marina");
        piggy.animalSound();
        piggy.sleep();
        piggy.displayName("Marinka");
    }
}



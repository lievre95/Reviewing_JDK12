public class Test7_jorik {
    public static void main(String args[]) {

        Rabbit jorik = new Rabbit();
        jorik.age = 3;
        jorik.ears_length = 34;
        jorik.color = "red";
        jorik.name = "jorik";
        jorik.display_info();
        jorik.eat();

        Rabbit_mutant alesha = new Rabbit_mutant(4, 5, 6, "alesha", "white");
        alesha.display_info_rabbit_mutant(); // if you change order of alesha.display_info_rabbit_mutant and alesha.eat it will not display alesha.eat
        alesha.eat(); // if you change order of alesha.display_info_rabbit_mutant and alesha.eat it will not display alesha.eat

        Rabbit_mutant krest = new Rabbit_mutant(24, 20, 3, "krest", "yellow");
        krest.display_info_rabbit_mutant();
        krest.eat();

        Rabbit_mutant borea = new Rabbit_mutant(14, 22, "borea", "gray");
        borea.child_rabbit_mutant();
        borea.eat();
    }
}

class Rabbit {
    int age;
    int ears_length;
    String name;
    String color;

    void eat() {
        System.out.println("omnom-mnom");
    }

    void display_info() {
        System.out.println("age:" + age + "; ears_length:" + ears_length + "; color:" + color + "; name:" + name + ";");
    }
}


class Rabbit_mutant {
    int age;
    int ears_length;
    int teeth_length;
    String color;
    String name;

    void eat() {
        System.out.println("omnom-mnommm");
    }

    void display_info_rabbit_mutant() {
        System.out.println("age:" + age + "; ears_length:" + ears_length + "; teeth_length:" + teeth_length + "; color:" + color + "; name:" + name + ";");
    }

    Rabbit_mutant(int age, int ears_length, int teeth_length, String name, String color) {
        this.age = age;
        this.ears_length = ears_length;
        this.teeth_length = teeth_length;
        this.name = name;
        this.color = color;


    }

//    Rabbit_mutant(int ears_length, int teeth_length, String name, String color) {
//        this.age = 1;
//    } // here will be age:1; ears_length:0; teeth_length:0; color:null; name:null;


    Rabbit_mutant(int ears_length, int teeth_length, String name, String color) {
        this.age = 1;
        this.ears_length = ears_length;
        this.teeth_length = teeth_length;
        this.name = name;
        this.color = color;
    }

    void child_rabbit_mutant() {
        System.out.println("age:" + age + "; ears_length:" + ears_length + "; teeth_length:" + teeth_length + "; color:" + color + "; name:" + name + ";");
        System.out.println("Uaaaaa!");
    }

}
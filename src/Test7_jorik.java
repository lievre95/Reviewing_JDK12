public class Test7_jorik {
    public static void main(String args[]) {

        Rabbit jorik = new Rabbit();
        jorik.age = 3;
        jorik.ears_length = 34;
        jorik.color = "red";
        jorik.name = "jorik";

        jorik.eat();
        jorik.display_info();

        Rabbit_mutant pokik = new Rabbit_mutant(2,1,1,"pokik", "black");
        pokik.display_info();
//        Rabbit_mutant lokik = new Rabbit_mutant(3,"Jopa");
//        kokik.display_info();
//        Rabbit_mutant kokik = new Rabbit_mutant(3, 4, 5, "Kokik", "Green");
//        kokik.display_info();
//        Rabbit_mutant pesik = new Rabbit_mutant(3);
//        kokik.display_info();

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


class Rabbit_mutant{
    int age;
    int ears_length;
    int teeth_length;
    String color;
    String name;

    //
//Rabbit_mutant(int age, int ears_length, int teeth_length, String name, String color){
//    this.age = 11;
//    this.ears_length = 12;
//    this.teeth_length = 22;
//    this.name = name;
//    this.color = color;
//
//}

/*    public Rabbit_mutant(String pokik, String black) {
        this(1, 1, 1, pokik,  black);
    }*/

    void display_info() {
        System.out.println("age:" + age + "; ears_length:" + ears_length + "; teeth_length:"+ teeth_length + "; color:" + color + "; name:" + name + ";");
    }


    Rabbit_mutant(int age, int ears_length, int teeth_length, String name, String color){
        this.age = age;
        this.ears_length = ears_length;
        this.teeth_length = teeth_length;
        this.name = name;
        this.color = color;
    }
//    Rabbit_mutant(int ears_length, String name){
//        this(2, 2, int ears_length, String name, "Blue");
//    }
//    Rabbit_mutant(int teeth_length){
//        this(1, 3, int teeth_length, "Kisik", "Green");
//    }
//    Rabbit_mutant(String name){
//        this(3, 3, 5, String name, "Purple-x");
//    }
}

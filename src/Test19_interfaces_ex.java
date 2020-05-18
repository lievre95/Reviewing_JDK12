class Test19_interfaces_ex{

    public static void main(String[] args) {

        Printable1 printable = new Book1("Java. Complete Reference", "H. Shildt");
        printable.print();      //  Java. Complete Reference (H. Shildt)
        printable = new Journal1("Foreign Policy");
        printable.print();      // Foreign Policy
    }
}
interface Printable1{

    void print();
}
class Book1 implements Printable1{

    String name;
    String author;

    Book1(String name, String author){

        this.name = name;
        this.author = author;
    }

    public void print() {

        System.out.printf("%s (%s) \n", name, author);
    }
}
class Journal1 implements Printable1 {

    private String name;

    String getName(){
        return name;
    }

    Journal1(String name){

        this.name = name;
    }
    public void print() {
        System.out.println(name);
    }
}






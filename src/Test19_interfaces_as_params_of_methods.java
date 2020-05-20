//interfaces could be used as a type of methods parameters or as return type
interface Printable19 {
    void print();
}

class Book19 implements Printable19 {
    String name;
    String author;

    Book19(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void print() {
        System.out.println("Name:" + name + "; \nAuthor:" + author);
    }
}

class Journal19 implements Printable19 {
    private String name;

    String getName() {
        return name;
    }

    Journal19(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }

}

class Test19_interfaces_as_params_of_methods {

    public static void main(String[] args) {
        Printable19 printable19 = createPrintable("Foreign Affairs", false);
        //as a param comes obj of interface and thereby we can put in obj Book and Journal        read(new Book19("Java for cooking a soup", "Liebe Freung"));
        read(new Journal19("Wow, Vogue Journal"));
    }

    static void read(Printable19 p) {
        p.print();
    }

    // Due to obj Printable we can return Book or Journal
    static Printable19 createPrintable(String name, boolean option) {
        if (option) return new Book19(name, "Undefined");
        else return new Journal19(name);
    }
}

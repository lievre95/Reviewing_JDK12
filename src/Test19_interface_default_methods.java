class Test19_interface_default_methods {

    public static void main(String[] args) {
        Printable_default ivv = new Journal_default("John");
        ((Journal_default)ivv).print();
        Printable_static.read();
    }
}

interface Printable_default {

    default void print() {
        System.out.println("Undefined printable");
    }
}


class Journal_default implements Printable_default {
    private String name;

    String getName() {
        return name;
    }

    Journal_default(String name) {
        this.name = name;
    }

}

interface Printable_static{
    void print();


    static void read(){
        System.out.println("Read printable");
    }
}

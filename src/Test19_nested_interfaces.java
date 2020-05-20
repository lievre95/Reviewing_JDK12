//Nested interfaces

class Printer {
    interface Printable {
        void print();
    }
}

class Journal_nested implements Printer.Printable {
    String name;

    Journal_nested(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }

}

class Test19_nested_interfaces {

    public static void main(String[] args) {
        Printer.Printable p = new Journal_nested("Foreign Affairs");
        p.print();
    }
}

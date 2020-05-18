class Test19_interfaces {
    public static void main(String[] args) {

//        Printable printable = new Book("Java.Complete Reference", "H.Smildt");
//        printable.print();
//        printable.read();
//        Journal journal
//        printable = new Journal("TEST gg");
//        printable.print();
//        printable.read();
//       -----
        Printable p = new Journal("Foreign Affairs");
        p.print();
        //  Interface has no method getName(), an explicit cast is required
        String name = ((Journal)p).getName();
        System.out.println(name);

    }
}

interface Printable {
    void print();
//        void read();
}

     class Book implements Printable {
        String name;
        String author;

        Book(String name, String author) {
            this.name = name;
            this.author = author;
        }

        public void print() {
            System.out.println("Name:" + name + "; Author:" + author);
        }


//        public void read() {
//            System.out.println("BLA BLA BLA");
//        }
    }

    class Journal implements Printable {
        private String name;

        String getName(){
            return name;
        }
        Journal(String name){
            this.name = name;
        }
        public void print(){
            System.out.println(name);
        }
//        public void read() {
//            System.out.println("BLA BLA BLA");
//        }
    }














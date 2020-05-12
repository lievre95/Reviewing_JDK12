public class Test12_static {

    public static void main(String[] args) {
        Person_static tom = new Person_static();
        Person_static bob = new Person_static();

        tom.displayId();
        bob.displayId();
        System.out.println(Person_static.counter);

        Person_static.counter = 5;

        Person_static sam = new Person_static();
        sam.displayId();
        Person_static boba = new Person_static();
        boba.displayId();

    }


    static class Person_static {
        private int id;
        static int counter = 1;

        Person_static() {
            id = counter++;
        }

        public void displayId() {
            System.out.println("Id:" + id);
        }
    }

}
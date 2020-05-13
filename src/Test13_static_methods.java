class Test12_static_methods {

    public static void main(String[] args) {
        Test12_static_person.display_Counter();//1

        Test12_static_person jorje = new Test12_static_person();
        Test12_static_person anna = new Test12_static_person();

        Test12_static_person.display_Counter();//3


    }
}

class Test12_static_person {
    private int id;
    private static int counter = 1;

    Test12_static_person() {
        id = counter++;
    }

    public static void display_Counter() {
        System.out.println("Counter: " + counter);
    }

    public void displayId() {
        System.out.println("Id: " + id);
    }
}
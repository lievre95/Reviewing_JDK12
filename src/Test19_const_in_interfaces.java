class Test19_const_in_interfaces {

    public static void main(String[] args) {
        Stealable pipe = new Waterpipe();
        pipe.printState(1);
    }
}

interface Stealable {
    int OPEN = 1;
    int CLOSED = 0;

    void printState(int n);

}

class Waterpipe implements Stealable {

    public void printState(int n) {
        if (n == OPEN) {
            System.out.println("Water is opened");
        } else if (n == CLOSED) {
            System.out.println("Water is closed");
        } else System.out.println("State is invalid");
    }

}

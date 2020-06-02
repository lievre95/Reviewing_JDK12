interface FirstInterface {
    public void myMethod();
}

interface SecondInterface {
    public void myOtherMethod();
}

//DemoClass "implements" FirstInterface and SecondInterface
class DemoClass implements FirstInterface, SecondInterface {

    public void myMethod() {
        System.out.println("gg");
    }

    public void myOtherMethod() {
        System.out.println("aa");
    }
}

class myMainClass1 {
    public static void main(String[] args) {
        DemoClass democlass = new DemoClass();
        democlass.myMethod();
        democlass.myOtherMethod();

    }
}



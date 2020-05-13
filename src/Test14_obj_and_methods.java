class Test14_obj_and_methods {

    public static void main(String[] args) {
        Person_obj kate = new Person_obj("Kate");
        System.out.println(kate.getName());
        changeName(kate);
        System.out.println(kate.getName());
    }

    static void changeName(Person_obj po) {
        po.setName("Alice");
    }
}

//when no changes in the state of the class it my might be static
//methods use just params, great=)

class Person_obj {
    private String name;

    Person_obj(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
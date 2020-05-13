class Test14_recreation_obj_and_methods {

    public static void main(String[] args) {
        Person_reobj kate = new Person_reobj("Kate");
        System.out.println(kate.getName());
        changePerson(kate);
        System.out.println(kate.getName()); // Kate - изменения не произошло
        // kate хранит ссылку на старый объект

    }

    static void changePerson(Person_reobj pro) {
        pro = new Person_reobj("Alice"); // p указывает на новый объект
        pro.setName("Ann");
    }
}

class Person_reobj {
    private String name;

    Person_reobj(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
public class Test16_dynamic_metods_dispatch_ex{

    public static void main(String[] args) {

        Person_dispatch_ex tom = new Person_dispatch_ex("Tom");
        tom.display();
        Person_dispatch_ex sam = new Employee_dispatch("Sam", "Oracle");
        sam.display();
    }
}
class Person_dispatch_ex {

    private String name;

    public String getName() { return name; }

    public Person_dispatch_ex(String name){

        this.name=name;
    }

    public void display(){

        System.out.printf("Person %s \n", name);
    }
}

class Employee_dispatch extends Person_dispatch_ex {

    private String company;

    public Employee_dispatch(String name, String company) {

        super(name);
        this.company = company;
    }

    @Override
    public void display() {

        System.out.printf("Employee %s works in %s \n", super.getName(), company);
    }
}
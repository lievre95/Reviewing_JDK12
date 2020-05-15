class Test16_dynamic_metods_dispatch {
    public static void main(String[] args) {


        Employee_dispatcher ivan = new Employee_dispatcher("Ivan", "Amazon");
        ivan.display();
        Person_dispatcher tom = new Person_dispatcher("Tom");
        tom.display();
    }

    }

class Person_dispatcher{
    private String name;
    public String getName(){ return name; }
    public Person_dispatcher(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("Person name: " + name);
    }
}



    class Employee_dispatcher extends Person_dispatcher{
    private String company ;

    public Employee_dispatcher( String name, String company){
        super(name);
        this.company = company;
    }
    @Override
        public void display(){
        System.out.println("Employee " + super.getName() + " works in " + company);
    }


    }














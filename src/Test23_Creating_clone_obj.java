class Clone_Person implements Cloneable{
    private String name;
    private int age;

    Clone_Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    void display(){
        System.out.println("Name: "+ name + " with age: " + age);
    }
    public Clone_Person clone() throws CloneNotSupportedException{
        return (Clone_Person) super.clone();
    }
}


//Not fill cloning
class myMainClass16 {
    public static void main(String[] args) {
        try {
            Clone_Person tom = new Clone_Person("Tom", 18);
            Clone_Person bob = tom.clone();
            bob.setName("Bob");
            tom.display();
        }catch(CloneNotSupportedException ex){
            System.out.println("Cloneable is not implemented");
        }
    }
}

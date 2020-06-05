import org.w3c.dom.ls.LSOutput;

class PersonObj {
    private String name;

    public PersonObj(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person " + name;
    }
    public int hashCode(){
        return 10 * name.hashCode()+2000;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof PersonObj)) return false;
        PersonObj p = (PersonObj)obj;
        return this.name.equals(p.name);
    }
}

class myMainClass4 {
    public static void main(String[] args) {
        PersonObj tom = new PersonObj("Tom");
        PersonObj bob = new PersonObj("Bob");
        System.out.println(tom.equals(bob));
        PersonObj tom2 = new PersonObj("Tom");
        System.out.println(tom.equals(tom2));
        System.out.println(tom.toString());
        System.out.println(tom.hashCode());
    }
}

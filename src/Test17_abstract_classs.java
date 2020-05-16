import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class Test17_abstract_classs {
    public static void main(String[] args) {

        Employee_abstract jora = new Employee_abstract("Jora", "MTEAM");
        jora.display();
        Person_abstract john = new Client_abstract("John", "MTEAM");
        john.display();


    }

    static abstract class Person_abstract {
        private String name;

        public String getName() {
            return name;
        }

        public Person_abstract(String name) {
            this.name = name;
        }

        public abstract void display();
    }

    static class Employee_abstract extends Person_abstract {
        private String bank;

        public Employee_abstract(String name, String company) {
            super(name);
            this.bank = company;
        }

        public void display() {
            System.out.println("Employee name: " + super.getName() + ";\t Bank: " + bank);
        }
    }

    static class Client_abstract extends Person_abstract {
        private String bank;

        public Client_abstract(String name, String company) {
            super(name);
            this.bank = company;
        }

        public void display() {
            System.out.println("Client name:" + super.getName() + ";\t Bank:  " + bank);
        }

    }
}










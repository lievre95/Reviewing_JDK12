class Test18_type_conversion_and_inheritance_hierarchy {
    public static void main(String[] args) {

        //UP
//        Person_conversion tom = new Person_conversion("Tom");
//        tom.display();
//        Person_conversion sam = new Employee_conversion("Sam", "Oracle");
//        sam.display();
//        Person_conversion bob = new Client_conversion("Bob", "DeutscheBank", 3000);
//        bob.display();

        //DOWN
        Object tommy = new Employee_conversion("Tom", "Microsoft");
        Employee_conversion emp = (Employee_conversion)tommy;
        emp.display();


        Object sammy = new Employee_conversion("Sam", "Oracle");
        if (sammy instanceof Employee_conversion){
            ((Employee_conversion)sammy).display();
        } else {
            System.out.println("Conversion is invalid");
        }

        Object katy = new Client_conversion("Kate", "DeutscheBank", 2000);
        ((Person_conversion)katy).display();


//        Person_conversion boby = new Client_conversion("Bob", "DeutscheBank", 3000);
        Person_conversion alisca = new Employee_conversion("Alice", "Google");
        if (alisca instanceof Client_conversion){
            ((Employee_conversion)alisca).display();
        } else {
            System.out.println("Conversion is invalid"+alisca);
        }


    }

    static class Person_conversion {
        private String name;

        public String getName() {
            return name;
        }

        public Person_conversion(String name) {
            this.name = name;
        }

        public void display() {
            System.out.println("Person: " + name);
        }
    }

    static class Employee_conversion extends Person_conversion {
        public String company;


        public Employee_conversion(String name, String company) {
            super(name);
            this.company = company;
        }

        public String getCompany() {
            return company;
        }

        public void display() {
            System.out.println("Employee: " + super.getName() + "; Company: " + getCompany());
        }
    }

        static class Client_conversion extends Person_conversion {
            private int sum;
            private String bank;

            public Client_conversion(String name, String bank, int sum) {
                super(name);
                this.bank = bank;
                this.sum = sum;
            }

            public void display() {
                System.out.println("Client: " + super.getName() + "; Company: " + bank);
            }

            public String getBank() {
                return bank;
            }

            public int getSum() {
                return sum;
            }
        }

}













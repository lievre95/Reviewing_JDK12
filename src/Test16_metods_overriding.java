class Test16_metods_overriding {
    public static void main(String[] args) {
        Employee_overriding marina = new Employee_overriding("Marina", "Amazon");
        marina.display();

    }

    static class Person_overriding {
        String name;

        public String getName() {
            return name;
        }

        public Person_overriding(String name) {
            this.name = name;
        }

        public void display() {
            System.out.println("Name: " + name);
        }
    }


    static class Employee_overriding extends Person_overriding {
        private String company;

        public Employee_overriding(String name, String company) {

            super(name);
            this.company = company;

        }

        @Override
        public void display() {
           super.display();
           System.out.println("Company: " + company);
        }
    }


}










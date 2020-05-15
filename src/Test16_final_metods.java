class Test16_final_metods {
    public static void main(String[] args) {
        Employee_overriding1 marina = new Employee_overriding1("Marina", "Amazon");
        marina.display();

    }

    static class Person_overriding1 {
        String name;

        public String getName() {
            return name;
        }

        public Person_overriding1(String name) {
            this.name = name;
        }

        public final void display() {
            System.out.println("Name: " + name);
        }
    }


    static class Employee_overriding1 extends Person_overriding1 {
        private String company;

        public Employee_overriding1(String name, String company) {

            super(name);
            this.company = company;

        }

        /*We have final because of that we can not override the method display()*/
//        @Override
//        public void display() {
//           super.display();
////           System.out.println("Company: " + company);
//        }
    }


}










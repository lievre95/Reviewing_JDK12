class Test15_inheritance {
    public static void main(String[] args) {
        Employee_inheritance tom = new Employee_inheritance("Tom", "Google");
        tom.display();
        tom.work();
    }

    static class Person_inheritance {
        private String name;

        public String getName() {
            return name;
        }

        public Person_inheritance(String name) {
            this.name = name;
        }

        public void display() {
            System.out.println("Name:" + name);
        }
    }


    static class Employee_inheritance extends Person_inheritance {
        private String company;

        Employee_inheritance(String name, String company) {
            super(name);
            this.company = company;
        }

        public void work() {
            System.out.println("Employee " + getName() + " works in company: " + company);
        }
    }
}










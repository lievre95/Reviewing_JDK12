
//import static java.lang.System.*;

class Test_static_access_modifiers {
    public static void main(String[] args) {
        Person jora = new Person("jora", 24, "Sadoveanu,44", "99999997");

        jora.display_name();
        jora.display_age();
        jora.display_phone();
        jora.display_address();

        System.out.println(jora.name);
        System.out.println(jora.age);
        System.out.println(jora.address);
        System.out.println(jora.phone);
//        jora.display_address();  // ! Ошибка, метод private
//        System.out.println(jora.phone);   // ! Ошибка, модификатор private
    }


      static class Person {

        String name;
        protected int age;
        public String address;
        private String phone;

        public Person(String name, int age, String address, String phone) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.phone = phone;
        }


        public void display_name() {
            System.out.println("Name: " + name);
        }

        void display_age() {
            System.out.println("Age: " + age);
        }

        private void display_address() {
            System.out.println("Address:" + address);
        }

        protected void display_phone() {
            System.out.println("Phone:" + phone);
        }
    }

}
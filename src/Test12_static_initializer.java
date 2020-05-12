class Test12_static_initilizer {

    public static void main(String[] args) {
        Person_initilizer tom = new Person_initilizer();
        Person_initilizer jorj = new Person_initilizer();

        tom.display_id();
        jorj.display_id();
    }

}
class Person_initilizer{
        private int id;
        static int counter;



    static{
            counter = 105;
            System.out.println("Static initializer");
        }
    Person_initilizer(){
            id = counter++;
            System.out.println("Constructor");

        }
        public void display_id(){
            System.out.println("Id:" + id);
        }
}





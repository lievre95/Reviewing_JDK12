class Test14_nested_classes {

    public static void main(String[] args) {
        NestedPersonClass tom = new NestedPersonClass("Tom", "qwerty");
        tom.displayPerson();
        tom.account.displayAccount();
    }
}

class NestedPersonClass {
    private String name;
    Account account;

    NestedPersonClass(String name, String password) {
        this.name = name;
        account = new Account(password);
    }

    public void displayPerson() {
        System.out.println("Name: " + name + "\tAccount: " + account);
    }


    public class Account {
        private String password;

        Account(String pass) {
            this.password = pass;
        }


        public void displayAccount() {
            System.out.println("Name: " + NestedPersonClass.this.name + "\tPassowrd: " + password);
        }

    }


}


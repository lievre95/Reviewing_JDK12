class Test14_nested_classes_context {

    public static void main(String[] args) {
        NestedPersonClassContext tom = new NestedPersonClassContext("Tom");
        tom.setAccount("qwerty");

    }
}

class NestedPersonClassContext {
    private String name;

    NestedPersonClassContext(String name) {
        this.name = name;
    }

    public void setAccount(String password) {

        class Account {

            void display_acc() {
                System.out.println("Name: " + name + "\tpassword: "+ password);
            }
        }


        Account account = new Account();
        account.display_acc();

    }
}
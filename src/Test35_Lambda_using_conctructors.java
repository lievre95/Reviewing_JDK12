interface UserBuilder {
    User_l create(String name);
}

class User_l {
    private String name;

    String getName() {
        return name;
    }

    User_l(String n) {
        this.name = n;
    }
}

class Test35_Lambda_using_conctructors {

    public static void main(String[] args) {
        UserBuilder newUser = User_l::new;
        User_l user = newUser.create("Tom");
        System.out.println(user.getName());

    }
}


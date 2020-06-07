class Account_gdc {
    private String _name;

    String getName() {
        return _name;
    }

    Account_gdc(String name) {
        _name = name;
    }
}

class DepositAccount_gdc<T, Integer> extends Account_gdc {
    private T _id;

    T getId() {
        return _id;
    }


    DepositAccount_gdc(String name, T id) {
        super(name);
        _id = id;
    }
}

class myMainClass13 {
    public static void main(String[] args) {
        DepositAccount_gdc dAccount = new DepositAccount_gdc("Jora", 5550);
        System.out.println("Name: " + dAccount.getName() + " with id: " + dAccount.getId());
    }
}

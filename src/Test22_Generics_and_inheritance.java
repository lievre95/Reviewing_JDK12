class Account_gi<T> {
    private T _id;

    T getId() {
        return _id;
    }

    Account_gi(T id) {
        _id = id;
    }
}

class DepositAccount<T, S> extends Account_gi<T> {
    private S _name;

    S getName() {
        return _name;
    }

    DepositAccount(T id, S name) {
        super(id);
        this._name = name;
    }
}


class myMainClass11 {
    public static void main(String[] args) {
        DepositAccount<Integer, String> dAccount1 = new DepositAccount(20, "Tom");
        System.out.println(dAccount1.getId() + " : " + dAccount1.getName());
        DepositAccount<String, Integer> dAccount2 = new DepositAccount("333", 51585);
        System.out.println(dAccount2.getId() + " : " + dAccount2.getName());

    }
}

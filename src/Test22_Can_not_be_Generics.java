class Can_not_be_generics<T> {
    private T _id;

    T getId() {
        return _id;
    }

    Can_not_be_generics(T id) {
        _id = id;
    }
}

class DepositAccount_cbg extends Can_not_be_generics<Integer> {
    DepositAccount_cbg() {
        super(5);
    }
}

class myMainClass12 {
    public static void main(String[] args) {
        DepositAccount_cbg dAccount = new DepositAccount_cbg();
        System.out.println(dAccount.getId());
    }
}

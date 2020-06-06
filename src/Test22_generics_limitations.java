class Transaction<T extends Account_l> {
    private T from;
    private T to;
    private int sum;

    public Transaction(T from, T to, int sum) {
        this.from = from;
        this.to = to;
        this.sum = sum;
    }

    public void execute() {
        if (from.getSum() > sum) {
            from.setSum(from.getSum() - sum);
            to.setSum(to.getSum() + sum);
            System.out.println("Account_id " + from.getId() + " transferred " + sum + " to Account_id " + to.getId());
        } else {
            System.out.println("Operation is invalid");
        }
    }
}

class Account_l {
    private String id;
    private int sum;

    public Account_l(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public String getId(){return id;}

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}

class myMainClass10 {
    public static void main(String[] args) {
        Account_l acc = new Account_l("3223", 30000);
        Account_l acc2 = new Account_l("4443", 3004);

        Transaction<Account_l> tran1 = new Transaction<Account_l>(acc, acc2, 4000);
        tran1.execute();
        tran1 = new Transaction<Account_l>(acc, acc2, 3333);
        tran1.execute();
    }
}


class Acc_bank<T>{
    private T id;
    private int sum;
    Acc_bank(T id, int sum){
        this.id = id;
        this.sum = sum;
    }
    public Object getId(){return id;}
    public int getSum(){return sum;}
    public void setSum(int sum){this.sum = sum;}
}
class myMainClass5 {
    public static void main(String[] args) {
        Acc_bank acc1 = new Acc_bank<Integer>(2345, 5000);

        int accId =(int)acc1.getId();
        System.out.println(accId);
        Acc_bank acc2 = new Acc_bank<String>("sid4564", 6000);
        System.out.println(acc2.getId());
    }
}

interface Accountable_ge<T>{
    T getId();
    int getSum();
    void setSum(int sum);
}

class Accountable_class_ge implements Accountable_ge<String>{
    private String id;
    private int sum;

    Accountable_class_ge(String id, int sum){
        this.id = id;
        this.sum = sum;
    }
    public String getId(){return id;}
    public int getSum(){return sum;}
    public void setSum(int sum){this.sum= sum;}
}
class myMainClass6 {
    public static void main(String[] args) {
        Accountable_ge<String> acc= new Accountable_class_ge("12345rer", 50000);
        Accountable_class_ge acc2 = new Accountable_class_ge("884f3", 4330);
        System.out.println(acc.getId());
        System.out.println(acc2.getId());

    }
}

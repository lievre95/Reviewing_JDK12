class Converting_gTypes2<T>{
    private T _id;
    T getId(){return _id;}
    Converting_gTypes2(T id){
        _id = id;
    }
}
class DepositAccount_gTypes2<T> extends Converting_gTypes2<T>{
DepositAccount_gTypes2(T id){
    super(id);
}
}
class myMainClass14 {
    public static void main(String[] args) {
DepositAccount_gTypes2<Integer> depAccount = new DepositAccount_gTypes2(32);
Converting_gTypes2<Integer> acc = (Converting_gTypes2<Integer>)depAccount;
        System.out.println(acc.getId());
    }
}

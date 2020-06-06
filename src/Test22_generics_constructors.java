class Generics_constructors{
    private String id;
    private int sum;
    <T>Generics_constructors(T id, int sum){
        this.id = id.toString();
        this.sum = sum;
    }
    public String getId(){return id;}
    public int getSum(){return sum;}
    public void setSum(int sum){this.sum = sum;}

}
class myMainClass9 {
    public static void main(String[] args) {
Generics_constructors acc1 = new Generics_constructors("4518", 5655);
Generics_constructors acc2 = new Generics_constructors(5559,121);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
    }
}

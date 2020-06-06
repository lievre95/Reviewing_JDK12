class Accountge<T, S> {
    private T id;
    private S sum;

    Accountge(T id, S sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public S getSum() {
        return sum;
    }

    public void setSum(S sum) {
        this.sum = sum;
    }
}

class myMainClass8 {
    public static void main(String[] args) {
        Accountge<String, Double> acc1 = new Accountge<String, Double>("352", 55000.8);
        String id = acc1.getId();
        Double sum = acc1.getSum();
        System.out.println(id + " " + sum);
    }
}

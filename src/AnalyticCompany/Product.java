package AnalyticCompany;

public class Product {
    String name;
    String description;
    double price;

    public Product(String name, String desc, double price) {
        this.name = name;
        this.description = desc;
        this.price = price;
    }

    public static double getPriceWithTax(double price) {
        return (double) price * 1.19;
    }

    public String toString() {
        return name + " _ " + description + " _ " + price + " EUR _";
    }

    public static void main(String[] args) {
        Clothes clothes = new Clothes("Gucci", "New Summer-Season", getPriceWithTax(999.99), 12, "Baumwolle");
        System.out.println(clothes);
    }
}


class Clothes extends Product {
    int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    String material;

    public Clothes(String name, String desc, double price, int size, String material) {
        super(name, desc, price);
        this.size = size;
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString() + " size _ " + size + " material _ " + material;
    }

}
package AnalyticCompany;

interface IGadgets {

    void rendering();

    void surfing();

    void hosting();

    void multitasking();

    void calling();

    void сompas();

    void gNetwork();

    void reading();

    void monitoring();

    void modeling();

}

public class Singleton {
    /* Singleton is generating pattern helps to instantiate only one object from a class and optimize access to it  */
    public static void main(String[] args) {
        IGadgets gadget = GadgetsSelector.getInstance().getGadget(Gadgets.PHONE);
        gadget.calling();
        gadget.monitoring();
        gadget.rendering();
        gadget.modeling();
    }
}

enum Gadgets {
    PC,
    NOTEBOOK,
    PHONE
}

interface Copyable {
    Object copy();
}

class GadgetsSelector {
    public static GadgetsSelector instance;

    public static GadgetsSelector getInstance() {
        if (instance == null) {
            instance = new GadgetsSelector();
        }
        return instance;
    }

    private GadgetsSelector() {
    }

    IGadgets getGadget(Gadgets gadgets) {
        IGadgets gadget = null;
        switch (gadgets) {
            case PC:
                gadget = new PC();
                break;
            case NOTEBOOK:
                gadget = new Notebook();
                break;
            case PHONE:
                gadget = new Phone();
                break;
        }
        return gadget;
    }
}

class PC implements IGadgets {
    public void rendering() {
        System.out.println("PC renders...");
    }

    public void surfing() {
        System.out.println("PC is surfing");
    }

    public void hosting() {
        System.out.println("PC hosts a site");
    }

    public void multitasking() {
        System.out.println("PC processes multitasking");
    }

    @Override
    public void calling() {

    }

    @Override
    public void сompas() {

    }

    @Override
    public void gNetwork() {

    }

    @Override
    public void reading() {

    }

    @Override
    public void monitoring() {

    }

    @Override
    public void modeling() {

    }
}

class Phone implements IGadgets {
    public void calling() {
        System.out.println("Phone calls");
    }

    @Override
    public void rendering() {

    }

    public void surfing() {
        System.out.println("Phone is surfing");
    }

    @Override
    public void hosting() {

    }

    @Override
    public void multitasking() {

    }

    public void сompas() {
        System.out.println("The phone shows the parts of the world");
    }

    public void gNetwork() {
        System.out.println("Phone used 5G-Network");
    }

    @Override
    public void reading() {

    }

    @Override
    public void monitoring() {

    }

    @Override
    public void modeling() {

    }
}

class Notebook implements IGadgets {
    public void reading() {
        System.out.println("Notebook reads");
    }

    @Override
    public void rendering() {

    }

    public void surfing() {
        System.out.println("Notebook is surfing");
    }

    @Override
    public void hosting() {

    }

    @Override
    public void multitasking() {

    }

    @Override
    public void calling() {

    }

    @Override
    public void сompas() {

    }

    @Override
    public void gNetwork() {

    }

    public void monitoring() {
        System.out.println("Notebook is monitoring");
    }

    public void modeling() {
        System.out.println("Notebook is modeling");
    }
}

class Human implements Copyable {
    int age;
    String name;

    public Human(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Human [age = " + age + ", name = " + name + "]";
    }

    public Object copy() {
        Human copy = new Human(this.age, this.name);
        return copy;
    }
}
class Test12_static_initializer {

    public static void main(String[] args) {
        double radius = 60;
        System.out.println("Radius: "+ radius);
        System.out.println("Area: " + Math.PI * radius);
        }
}
class Math {public static final double PI = 3.14;}
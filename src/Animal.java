//import java.util.Scanner;
//
//public class Animal {
//    public static final double FAVNUMBER= 1.6180;
//    private String name;
//    private int weight;
//    private boolean hasOwner = false;
//    private byte age;
//    private long uniqueID;
//    private char favouriteChar;
//    private double speed;
//    private float height;
//    protected static int numberOfAnimals = 0;
//
//    static Scanner userInput =new Scanner(System.in);
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getWeight() {
//        return weight;
//    }
//
//    public void setWeight(int weight) {
//        this.weight = weight;
//    }
//
//    public boolean isHasOwner() {
//        return hasOwner;
//    }
//
//    public void setHasOwner(boolean hasOwner) {
//        this.hasOwner = hasOwner;
//    }
//
//    public byte getAge() {
//        return age;
//    }
//
//    public void setAge(byte age) {
//        this.age = age;
//    }
//
//    public long getUniqueID() {
//        return uniqueID;
//    }
//
//    public void setUniqueID(long uniqueID) {
//        this.uniqueID = uniqueID;
//        System.out.println("Unique ID set to: " + this.uniqueID);
//    }
//    public void setUniqueID() {
//        long minNumber = 1;
//        long maxNumber=1000000;
//        this.uniqueID = minNumber +(long)(Math.random() *(maxNumber - minNumber)+1);
//    }
//
//    public char getFavouriteChar() {
//        return favouriteChar;
//    }
//
//    public void setFavouriteChar(char favouriteChar) {
//        this.favouriteChar = favouriteChar;
//    }
//    public void setFavouriteChar() {
//        int randomNumber= (int)(Math.random()*126) +1;
//        this.favouriteChar = (char) randomNumber;
//
//        if(randomNumber ==32 ){
//            System.out.println("Favourite character set to space");
//        } else if (randomNumber==10){
//            System.out.println("Favourite character set to NewLine");
//        }
//        if(( randomNumber > 97 )&&( randomNumber < 122 )){
//            System.out.println("Favourite character is lowercase letter");
//        }
//        if(( randomNumber > 97 )&&( randomNumber < 122 ) ||( randomNumber > 64 )&& ( randomNumber < 91 )){
//            System.out.println("Favourite character is letter");
//        }
//        int whichIsBigger =  (50 > randomNumber) ? 50 : randomNumber;
//        switch (randomNumber) {
//            case 8:
//                System.out.println("Favourite character is set to backspace");
//                break;
//            case 10:
//            case 11:
//            case 12:
//                System.out.println("Favourite character is set to backspace");
//                break;
//            default:
//                System.out.println(randomNumber);
//                break;
//        }
//
//
//    }
//
//    public double getSpeed() {
//        return speed;
//    }
//
//    public void setSpeed(double speed) {
//        this.speed = speed;
//    }
//
//    public float getHeight() {
//        return height;
//    }
//
//    public void setHeight(float height) {
//        this.height = height;
//    }
//
//    public Animal(){
//        numberOfAnimals++;
//
//        int sumOfNumber = 5+1;
//        System.out.println("5+1= " +sumOfNumber );
//
//        System.out.println("Enter the number:");
//        if(userInput.hasNextLine()){
//            this.setName(userInput.nextLine());
//        }
//        this.setUniqueID();
//        this.setFavouriteChar();
//
//    }
////        protected static void countTo(int startingNumber){
////        for(int i = startingNumber; i <= 100; i ++){
////            if(i==90) continue;
////            System.out.println(i);
////        }
////        protected static String printNumbers(int maxNumbers){
////            int i = 1;
////                while (i < (maxNumbers / 2)) {
////                    System.out.println(i);
////                    i++;
////
////                    if( i == (maxNumbers/2)) break;
////                }
////                Animal.countTo(maxNumbers/2);
////                return "End of printNumber";
////            }
////
////}
//
//    public static void main(String[] args) {
//        Animal theAnimal = new Animal();
//    }
//
//}

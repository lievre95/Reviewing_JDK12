package OReilly;

public class Q4 {
    public static void main(String[] args) {
        var s1 = "Java";
        var s2 = "Java";
        var s3 = "Ja".concat("va");
        var s4 = s3.intern();
        var sb1 = new StringBuilder();
        sb1.append("Ja").append("va");

        System.out.println(s1 == s2);   //1 reference the same s1 == s2
        System.out.println(s1.equals(s2));  //1
        System.out.println(s1 == s3);   //0 concat enforces to create new string
        System.out.println(s1 == s4);   //1 intern reverts the String back to the String pool
        System.out.println(sb1.toString() == s1);   //0 toString() uses a method to compute value. false because it's not from String pool
        System.out.println(sb1.toString().equals(s1));  //1  equals = values of String objects
    }
}

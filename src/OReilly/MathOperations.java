package OReilly;

public class MathOperations {
    public static void main(String[] args) {
//        int monday = 3 + 2.0; //double requires an explicit cast to be assigned to an int
        double tuesday = 5_6L; //long value can be implicitly cast to a double
//        boolean wednesday =  1 > 2 ? !true; //ternary operator missing ":"
        short thuesday = (short)Integer.MAX_VALUE; //implicit cast to a short, and the value will wrap around to fit a short
//        long friday = 8.0L; //cannot use a decimal (.) with the long (L) postfix
//        var saturday = 2_.0; //underscore cannot be used next to a decimal point
    }
}

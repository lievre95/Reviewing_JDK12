import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Test34_String_RegeX {
    public static void main(String[] args) {
        //split
        String text = "I love RegeX, why?";
        String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*");
        for (String word : words) {
            System.out.println(word);
        }

        //matches
        String input = "+12345678911";
        boolean result = input.matches("(\\+*)\\d{11}");
        if (result) {
            System.out.println("It's a phone number");
        } else {
            System.out.println("It's not a phone number!");
        }

        //Pattern
        String input1 = "what's up man";
        boolean found = Pattern.matches("What's up man", input1);
        if (found)
            System.out.println("Match found");
        else
            System.out.println("No Match found");

        //Matcher

        String input2 = "Hello Java, peace";
        Pattern pattern2 = Pattern.compile("Hello Java, peace");
        Matcher matcher = pattern2.matcher(input2);
        boolean found2 = matcher.matches();
        if (found2) System.out.println("Match!");
        else System.out.println("Not Match!");


        //Not full match
        //for understanding that \w as \n is not escape-sequence we use \\w
        String input3 = "Hello Java I love you dear. JavaScript sucks";
        Pattern pattern3 = Pattern.compile("Java(\\w*)");
        Matcher matcher3 = pattern3.matcher(input3);
        while (matcher3.find()) {
            System.out.println(matcher3.group());
        }

        //Replacing the String
        String input4 = "Hello Java! Hello JavaScript! Hello JavaSE 8.";
        Pattern pattern4 = Pattern.compile("Java(\\w*)");
        Matcher matcher4 = pattern4.matcher(input4);
        String newString = matcher4.replaceAll("HTML5");
        System.out.println(newString);

        //Distribution String to token(tokenizing)
        String input5 = "Hello Java! Hello JavaScript! Hello AAAAAAAAAAAA";
        Pattern pattern5 = Pattern.compile("\\s*(\\s|,|!\\.)\\s*");
        String[] words5 = pattern5.split(input5);
        for (String word : words5) {
            System.out.println(word);
        }
    }
}




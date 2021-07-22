package AnalyticCompany;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDamage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validData = true;
        String word = "";
        System.out.print("Please enter a word( damage, minor damages, heavy damage, damages = bonus; the phrase `no damages` is forbidden! )");

        while (validData) {
            try {
                word = scanner.nextLine();
                if (!word.equals("")) {
                    boolean result = damage(word);
                    System.out.println("Your result:" + result);
                }
            } catch (InputMismatchException ex) {
                System.out.println(ex.getMessage());
            }
            if (word.compareToIgnoreCase(" ") == 0 || word.compareToIgnoreCase("-1") == 0) {
                validData = false;
            } else {
                System.out.printf("Enter new word: ");
            }
        }
//        Scanner x = new Scanner(System.in);
//        String str = x.nextLine();
//        boolean result = damage(str);
//        System.out.println(result);
    }

    static boolean damage(String chars) {
        Pattern p = Pattern.compile("he\\w{3,3} damage|mi\\w{3,3} damages|damage\\b|(?![n])(?![o])(?![^\\S])^damages\\b");
        Matcher m = p.matcher(chars);
        boolean b = m.matches();
        return b;
    }

    ;
}

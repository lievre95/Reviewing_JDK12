public class Test33_String {
    public static void main(String[] args) {


        String str1 = "Hello";
        String str2 = "world";
        String str3 = "hell";

        String s = str1 + " " + str2;
        //or
        str_common = str2.concat(str1);
        System.out.println(s);
        System.out.println(str_common);

        String concat_strings = String.join(" ", str2, str1, str3);
        System.out.println(concat_strings);
        //obj to the String

        System.out.println(str.compareTo(str2));
        System.out.println(str.compareTo(str3));

        char c = str.charAt(2);
        System.out.println(c);

        int start = 6;
        int end = 11;

        char[] dst = new char [end - start];
        str.getChar(start, end, dst, 0 );
        System.out.println(dst);
        //comparing Strings
        String te = "Hello";
        String te1 = "hello";

        System.out.println(te1.equals(te));
        System.out.println(te.equalsIgnoreCase(te1));

    }
}



class Test33_String_mastering {
    public static void main(String[] args) {

        //---joining
        String str = "Hello";
        String str2 = "world";
        String str3 = "hell";

        String concat = "Year" + 2015;
        String s = str + " " + str2;
        //or
        String str_common = str2.concat(str);

        System.out.println(s);
        System.out.println(str_common);

        String concat_strings = String.join(" ", str2, str, str3);
        System.out.println(concat_strings);
        //obj to the String

        System.out.println(str.compareTo(str2));
        System.out.println(str.compareTo(str3));

        //Get symbols and substrings
        char c = str.charAt(2);
        System.out.println(c);

        //Comparing strings
        int start = 1;
        int end = 4;

        char[] dst = new char[end - start];
        str.getChars(start, end, dst, 0);
        System.out.println(dst);

        //comparing Strings
        String te = "Hello world";
        String te1 = "I work";

        System.out.println(te1.equals(te));
        System.out.println(te.equalsIgnoreCase(te1));

        boolean result = te.regionMatches(6, te1, 2, 3);
        // Comparing 3 symbols from index 6 "wor"from first String - te, and 3 symbols from string te1
        System.out.println(result);


        String x = "hello";
        String y = "world";
        String w = "hell";
        System.out.println(x.compareTo(y));
        System.out.println(x.compareTo(w));

        //Searching in String
        String string = "Hello Born";
        int index1 = string.indexOf('l');
        int index2 = string.indexOf("Bo");
        int index3 = string.lastIndexOf('l');

        String myfile = "myfile.exe";
        boolean startM = myfile.startsWith("my");
        boolean endM = myfile.endsWith("exe");

        //Replacing in the String
        String strRepl = "Jojo is such a boy! ";
        String replString = strRepl.replace('j', 'd');
        String replString2 = strRepl.replace("a", "lucky");

        //Trimming
        String trimString = "          j           J  ";
        System.out.println(trimString.trim());
        String substr1 = trimString.substring(6);
        String substr2 = trimString.substring(2, 5);
        System.out.println(substr1 + substr2);

        //Changing registry
        System.out.println(trimString.toLowerCase());
        System.out.println(trimString.toUpperCase());

        //Splitting
        String text ="Hey kitty what u doing?";
        String [] words = text.split(" ");
        for(String word : words){
            System.out.println(word);
        }
    }
}



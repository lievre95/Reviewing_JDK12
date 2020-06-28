class Test34_String_buffer {
    public static void main(String[] args) {
    //StringBuffer =  thread safe , synchronized
    // StringBuilder = faster and not thread safe
        String x = "Java";
        StringBuffer strBuffer = new StringBuffer(x);
        System.out.println("Volume:" + strBuffer.capacity());
        strBuffer.ensureCapacity(32);
        System.out.println("Volume:" + strBuffer.capacity());

        System.out.println("Length: "  + strBuffer.length());
        System.out.println(strBuffer.toString());

        //Getting and putting symbols
        char c = strBuffer.charAt(3);
        System.out.println(c);
        strBuffer.setCharAt(0, 'c');
        System.out.println(strBuffer.toString());

        StringBuffer str = new StringBuffer("hello");
        int startIndex = 1;
        int endIndex = 4;
        char[] buffer = new char[endIndex - startIndex];
        strBuffer.getChars(startIndex, endIndex, buffer, 0);
        System.out.println(str);

        //Adding in String
        StringBuffer strBuffer2 = new StringBuffer("iJora");
        strBuffer2.append(" kek");
        System.out.println(strBuffer2.toString());

        strBuffer2.insert(3,'A');
        strBuffer2.insert(0,'B');
        System.out.println(strBuffer2.toString());

        //Deleting the String
        StringBuffer newText = new StringBuffer("assembler");
        newText.delete(0,4);
        System.out.println(newText.toString());

        newText.deleteCharAt(4);
        System.out.println(newText.toString());

        // Trimming the String
        StringBuffer trimmedStr = new StringBuffer("Hello Java");
        String trimmedString1 = trimmedStr.substring(6);
        System.out.println(trimmedString1);

        String trimmedString2 = trimmedStr.substring(3, 8);
        System.out.println(trimmedString2);

        //Changing the length
        StringBuffer strLeng = new StringBuffer("Hey Dowg!");
        strLeng.setLength(5);
        System.out.println(strLeng.toString());

        strBuffer.setLength(4);
        System.out.println(strBuffer.toString());

        //Replacing in String
        StringBuffer replString = new StringBuffer("Hello Germany!");
        replString.replace(5,11,"Java");
        System.out.println(replString.toString());

        //Reverse order in String
        StringBuffer revString = new StringBuffer("Assembler");
        System.out.println(revString.toString());




    }
}



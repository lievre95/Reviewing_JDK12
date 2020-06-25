import java.io.Console;


public class Test32_Console {
    public static void main(String[] args) {
        //get the console
        Console console = System.console();
        if (console != null) {
            //reading data from the console
            String login = console.readLine();
            char[] password = console.readPassword();

            console.printf("Your login is: %s \n", login);
            console.printf("Your password is:  %s \n", new String(password));
        }
    }
}


        /*

        d:\Projects\First\src>"c:\Program Files\Java\jdk-14.0.1\bin\javac" Test32_Console.java
        d:\Projects\First\src>"c:\Program Files\Java\jdk-14.0.1\bin\java" Test32_Console.java


        Variable Name : PATH
        Variable Value : C:\Program Files\Java\jdk1.8.0_31\bin

        But the best practice is to set JAVA_HOME and PATH as follow.

        Variable Name : JAVA_HOME
        Variable Value : C:\Program Files\Java\jdk1.8.0_31

        Variable Name : PATH
        Variable Value : %JAVA_HOME%\bin

        cd PPROJECT/dir
        javac Test32_Console.java
        java Test32_Console

        */
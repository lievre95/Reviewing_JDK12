package com.dogaion.test;
import com.dogaion.factorial.Factorial;
import javax.swing.JOptionPane;
public class Module {
    public static void main(String[] args) {
//JOptionPane.showMessageDialog(null,"Hello boyzz! That's Demo Module");
    int a = 5;
    int b = Factorial.calculate(a);
        System.out.printf("Factorial of %d is equal to %d \n", a,b);
    }
}
//--1
//in d:\Projects\First\src>...
//compiling
//javac demo/module-info.java demo/com/dogaion/test/Module.java
//javac operations/module-info.java operations/com/dogaion/factorial/Factorial.java
//running
//java --module-path demo --module demo/com.dogaion.test.Module
//Hey, boyzz =)

//--2
// -p (--module-path)::where is used modules
// -d where to put compiled module
//javac -d appmodules/operations operations/module-info.java operations/com/dogaion/factorial/Factorial.java
//javac -p appmodules -d appmodules/demo demo/module-info.java demo/com/dogaion/test/Module.java
// -p where is located two compiled modules
//java -p appmodules -m demo/com.dogaion.test.Module
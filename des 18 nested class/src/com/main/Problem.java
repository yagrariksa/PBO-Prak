package com.main;

//import javax.swing.*;
//import javax.swing.JComponent.AccessibleJComponent;

import javax.swing.*;
import java.awt.*;

public class Problem {
    static String s;
    static class Inner {
        void testMethod(){
            s = "set from inner";
        }
    }

    public static void main(String args[]){
//        Inner i = new Inner();
//        i.testMethod();

        new Inner().testMethod();
        System.out.println("s = " + s);

        Main m = new Main(2);
        Main.AccessibleBox a = m.new AccessibleBox();
        Dimension d = new Dimension(100,100);
        new Box.Filler(d,d,d);

//        Main m = new Main(2);
//        Main.AccessibleBox a = m.new AccessibleBox();


    }
}

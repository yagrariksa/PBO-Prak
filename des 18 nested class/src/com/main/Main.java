package com.main;

import javax.accessibility.AccessibleRole;
import javax.swing.*;
import java.awt.*;

public class Main extends Box {
    Box.Filler b;

    public Main(int axis) {
        super(axis);
    }

    public static void main(String[] args) {
        Dimension d = new Dimension(100,100);
        Main m = new Main(2);
        m.b = new Box.Filler(d,d,d);
//        b = new Box.Filler(d,d,d); // cara satu
//        b = new Filler(d,d,d); // cara dua
        // write your code here
//        Filler f = new Filler(
//                new Dimension(100,100),
//                new Dimension(100,100),
//                new Dimension(100,100)
//        );
//
//        new Box.Filler(d,d,d);
    }

    static class Filler extends Box.Filler {
        public Filler(Dimension min, Dimension pref, Dimension max) {
            super(min, pref, max);
        }
    }


    class AccessibleBox extends Box.AccessibleBox {
        protected AccessibleBox() {
            super();
        }

        @Override
        public AccessibleRole getAccessibleRole() {
            return super.getAccessibleRole();
        }
    }


}

package com.main.percobaan8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class X extends Frame {
    public static void main(String args[]){
//        Frame x = new Frame();
//        Label l = new Label("Count = " + count);
//        l.setBounds(50,50, 150,20);
//        Button btn = new Button("Hello " + l);
//        btn.setBounds(50,100,60,30);
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                count++;
//                l.setText("Count : " + (int) count);
//            }
//        });
//        x.add(btn);
//        x.add(l);
//        x.setSize(400,400);
//        x.setLayout(null);
////        x.pack();
//        x.setVisible(true);
        X x = new X();
        x.pack();
        x.setVisible(true);
    }

    public static int count;
    private int c;

    public X(){
        final Label el = new Label("Count = " + c);
        add(el, BorderLayout.SOUTH);
        add(
                new Button("Hello " + 1){
                    {
                        addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent actionEvent) {
                                count++;
                                el.setText("Count = " + count);
                            }
                        });
                    }
                }, BorderLayout.NORTH
        );
    }

}

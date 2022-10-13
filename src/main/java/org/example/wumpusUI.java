package org.example;

import java.awt.*;

import javax.swing.JButton;

import javax.swing.JFrame;



public class wumpusUI{



    public static void main(String[] args) {





        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(500, 500);

        frame.setLayout(new GridLayout(10,10,0,0));





        for(int i=1;i<=100;i++){
            Button button = new Button(Integer.toString(i));

            frame.add(button);
        }


        frame.setVisible(true);

        JFrame frame1 = new JFrame();

        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame1.setSize(500, 500);

        frame1.setLayout(new GridLayout(10,10,0,0));





        for(int i=1;i<=100;i++){
            Button button = new Button(Integer.toString(i));

            frame1.add(button);
        }


        frame1.setVisible(true);



    }

}


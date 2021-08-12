package com.lifelike.dev;
import javax.swing.*;
import java.awt.*;

public class FlowLayoutManager {

    public static void main(String[] args) {

        /* Layout Manager  -  defines the natural layer for components within a container

           FlowLayout      -  places components within a container in a row, sized at their preferred sizes
                              if the available horizontal space becomes limited, the FlowLayout class uses
                              the next available row
        */

        // initializing and setting up frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(480, 420);

        // setting up the FlowLayout in Layout Manager
        frame.getContentPane().setBackground(new Color(0x222222));

        // setting layout and adding alignment
//        frame.setLayout(new FlowLayout());
        frame.setLayout(new FlowLayout(FlowLayout.LEADING));
//        frame.setLayout(new FlowLayout(FlowLayout.TRAILING));
//        frame.setLayout(new FlowLayout(FlowLayout.CENTER));

        // adding buttons to frame
        frame.add(new Button("One"));
        frame.add(new Button("Two"));
        frame.add(new Button("Three"));
        frame.add(new Button("Four"));
        frame.add(new Button("Five"));
        frame.add(new Button("Six"));
        frame.add(new Button("Seven"));
        frame.add(new Button("Eight"));
        frame.add(new Button("Nine"));
        frame.add(new Button("Ten"));

        // setting the visibility of frame
        frame.setVisible(true);

    }
}

class Button extends JButton {
    Button(String name) {
        this.setText(name);
        this.setBackground(new Color(0x102B47));
        this.setForeground(new Color(0xededed));
        this.setFocusable(false);
    }
}
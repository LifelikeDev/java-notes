package com.lifelike.dev;
import javax.swing.*;
import java.awt.*;

public class GridLayouts {

    public static void main(String[] args) {

        // GridLayout  -  places components in a grid of cells
        //                each component takes all the available space within its cell,
        //                and each cell has the same size

        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(480, 420);
        frame.setLayout(new GridLayout(3, 4, 2, 2));

        frame.add(new Button("One"));
        frame.add(new Button("Two"));
        frame.add(new Button("Three"));
        frame.add(new Button("Four"));
        frame.add(new Button("Five"));
        frame.add(new Button("Six"));
        frame.add(new Button("Seven"));
        frame.add(new Button("Eight"));
        frame.add(new Button("Nine"));

        frame.setVisible(true);
    }
}


package com.lifelike.dev;
import javax.swing.*;
import java.awt.*;

public class JFrameGUI {

    public static void main(String[] args) {
        // JFrame  -  A GUI window to which components can be added

        // Creating a JFrame
        // METHOD 1: Instantiating the JFrame class
        // JFrame frame = new JFrame();

        /*
        // Create an image icon for the frame
        ImageIcon icon = new ImageIcon("apple-eco.png");
        // make frame visible
        frame.setVisible(true);
        // set the title of the frame
        frame.setTitle("Testing our first JFrame");
        // close the frame when the x-bar is hit to close the application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set size of the frame
        frame.setSize(540, 420);
        // set color of the frame
//        frame.getContentPane().setBackground(Color.DARK_GRAY);
//        frame.getContentPane().setBackground(new Color(80,80,80));
        frame.getContentPane().setBackground(new Color(0x444444));
        // prevent resizing of the frame
        frame.setResizable(false);
        // change and set image icon
        frame.setIconImage(icon.getImage());
        */

        ProgFrame frame = new ProgFrame();


    }

}

// METHOD 2: Creating a subclass to inherit the JFrame class as its parent
class ProgFrame extends JFrame {

    ProgFrame() {
        // Create an image icon for the frame
        ImageIcon icon = new ImageIcon("apple-eco.png");

        // make frame visible
            this.setVisible(true);
        // set the title of the frame
            this.setTitle("Testing our first JFrame");
        // close the frame when the x-bar is hit to close the application
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set size of the frame
            this.setSize(480, 400);
        // set color of the frame
        //  this.getContentPane().setBackground(Color.DARK_GRAY);
        //  this.getContentPane().setBackground(new Color(80,80,80));
            this.getContentPane().setBackground(new Color(0x444444));
        // prevent resizing of the frame
            this.setResizable(false);
        // change and set image icon
            this.setIconImage(icon.getImage());
    }



}

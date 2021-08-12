package com.lifelike.dev;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleButton {

    public static void main(String[] args) {

        // JButton  -   a button that performs an action when clicked on

        new SomeFrame();
    }
}

class SomeFrame extends JFrame implements ActionListener {

    SomeButton button = new SomeButton();
    JLabel label = new JLabel();


    SomeFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(480, 420);
        this.getContentPane().setBackground(new Color(0x222222));
        this.setLayout(null);
        this.setVisible(true);
        this.add(button);
        this.add(label);
        label.setText("I've been hit");
        label.setBounds(200, 200, 300, 50);
        label.setBackground(new Color(0x923B56));
        label.setForeground(new Color(0xededed));
        label.setVisible(false);
        // add an event listener linked to the frame
        // adding a lambda expression instead of implementing the ActionListener interface,
//        button.addActionListener(e -> System.out.println("You just hit a button"));

        // but the above isn't supported in Language level 6, so
        // we use the old implementation method
        button.addActionListener(this);
    }

    // Listen for events
    @Override
    public void actionPerformed(ActionEvent e) {

        // print something when the button gets clicked
        if(e.getSource() == button) {
            label.setVisible(true);
//            System.out.println("You just hit a button");
        }

    }
}

class SomeButton extends JButton {

    SomeButton() {
        this.setBounds(180, 140, 120, 50);
        this.setBackground(new Color(0x0E2943));
//        this.setVerticalAlignment(JButton.CENTER);
//        this.setHorizontalAlignment(JButton.CENTER);
        this.setText("Click Me");
        this.setFocusable(false);
        this.setForeground(new Color(0xededed));
        this.setBorder(BorderFactory.createEtchedBorder());
//        this.setEnabled(false);
    }
}

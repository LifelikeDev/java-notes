package com.lifelike.dev;
import javax.swing.*;
import java.awt.*;

public class Panels {

    public static void main(String[] args) {
        // JPanel  -  a GUI component that functions as a container for holding other components
        //              components can be added to panels, and panels in turn be added to frames

        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        JPanel redPanel = new JPanel();
        JPanel bluePanel = new JPanel();
        JPanel greenPanel = new JPanel();

        label.setText("some label");

        redPanel.setBackground(new Color(240, 0, 0));
        redPanel.setBounds(0, 0, 180,180);
        bluePanel.setBackground(new Color(0, 0, 255));
        bluePanel.setBounds(0, 180, 180,180);
        greenPanel.setBackground(new Color(0, 255, 0));
        greenPanel.setBounds(180, 0, 180,360);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(650, 540);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(0x3D3D3D));
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
        greenPanel.add(label);




    }
}

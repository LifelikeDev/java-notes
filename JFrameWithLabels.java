package com.lifelike.dev;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JFrameWithLabels {

    public static void main(String[] args) {
        // JLabel  -  a GUI display area for text, image or both
        ImageIcon image = new ImageIcon("vlcsnap.png");
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.green, 1);

        String windowText = "Java is doing the most here. It's the real banger";
        label.setText(windowText);
        // label.setIcon(image);
        // set the text position within the label
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        // change color of label contents
        label.setForeground(new Color(0xeeeeee));
        label.setFont(new Font("Lato", Font.PLAIN, 16));
        label.setBackground(new Color(0x1F1F1F));
        label.setOpaque(true);
        // set border of label
        label.setBorder(border);
        // set the position of content within the label
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

//        frame.setSize(480, 400);
        frame.setTitle("JFrame with Labels");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
//        frame.getContentPane().setBackground(new Color(0x444444));
        frame.add(label);
        // if the frame size is not set, yet it be desired that its content fit the available dimensions,
        // use frame.pack() for the automatic fitting of content
        frame.pack();


    }
}

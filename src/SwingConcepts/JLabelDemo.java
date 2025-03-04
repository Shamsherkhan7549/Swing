package SwingConcepts;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JLabelDemo {
    public  static void main(String[] args){
        // JLabel = a gui component which display area for a String of text, an image or both

        JFrame frame = new JFrame(); //Create Frame

        ImageIcon image2 = new ImageIcon("../images/streakLogo.png");
        frame.setIconImage(image2.getImage());
        Border border = BorderFactory.createLineBorder(Color.green,2); //  set border
        frame.setTitle("JFrame title"); //set title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
//        frame.setResizable(true); //prevent frame from being resized
        frame.setSize(400,400); // set Size of frame

        ImageIcon image = new ImageIcon("../images/smallcaseLogo.png");


        JLabel label = new JLabel(); // Create a label
        label.setText("Hi world"); // Set text of label
        label.setIcon(image); // set icon in label
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER , RIGHT  of ImageIcon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER , BOTTOM  of ImageIcon
        label.setForeground(Color.GREEN); // set font color of text
        label.setForeground(new Color(0x000f0)); // set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN,20)); //set text color and text size and font family
        label.setIconTextGap(20); // set gap of text to image
        label.setBackground(new Color(0,255,0));
        label.setOpaque(true); // Display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical alignment TOP CENTER BOTTOM of text+icon
        label.setHorizontalAlignment(JLabel.CENTER); // SET horizontle alignment LEFT CENTER RIGHT  of text+icon
        // label.setBounds(100,100 ,250, 100); // set x,y position within frame as wll as dimensions

       //frame.setLayout(null);
        frame.add(label);
        frame.setVisible(true);
        frame.pack();
    }
}

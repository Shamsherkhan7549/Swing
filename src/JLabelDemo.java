import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JLabelDemo {
    public  static void main(String[] args){
        // JLabel = a gui component which display area for a String of text, an image or both

        JFrame frame = new JFrame(); //Create Frame

        Border border = BorderFactory.createLineBorder(Color.green,2); //  set border

        frame.setTitle("JFrame title"); //set title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
//        frame.setResizable(true); //prevent frame from being resized
        frame.setSize(400,400); // set Size of frame

        ImageIcon image = new ImageIcon("../images/smallcaseLogo.png");

        JLabel label = new JLabel(); // Create a label
        label.setText("Hi world"); // Set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER , RIGHT  of ImageIcon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER , BOTTOM  of ImageIcon
        label.setForeground(Color.GREEN); // set font color of text
        label.setForeground(new Color(0x000f0)); // set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN,20)); //set text color and text size and font family
        label.setIconTextGap(20); // set gap of text to image
        label.setBackground(new Color(0,155,155));
        label.setOpaque(true); // Display background color
        label.setBorder(border);

        frame.add(label);
        frame.setVisible(true);
    }
}

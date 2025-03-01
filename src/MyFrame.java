import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){

        this.setTitle("JFrame title"); //set title of this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setResizable(false); //prevent this from being resized
        this.setSize(400,400); // set Size of this

        ImageIcon imageIcon = new ImageIcon("../images/smallcaseLogo.png"); //Create an Image Icon
        this.setIconImage(imageIcon.getImage()); // Change icon of this
        this.getContentPane().setBackground(Color.green); // Change the backround color of this
        this.getContentPane().setBackground(new Color(155,55,255));
        this.setVisible(true);
    }
}

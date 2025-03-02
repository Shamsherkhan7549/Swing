import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.*;

public class JPanelDemo {
    public static void main(String[] args){
       // JPanel = a GUI component that function as a container to hold other component

        JLabel label = new JLabel();
        label.setText("hi");
        ImageIcon image = new ImageIcon("../images/smallcaseLogo.png");
        label.setIcon(image);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(new Color(255,0,0));
        redPanel.setBounds(0,0,350, 350);
        redPanel.setLayout(new BorderLayout());
        redPanel.add(label);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(350,0, 350,350);
        bluePanel.setLayout(new BorderLayout());
        //bluePanel.add(label);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,350,700,350);
        greenPanel.setLayout(new BorderLayout()); // this will allow to move component inside the panel
        //greenPanel.add(label);

        JFrame frame = new JFrame(); //Create Frame
        frame.setTitle("JFrame title"); //set title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        //frame.setResizable(false); //prevent frame from being resized
        frame.setSize(750,750); // set Size of frame
        ImageIcon imageIcon = new ImageIcon("../images/smallcaseLogo.png"); //Create an Image Icon
        frame.setIconImage(imageIcon.getImage()); // Change icon of frame
        frame.getContentPane().setBackground(Color.lightGray); // Change the backround color of frame


        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

        frame.setLayout(null);
        frame.setVisible(true);
    }
}

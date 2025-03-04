package SwingConcepts;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    public static void main(String[] args){
        //  Layout Manager:-> Defines the natural layout for component within a container

        // 3 Common Managers
        //BorderLayoutDemo:-> A BorderLayoutDemo places components in five areas: NORTH, SOUTH, WEST, EAST, CENTER
                        // All extra space is places in the center area.

        JFrame  frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLayout(new java.awt.BorderLayout(10,10));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel orangePanel = new JPanel();
        JPanel redPanel = new JPanel();
        JPanel greenPanel = new JPanel();
        JPanel bluePanel = new JPanel();
        JPanel magentaPanel = new JPanel();

        orangePanel.setBackground(Color.orange);
        redPanel.setBackground(Color.red);
        greenPanel.setBackground(Color.green);
        bluePanel.setBackground(Color.blue);
        magentaPanel.setBackground(Color.magenta);

        /*---------------------sub panels-------------------------*/
        JPanel pinkPanel = new JPanel();
        JPanel yellowPanel = new JPanel();
        JPanel grayPanel = new JPanel();
        JPanel lightgrayPanel = new JPanel();
        JPanel whitePanel = new JPanel();

        pinkPanel.setBackground(Color.pink);
        yellowPanel.setBackground(Color.yellow);
        grayPanel.setBackground(Color.gray);
        lightgrayPanel.setBackground(Color.lightGray);
        whitePanel.setBackground(Color.white);

        pinkPanel.setPreferredSize(new Dimension(50,50));
        yellowPanel.setPreferredSize(new Dimension(50,50));
        grayPanel.setPreferredSize(new Dimension(50,50));
        lightgrayPanel.setPreferredSize(new Dimension(50,50));
        whitePanel.setPreferredSize(new Dimension(50,50));

        magentaPanel.setLayout(new java.awt.BorderLayout());

        magentaPanel.add(pinkPanel, java.awt.BorderLayout.NORTH);
        magentaPanel.add(yellowPanel, java.awt.BorderLayout.SOUTH);
        magentaPanel.add(grayPanel, java.awt.BorderLayout.WEST);
        magentaPanel.add(lightgrayPanel, java.awt.BorderLayout.EAST);
        magentaPanel.add(whitePanel, java.awt.BorderLayout.CENTER);

        /*---------------------sub panels----------------------------------*/

        orangePanel.setPreferredSize(new Dimension(100,50));
        redPanel.setPreferredSize(new Dimension(50,100));
        greenPanel.setPreferredSize(new Dimension(100,50));
        bluePanel.setPreferredSize(new Dimension(50,100));
        magentaPanel.setPreferredSize(new Dimension(100,100));


        frame.add(orangePanel, java.awt.BorderLayout.NORTH);
        frame.add(redPanel, java.awt.BorderLayout.WEST);
        frame.add(greenPanel, java.awt.BorderLayout.SOUTH);
        frame.add(bluePanel, java.awt.BorderLayout.EAST);
        frame.add(magentaPanel, java.awt.BorderLayout.CENTER);
       // frame.setLayout(null);
        frame.setVisible(true);
    }

}

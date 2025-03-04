package SwingConcepts;

import javax.swing.*;
import java.awt.*;

public class SwingConcepts {
    public static void main(String[] args){
        //  Layout Manager:-> Defines the natural layout for component within a container

        // 3 Common Managers
        //BorderLayout:-> A BorderLayout places components in five areas: NORTH, SOUTH, WEST, EAST, CENTER
                        // All extra space is places in the center area.

        JFrame  frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout(10,10));
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

        magentaPanel.setLayout(new BorderLayout());

        magentaPanel.add(pinkPanel, BorderLayout.NORTH);
        magentaPanel.add(yellowPanel, BorderLayout.SOUTH);
        magentaPanel.add(grayPanel, BorderLayout.WEST);
        magentaPanel.add(lightgrayPanel, BorderLayout.EAST);
        magentaPanel.add(whitePanel, BorderLayout.CENTER);

        /*---------------------sub panels----------------------------------*/

        orangePanel.setPreferredSize(new Dimension(100,50));
        redPanel.setPreferredSize(new Dimension(50,100));
        greenPanel.setPreferredSize(new Dimension(100,50));
        bluePanel.setPreferredSize(new Dimension(50,100));
        magentaPanel.setPreferredSize(new Dimension(100,100));


        frame.add(orangePanel, BorderLayout.NORTH);
        frame.add(redPanel, BorderLayout.WEST);
        frame.add(greenPanel, BorderLayout.SOUTH);
        frame.add(bluePanel, BorderLayout.EAST);
        frame.add(magentaPanel, BorderLayout.CENTER);
       // frame.setLayout(null);
        frame.setVisible(true);
    }

}

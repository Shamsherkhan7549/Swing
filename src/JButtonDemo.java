import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JButtonDemo extends JFrame{
    public static void main(String[] args){

        ImageIcon imageIcon = new ImageIcon("../images/smallcaseLogo.png");

        JButton button = new JButton();
        button.setText("submit");
        button.setBounds(20,10,300,100);
        button.setFocusable(false); // this will remove border of the text in button
        button.setIcon(imageIcon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setIconTextGap(-15);
        button.setForeground(Color.cyan); // it sets the button text color
        button.setBackground(Color.gray);
        button.setBorder(BorderFactory.createEtchedBorder());

        JFrame frame = new JFrame("JButton Class");
        frame.setBounds(100,100,450,420);
        frame.getContentPane().setBackground(Color.cyan);
        frame.add(button);


        frame.setLayout(null); // this will prevent byDefault layout
        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == button){
                    System.out.println("poo");

                    button.setEnabled(false);

                }
            }
        });

    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingDemo {


    public  static  void main(String[] args){

        JFrame frame = new JFrame("Button Demonstration");
        frame.setSize(600, 600);
        JButton button = new JButton("Submit");
        button.setBounds(50,130,80,30);


        final JTextField textField = new JTextField();
        textField.setBounds(50,100, 200,20);

        // Add component
        frame.add(textField);
        frame.add(button);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Event listener
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("hellow work");
            }
        });


    }
}

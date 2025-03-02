import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        // Create a new frame
        JFrame frame = new JFrame("Product");
        frame.setSize(400, 300);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // We should use FlowLayout, GridLayout, or BoxLayout to properly arrange them
        frame.setLayout(new FlowLayout());

        JLabel ProductId = new JLabel("id");
        JTextField inputProductId = new JTextField(5);


        //Create label
        JLabel ProductName = new JLabel("name");
       //label.setSize(300,20); //this won't work

        // Create Text field
        JTextField inputProductName = new JTextField(22);
        //input.setSize(300,40); //this won't work

        JLabel ProductPrice = new JLabel("Price");
        JTextField inputProductPrice = new JTextField(7);

        JLabel ProductQuantity = new JLabel("Quantity");
        JTextField inputProductQuantity = new JTextField(7);

        // Create a button
        JButton button = new JButton();
            //button.setText("Submit");
//            button.setBounds();

        frame.add(ProductId);
        frame.add(inputProductId);

        // Add label
        frame.add(ProductName);

        // Add Text field
        frame.add(inputProductName);

        frame.add(ProductPrice);
        frame.add(inputProductPrice);

        frame.add(ProductQuantity);
        frame.add(inputProductQuantity);

        // Add button
        frame.add(button);

        // Make the frame visible
        frame.setVisible(true);

        // Save Data to Database

        // Load the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        button.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myJava","root", "Shamsher@mysql")) {
                    System.out.println("Database connected successfully");

                    String q = "INSERT INTO productInfo (id, name, price, quantity) values (?,?,?,?)";
                    PreparedStatement ps = conn.prepareStatement(q);

                    ps.setInt(1, Integer.parseInt(inputProductId.getText()));
                    ps.setString(2, inputProductName.getText());
                    ps.setDouble(3, Double.parseDouble(inputProductPrice.getText()));
                    ps.setInt(4, Integer.parseInt(inputProductQuantity.getText()));

                    int rowsInserted = ps.executeUpdate();
                    System.out.println("Data Inserted = " + rowsInserted);
                    if (rowsInserted > 0) {
                        JOptionPane.showMessageDialog(frame, "Product saved successfully!");
                    }


                }catch (Exception ex){
                    System.out.println(ex);
                }
            }
        });




    }
}
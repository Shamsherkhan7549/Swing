# Swing
## IntroDuction
### What is swing 
    Swing is a GUI (Graphical User Interface) toolkit in Java used to create desktop applications.
    It is a part of Java Foundation Classes (JFC) and provides a rich set of lightweight components
    for building user-friendly interfaces.

    Unlike AWT, Java swing provides plaform independent and lightweight components.
    the javax.swing.*; package provides classes for java swing API such as JButton, JTextField,
    JTextArea, JRadioButton, JCheckbox ,JMenu, JColorChooser,etc

### What is swing api
    The Swing API is a collection of Java classes and interfaces that provide GUI components 
    like buttons, text fields, tables, trees, and more. It extends the Abstract Window Toolkit (AWT)
    but offers more flexibility and better look-and-feel support.
   
### Key Features of Swing
    Lightweight – Swing components are written in Java and do not rely on native OS components.
    Pluggable Look and Feel – You can change the appearance of components without modifying the code.
    MVC Architecture – Follows the Model-View-Controller pattern for better separation of concerns.
    Event-Driven Programming – Uses event listeners for handling user interactions.
    Rich Set of Components – Includes advanced UI elements like tables (JTable), trees (JTree), and tabbed panes (JTabbedPane).

### Common Swing Components
    Component	     Description
    JFrame	         Main window of a Swing application.
    JButton	         A clickable button.
    JLabel	         Displays a text or image label.
    JTextField	     A single-line text input field.
    JTextArea	     A multi-line text input area.
    JCheckBox	     A checkbox for multiple selections.
    JRadioButton	 A radio button for single selection.
    JComboBox	     A dropdown list for selecting an option.
    JTable	         Displays tabular data.
    JPanel         	 A container for grouping components.

### Applications Based on end device
    1> Browser based Online web Application
    2> Mobile based OS Application
    3> Desktop Based Application

## Implemetation
### How t implement and create Frame or Window
    1> Association:- By creating the object of Frame class
    2> Ingeritence:- By extending Frame class

    1> Association

    public class Main{
    JFrame f;
    SwingDemo(){
        f = new JFrame();
        //Creating instance of JFrame
        f.setVisible(true)
        }

        //making the frame visible
        public static void main(String[] args){
            new SwingDemo();
        }
    }
    }   

    2> Ingeritence
        public class Main{
        SwingDemo2() extends JFrame{
        JFrame f;
        SwingDemo2(){
            setVisible(true)
        }
        //making the frame visible
        public static void main(String[] args){
            new SwingDemo();
        }
    }
    }

## JBUTTON
    1> Import javax.swing.*; package
    2> JButton class is used to create a labeled button
    that has platform independent implementation.
    3> The application result in somm eacrion when the button is pushed
    4>It inherits AbstractButton class.
    5> Add Action Listener for Event Handling
    -> JOptionPane():Creates a JOptionPane with the specified buttons, icons messagem titlem and son on
    
    Syntax
    JButton button = new JButton("Submit")
    
    Example:
    JFrame frame = new JFrame("JButton Demonstration");
    JButton button = new JButton("Submit");
    button.setBounds(50,100,95,30);

    -> void setText(String S) :- It is used t set specified text on button
    -> String getText() :- It is used to return the text of the button
    -> void setEnable(boolean b) :- It is used to enable or disable the button
    -> void setIcon(Icon b) :-  It is used to set the specified Icon on the button
    -> Ivon getIcon() :- It is use t get ht eIvon og the button.
    -> void setMnemonic(int a) :- It is used to set hte mnemonic on the button.
    -> void addActionListener(ActionListener a) :- It is used t add the action listener to this object

### JButtton used for
    1> Bacic User interface requirement
    2> Form Submission
    3> interactive content
    4> Used in Poll kind of application
    5> New Registration form
    6> Games application
    7> Alert Boc or pop up features
    8> Design

## JTable 
    JTable class is used to desplay data in tabular form.
    It is composed of rows and columns.











































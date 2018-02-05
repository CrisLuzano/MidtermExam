package javaProgramming;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class PersonalInformation extends JFrame implements ActionListener {
 



	private JLabel label;
	
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private JLabel label8;
	private JLabel label9;
	private JLabel label10;
	private JLabel label11;
	private JLabel label12;
	
    private JButton button;
    
    private JTextField textField;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    
    private FlowLayout fl;

    private GridLayout gl;
    

public PersonalInformation(){
	
	
	label1 = new JLabel("First Name");
	 textField1 = new JTextField(15);
	label2 = new JLabel("Last Name");
	 textField2 = new JTextField(15);
	label3 = new JLabel("Middle Name");
	 textField3 = new JTextField(15);
	label4 = new JLabel("Enter Age:");
	 textField4= new JTextField(15);
	label5 = new JLabel("birthday");
	 textField5= new JTextField(15);
	label6 = new JLabel("Gender");
	 textField6 = new JTextField(15);
	label7 = new JLabel("adress");
	 textField7= new JTextField(15);
	label8 = new JLabel("E-mail");
	 textField8= new JTextField(15);
	label9 = new JLabel("telephone");
	 textField9= new JTextField(15);
	label10 = new JLabel("mobile");
	 textField10 = new JTextField(15);
	label11= new JLabel("Birth place");
	 textField11 = new JTextField(15);
	label12= new JLabel(" skills");
	
    label = new JLabel("");
    
    button = new JButton("Register");
    textField = new JTextField(20);
    setLayout(new FlowLayout());
    add(label1);
    add(textField1);
    add(label2);
    add(textField2);
    add(label3);
    add(textField3);
    add(label4);
    add(textField4);
    add(label5);
    add(textField5);
    add(label6);
    add(textField6);
    add(label7);
    add(textField7);
    add(label8);
    add(textField8);
    add(label9);
    add(textField9);
    add(label10);
    add(textField10);
    add(label11);
    add(textField11);
    
    
    add(label);    
    add(textField);
    
    add(button);
    setSize(200,800);
    setVisible(true);
    button.addActionListener(this);
}
public void actionPerformed(ActionEvent event){
    label.setText(textField.getText());
}
}
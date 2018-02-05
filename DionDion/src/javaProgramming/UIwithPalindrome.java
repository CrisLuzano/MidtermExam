package javaProgramming;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UIwithPalindrome extends JFrame implements ActionListener {
	private JLabel label;
	private JTextField textfield;
	private JPanel panel;
	private JButton button;
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public UIwithPalindrome(){
		label = new JLabel("Enter Name: ");
		label.setFont(new Font("ARIAL", Font.BOLD,16));
		label.setForeground(Color.BLUE);
		label.setBounds(10,85,200,25);
		add(label);
		
		textfield = new JTextField(20);
		textfield.setBounds(214,85,210,40);
		add(textfield);
		
		button = new JButton("Palindrome");
		button.setBounds(323,179,100,30);
		button.addActionListener(this);//for running the button
		button.setActionCommand("button");
		add(button);
		
		setTitle("ChangeToPalindrome");
		setSize(440,277);
		setDefaultCloseOperation (EXIT_ON_CLOSE) ;
		setLocationRelativeTo(null);//  to center
		setLayout(null);
		setVisible(true);
		setResizable(false);
	}
	public static void main(String args[]){
		new UIwithPalindrome();
	}
}
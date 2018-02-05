package javaProgramming;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class RegisterUI extends JFrame implements ActionListener 
{
	private JLabel firstNameL;
	private JTextField firstNameTF;
	private JLabel lastNameL;
	private JTextField lastNameTF;
	private JLabel passwordL;
	private JPasswordField passwordPF;
	private JButton submitB;
	private JLabel usernameL;
	private JTextField usernameTF;   

	private User user;

	public RegisterUI() 
	{
		usernameL = new JLabel();
		usernameTF = new JTextField();
		passwordL = new JLabel();
		passwordPF = new JPasswordField();
		firstNameL = new JLabel();
		firstNameTF = new JTextField();
		lastNameL = new JLabel();
		lastNameTF = new JTextField();
		submitB = new JButton();

		user = new User();

		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(null);

		usernameL.setFont(new Font("Tahoma", 0, 14)); 
		usernameL.setText("Username:");
		getContentPane().add(usernameL);
		usernameL.setBounds(30, 60, 90, 30);

		usernameTF.setFont(new Font("Tahoma", 0, 14)); 
		getContentPane().add(usernameTF);
		usernameTF.setBounds(30, 90, 380, 30);

		passwordL.setFont(new Font("Tahoma", 0, 14)); 
		passwordL.setText("Password:");
		getContentPane().add(passwordL);
		passwordL.setBounds(30, 140, 80, 30);
		getContentPane().add(passwordPF);
		passwordPF.setBounds(30, 170, 380, 30);

		firstNameL.setFont(new Font("Tahoma", 0, 14)); 
		firstNameL.setText("First Name:");
		getContentPane().add(firstNameL);
		firstNameL.setBounds(30, 220, 130, 30);

		firstNameTF.setFont(new Font("Tahoma", 0, 14)); 
		getContentPane().add(firstNameTF);
		firstNameTF.setBounds(30, 250, 380, 30);

		lastNameL.setFont(new Font("Tahoma", 0, 14)); 
		lastNameL.setText("Last Name:");
		getContentPane().add(lastNameL);
		lastNameL.setBounds(30, 300, 80, 30);

		lastNameTF.setFont(new Font("Tahoma", 0, 14)); 
		getContentPane().add(lastNameTF);
		lastNameTF.setBounds(30, 330, 380, 30);

		submitB.setText("Submit");
		getContentPane().add(submitB);
		submitB.setBounds(340, 370, 70, 30);
		submitB.addActionListener(this);

		super.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				dispose();
				new LoginUI().setVisible(true);
			}
		});

		setTitle("Register");
		setSize(465, 460);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		User user = new User();

		user.setUsername(usernameTF.getText());
		user.setPassword(passwordPF.getText());
		user.setLastName(lastNameTF.getText());
		user.setFirstName(firstNameTF.getText());

		try
		{
			this.user.addUser(user);
			JOptionPane.showMessageDialog(null, "Registration success.");
			dispose();
			new LoginUI().setVisible(true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}            
	public static void main(String args[]){
		RegisterUI qwe = new RegisterUI();
		//LoginUI qwe = new LoginUI();
		//User qwe = new User();
	}
}
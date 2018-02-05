package javaProgramming;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

public class LoginUI extends JFrame implements ActionListener
{
	private JPanel loginP;
	private JButton loginB;
	private JLabel passwordL;
	private JPasswordField passwordPF;
	private JLabel usernameL;
	private JTextField usernameTF;  
	private User user;
	private JButton registerB;

	public LoginUI() 
	{
		loginP = new JPanel();
		usernameL = new JLabel();
		usernameTF = new JTextField();
		passwordL = new JLabel();
		passwordPF = new JPasswordField();
		loginB = new JButton();

		user = new User();

		setTitle("Log in");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().setLayout(null);

		loginP.setBorder(BorderFactory.createTitledBorder(null, "Log in", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Tahoma", 0, 14))); 
		loginP.setLayout(null);

		usernameL.setFont(new Font("Tahoma", 0, 14)); 
		usernameL.setText("Username:");
		loginP.add(usernameL);
		usernameL.setBounds(30, 40, 70, 30);

		usernameTF.setFont(new Font("Tahoma", 0, 14)); 
		loginP.add(usernameTF);
		usernameTF.setBounds(110, 40, 330, 30);
		usernameTF.addActionListener(this);

		passwordL.setFont(new Font("Tahoma", 0, 14)); 
		passwordL.setText("Password:");
		loginP.add(passwordL);
		passwordL.setBounds(30, 110, 80, 30);

		passwordPF.setFont(new Font("Tahoma", 0, 14)); 
		loginP.add(passwordPF);
		passwordPF.setBounds(110, 110, 330, 30);
		passwordPF.addActionListener(this);

		loginB.setText("Log in");
		loginP.add(loginB);
		loginB.setBounds(353, 150, 90, 30);
		loginB.addActionListener(this);

		registerB = new JButton();
		registerB.setText("Register");
		registerB.setBounds(260, 150, 90, 30);
		registerB.addActionListener(this);
		loginP.add(registerB);

		getContentPane().add(loginP);
		loginP.setBounds(20, 90, 360, 200);

		setSize(515, 360);
		setLocationRelativeTo(null); // center frame
	}

	public static void main(String args[]) 
	{
		setTheme();

		new LoginUI().setVisible(true);
	}

	private static void setTheme() 
	{
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == registerB)
		{
			dispose();
			new RegisterUI();
		}
		else
		{
			if(isUserValid(usernameTF.getText(), passwordPF.getText()))
			{
				JOptionPane.showMessageDialog(null, "Welcome User");
				// Do something here.
			}
			else
				JOptionPane.showMessageDialog(null, "Invalid username or password.", "Invalid", JOptionPane.WARNING_MESSAGE);
		}
	}

	private boolean isUserValid(String username, String password) 
	{
		for(User user: user.getUserList())
			if(user.getUsername().equalsIgnoreCase(username)
					&& user.getPassword().equalsIgnoreCase(password))
				return true;

		return false;
	}
}
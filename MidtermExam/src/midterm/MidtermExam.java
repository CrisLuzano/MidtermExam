package midterm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class MidtermExam extends JFrame implements ActionListener
{

	private JLabel nameL;
	private JLabel passL;
	private JLabel confirmPassL;
	private JLabel cityL;
	private JLabel genderL;
	private JLabel gmailL;
	private JTextField nameTF;
	private JPasswordField passwordPF;
	private JPasswordField confirmPassPF;
	private JTextField gmailTF;
	private JComboBox cityCB;
	private ButtonGroup gender;
	private JRadioButton male ,female;
	private JButton submitB;
	
	private String cityItem[] = {"Please select city","Quezon City","Baguio City"};
	
	private List<Information>list;
	public PrintWriter myPrintWriter;
	public FileWriter myFileWriter;
	
	
	public MidtermExam()
	{
		setTitle("MidtermExam");
		setSize(500,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		nameL = new JLabel("Name:");
		nameL.setBounds(5,0,100,100);
		add(nameL);
		
		nameTF = new JTextField();
		nameTF.setBounds(250,35,200,25);
		add(nameTF);
		
		passL = new JLabel("Password:");
		passL.setBounds(5,50,100,100);
		add(passL);
		
		passwordPF = new JPasswordField();
		passwordPF.setBounds(250,85,200,25);
		add(passwordPF);
		
		confirmPassL = new JLabel("Confirm Password: ");
		confirmPassL.setBounds(5,100,120,100);
		add(confirmPassL);
		
		confirmPassPF = new JPasswordField();
		confirmPassPF.setBounds(250,135,200,25);
		add(confirmPassPF);
		
		cityL = new JLabel("City: ");
		cityL.setBounds(5,150,120,100);
		add(cityL);
		
		cityCB = new JComboBox(cityItem);
		cityCB.setBounds(250,189,200,25);
		add(cityCB);
		
		genderL = new JLabel("Gender: ");
		genderL.setBounds(5,200,120,100);
		add(genderL);
		
		gender = new ButtonGroup();
		
		male = new JRadioButton("male");
		gender.add(male);
		male.setBounds(255,235,80,25);
		add(male);
		
		female = new JRadioButton("female");
		gender.add(female);
		female.setBounds(350,235,80,25);
		add(female);

		gmailL = new JLabel("Gmail: ");
		gmailL.setBounds(5,250,120,100);
		add(gmailL);
		
		gmailTF = new JTextField();
		gmailTF.setBounds(250,290,200,25);
		add(gmailTF);
		
		submitB = new JButton("Submit");
		submitB.setBounds(190,340,100,20);
		submitB.addActionListener(this);
		add(submitB);
		
		File myFile = new File("MidtermExam_Luzano,CrisD.txt");
		if (!myFile.exists())
		{
			try {
				myFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		myFileWriter = new FileWr
		
			try {
				 myPrintWriter = new PrintWriter(myFile);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		setTheme();
		new MidtermExam();
	}
	
	public static void setTheme()
	{
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		list = new ArrayList<Information>();
		Information info = new Information();
			
		if(arg0.getSource() == submitB)
		{
			if(nameTF.getText().equals("") || passwordPF.getText().equals("") || confirmPassPF.getText().equals("") || cityCB.getSelectedItem().equals("Please select city") || gmailTF.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null,"Please fillup the form!",getTitle(),JOptionPane.INFORMATION_MESSAGE);
			}else
			{
				info.setName(nameTF.getText());
				info.setPassword(passwordPF.getText());
				info.setConfirmPass(confirmPassPF.getText());
				info.setCity(cityCB.getSelectedItem().toString());
				info.setGender(gender.getElements().toString());
				info.setGmail(gmailTF.getText());
				list.add(info);
				toTextFile();
			}
			
		
		}
		
	}
	
	public void toTextFile()
	{
		Information info = new Information();
		myPrintWriter.println(info.getName());
		myPrintWriter.println(info.getPassword());
		myPrintWriter.println(info.getConfirmPass());
		myPrintWriter.println(info.getCity());
		myPrintWriter.println(info.getGender());
		myPrintWriter.println(info.getGmail());
		myPrintWriter.close();
		JOptionPane.showMessageDialog(null, "Submited!");
	}

}

package javaProgramming;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class StudentRegistration extends JFrame implements ActionListener {
		private JLabel personaldata;
		private JLabel first;
		private JLabel middle;
		private JLabel last;
		private JLabel previousschool;
		private JLabel courseprogram;
		private JLabel course;
		private JLabel yearlevel;
		private JLabel term;
		private JLabel schoolyear;
		private JLabel gender;
		private JLabel religion;
		private JLabel birthday;
		private JTextField tf;
		private JTextField tf2;
		private JTextField tf3;
		private JRadioButton male;
		private JRadioButton female;
		private JButton button;
		String [] ps = {"---","New Era University", "New Era High School", "Matter Dei Academy", "Rizal National High School", "Quezon City High School", "Culiat High School"};
		String [] cp = {"---","Baccalaureate", "Doctoral", "Masteral", "Open/Online University"};
		String [] c = {"---","BSCS Bachelor Of Science in Computer Science", "BSIT Bachelor Of Science in Information Technology","BSIS Bachelor Of Science in Information System", "EMC Entertainment and Multimedia Computing"};
		String [] yl = {"---","1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th"};
		String [] t = {"---","1st Sem", "2nd Sem", "3rd Sem"};
		String [] sy = {"---","2016-2017", "2017-2018", "2019-2020", "2021-2022"};
		String [] rel = {"---","Iglesia Ni Cristo", "Baptist", "Catholic", "Islam"};
		String [] months = {"---","Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"};
		String [] days = {"---","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String [] years = {"---","1980","1981","1982","1983","1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001"};
			
public StudentRegistration () {
		setTitle("STUDENT REGISTRATION");
		Font font = new Font("ARIAL", Font.BOLD,19);
		personaldata = new JLabel ("PERSONAL DATA");
		personaldata.setFont(font);
		first = new JLabel("First Name: ");
		middle = new JLabel("Middle Name: ");
		last = new JLabel("Last Name: ");
		gender = new JLabel("Gender: ");
		religion = new JLabel("Religion: ");
		birthday = new JLabel("Birthday: ");
		previousschool = new JLabel("Previous School: ");
		courseprogram = new JLabel("Course Program: ");
		course = new JLabel("Course: ");
		yearlevel = new JLabel("Year Level: ");
		term = new JLabel("Term: ");
		schoolyear = new JLabel("School Year: ");
		tf = new JTextField (20);
		tf2 = new JTextField (20);
		tf3 = new JTextField (20);
		male = new JRadioButton ("Male");
		female = new JRadioButton ("Female");
		JComboBox combo = new JComboBox(rel);
		JComboBox combo2 = new JComboBox(days);
		JComboBox combo3 = new JComboBox(months);
		JComboBox combo4 = new JComboBox(years);
		JComboBox combo5 = new JComboBox(ps);
		JComboBox combo6 = new JComboBox(cp);
		JComboBox combo7 = new JComboBox(c);
		JComboBox combo8 = new JComboBox(yl);
		JComboBox combo9 = new JComboBox(t);
		JComboBox combo10 = new JComboBox(sy);
		button = new JButton("REGISTER NOW");
		setLayout(null);
		personaldata.setBounds(210,10,200,40);
		first.setBounds(10,60,200,40);
		tf.setBounds(130,70,150,20);
		middle.setBounds(10,80,200,40);
		tf2.setBounds(130,90,150,20);
		last.setBounds(10,100,200,40);
		tf3.setBounds(130,110,150,20);
		gender.setBounds(10,120,200,40);
		male.setBounds(130,130,150,20);
		female.setBounds(290,130,150,20);
		religion.setBounds(10,140,200,40);
		combo.setBounds(130,150,150,20);
		birthday.setBounds(10,160,200,40);
		combo3.setBounds(130,173,150,20);
		combo2.setBounds(290,173,150,20);
		combo4.setBounds(450,173,150,20);
		previousschool.setBounds(10,193,200,40);
		combo5.setBounds(130,203,150,20);
		courseprogram.setBounds(10,214,200,40);
		combo6.setBounds(130,226,150,20);
		course.setBounds(10,235,200,40);
		combo7.setBounds(130,247,150,20);
		yearlevel.setBounds(10,257,200,40);
		combo8.setBounds(130,269,150,20);
		term.setBounds(10,279,300,40);
		combo9.setBounds(130,291,150,20);
		schoolyear.setBounds(10,301,200,40);
		combo10.setBounds(130,313,150,20);
		button.setBounds(450,364,150,40);
		add(personaldata);
		add(first);
		add(tf);
		add(middle);
		add(tf2);
		add(last);
		add(tf3);
		add(gender);
		add(male);
		add(female);
		add(religion);
		add(combo);
		add(birthday);
		add(combo2);
		add(combo3);
		add(combo4);
		add(previousschool);
		add(combo5);
		add(courseprogram);
		add(combo6);
		add(course);
		add(combo7);
		add(yearlevel);
		add(combo8);
		add(term);
		add(combo9);
		add(schoolyear);
		add(combo10);
		add(button);
		button.addActionListener(this);
		button.setActionCommand("Open");
		setSize(640,450);
		setVisible(true);
		setResizable(false);
	}



@Override
public void actionPerformed(ActionEvent event) {
	String qwerty = event.getActionCommand();//for opening the nextFrame

 	if(qwerty.equals("Open"))//for opening the nextFrame
 	{
 		dispose();//for closing the frame then
 		new NewFrameClass();//for opening the nextFrame
 	}
	
}
public static void main(String args[]){
	StudentRegistration mystudentregister = new StudentRegistration();
}
}
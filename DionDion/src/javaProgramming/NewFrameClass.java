package javaProgramming;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class NewFrameClass extends JFrame implements ActionListener{
	private JLabel label;
	private JButton button;


public NewFrameClass(){
	label = new JLabel("THIS IS YOUR NEW FRAME");
	button = new JButton("BACK");
	setLayout(null);
	add(label);
	add(button);
	button.addActionListener(this);
	label.setBounds(10,10,300,40);
	button.setBounds(30,60,200,40);
	button.setActionCommand("Open");
	setSize(300,300);
	setVisible(true);
	setResizable(false);
	}


@Override
public void actionPerformed(ActionEvent arg0) {
	String diondion = arg0.getActionCommand();//for opening the nextFrame

 	if(diondion.equals("Open"))//for opening the nextFrame
 	{
 		dispose();//for closing the frame then
 		new StudentRegistration();//for opening the nextFrame
 	}
	
}
}
package demo;
import javax.swing.*;

public class DialogOrReserve {
	JTextField firstname = new JTextField();
	JTextField lastname = new JTextField();
	JTextField id = new JTextField();
	JTextField contactnumber = new JTextField();
	final JComponent[] inputs = new JComponent[] {
			new JLabel("I.D: "),id,
			new JLabel("FirstName: "),firstname,
			new JLabel("LastName: "),lastname,
			new JLabel("Contact Number: "),contactnumber,
	};
	
	

public DialogOrReserve(){
	//JOptionPane.showMessageDialog(null, inputs, "My custom dialog",JOptionPane.DEFAULT_OPTION);
	int message=JOptionPane.showOptionDialog(null, inputs, "GUI", JOptionPane.DEFAULT_OPTION,JOptionPane.DEFAULT_OPTION, null, new Object[]{"Reserve"}, null);
	if(message==JOptionPane.YES_OPTION){
		new DialogOrReserve();
	}
}
public static void main (String args[]){
	DialogOrReserve meqwe = new DialogOrReserve();
}
}
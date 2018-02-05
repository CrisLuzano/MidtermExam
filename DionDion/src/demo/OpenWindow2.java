package demo;
import javax.swing.* ;

import java.awt.event.* ;
import java.awt.* ;
import java.util.* ;

public class OpenWindow2 extends JFrame implements ActionListener
{
  private JButton hit ;
  private JButton stay ;
  private JButton back;
  //private JLabel lbl;

  public void BlackJackWindow2() 
  {
    // TODO Auto-generated method stub
    JPanel pane=new JPanel();
    setTitle ("Black Jack!!!!!") ;
    JFrame frame = new JFrame("");

    setVisible(true);
    setSize (380, 260) ;
    setLocation (450, 200) ;
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE) ;

    setLayout(new FlowLayout());
    hit = new JButton("Hit");  
    stay = new JButton("stay");
    back = new JButton("return to main menu");

    // add (lbl) ;
    add(hit, BorderLayout.CENTER);  
    hit.addActionListener (this) ;
    add(stay,BorderLayout.CENTER);
    stay.addActionListener (this) ;
    add(back,BorderLayout.CENTER);
    back.addActionListener (this) ;
  }

  @Override
  public void actionPerformed(ActionEvent event) 
  {
    // TODO Auto-generated method stub
    OpenWindow1 bl = new OpenWindow1();
    if (event.getSource() == hit)
    {
      //code for the game goes here i will complete later
    }
    else if(event.getSource() == stay){
      //code for game goes here i will comeplete later.
    }
    else 
    {
      //this is where i want the frame to close and go back to the original.
    }
  }
}
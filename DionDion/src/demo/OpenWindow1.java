package demo;
import javax.swing.* ;
import java.awt.event.* ;
import java.awt.* ;
import java.util.* ;


public class OpenWindow1 extends JFrame implements ActionListener
{
  private JButton play = new JButton("Play");
  private JButton exit = new JButton("Exit");
  private JPanel pane=new JPanel();
  private JLabel lbl ;

  public OpenWindow1()
  {
    super();
    JPanel pane=new JPanel();
    setTitle ("Black Jack!!!!!") ;
    JFrame frame = new JFrame("");

    setVisible(true);
    setSize (380, 260) ;
    setLocation (450, 200) ;
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE) ;

    setLayout(new FlowLayout());
    play = new JButton("Start");
    exit = new JButton("exit");
    lbl = new JLabel ("Welcome to Theodores Black Jack!!!!!");

    add (lbl) ;
    add(play, BorderLayout.CENTER);
    play.addActionListener (this);
    add(exit,BorderLayout.CENTER);
    exit.addActionListener (this);
  }
  @Override
  public void actionPerformed(ActionEvent event)
  {
    // TODO Auto-generated method stub
    OpenWindow2 bl = new OpenWindow2();
    if (event.getSource() == play)
    {
      bl.BlackJackWindow2();
    }
    else if(event.getSource() == exit){
      System.exit(0);
    }
  }
  public static void main(String[] args){
	  OpenWindow1 ewqe = new OpenWindow1();
  }
}
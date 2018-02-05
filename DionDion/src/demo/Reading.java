package demo;
import java.awt.FlowLayout;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Reading extends JFrame {
    //GUI Variables

    private JButton save;
    private JButton clear;
    private JButton copy;
    private JButton paste;
    private JButton open;
    private JTextArea textField;
    private StringSelection stringSelection;
    private Clipboard clipboard;
    String textFieldWritable;

    public Reading() {
        super("Text Editor");
        //Sets Layout
        setLayout(new FlowLayout());

        save = new JButton("Save");
        add(save);
        clear = new JButton("Clear");
        add(clear);
        open = new JButton("Open");
        add(open);


        textField = new JTextArea(10, 35);
        add(textField);

        handler handle = new handler();

        save.addActionListener(handle);
        clear.addActionListener(handle);

    }

    private class handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == save) {
                textFieldWritable = String.format("%s", textField.getText());
                try {
                    FileWriter fileWrite = new FileWriter("Text.txt");
                    PrintWriter printWrite = new PrintWriter(fileWrite);

                    printWrite.println(textFieldWritable);
                    printWrite.close();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null,
                        "Error, File Already Exists!", "Error",
                        JOptionPane.ERROR_MESSAGE);
                }
            } else if (event.getSource() == clear) {
                textField.setText("");
            } else if (event.getSource() == open) {
                try {
                    FileReader fileReader = new FileReader("Text.txt");
                    BufferedReader bufferedReader = new BufferedReader(fileReader);

                    String inputFile = "";
                    String textFieldReadable = bufferedReader.readLine();

                    while (textFieldReadable != null) {
                        inputFile += textFieldReadable;
                        textFieldReadable = bufferedReader.readLine();
                    }
                    System.out.println("inputFile");
                } catch (FileNotFoundException ex) {
                    System.out.println("no such file exists");
                } catch (IOException ex) {
                    System.out.println("unkownerror");
                }
            }
        }
    }
    public static void main (String args[]){
    	new Reading().setVisible(true);
    }
}
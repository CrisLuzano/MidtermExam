4package demo;
import javax.swing.*;
import java.util.Random;    
 
public class SwingInputExample
{
 
   public static void main(String args[])
   {
        
           
      int FirstNumber;    
      int SecondNumber;    
      int CorrectAnswer;    
      String StudentGuess;    
      int StudentIntAnswer = 0;
      int b = 0;
      boolean AnswerIsCorrect = true; 
      boolean WrongAgain = false;
             
      while (AnswerIsCorrect)
      {  
      Random rand = new Random();    
      rand.nextInt(10);    
         
         
      FirstNumber = (rand.nextInt(10));  
      SecondNumber = (rand.nextInt(10));      
      CorrectAnswer = FirstNumber * SecondNumber;
 
    
  StudentGuess = JOptionPane.showInputDialog("What is " + FirstNumber  + " times " + SecondNumber + "?");
   
   
  StudentIntAnswer = Integer.parseInt(StudentGuess);
 if (CorrectAnswer != StudentIntAnswer)      
            do{
       
                  {                             
                    
                    StudentGuess = JOptionPane.showInputDialog("Try Again, " + "What is " + FirstNumber + " times " + SecondNumber + "?");
                     AnswerIsCorrect = false;
                     StudentIntAnswer = Integer.parseInt(StudentGuess);
                    WrongAgain = true;
                      if (CorrectAnswer == StudentIntAnswer)
                          {
                               AnswerIsCorrect = true;
                          }//end of if Answers Match the second time
                      
                                         
               } 
               } while (CorrectAnswer != StudentIntAnswer);//end of while loop
       
      }//end of while AnswerIsCorrect
 
   }//end of main
   }//end of class
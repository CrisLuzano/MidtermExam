package javaProgramming;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String pal = "";
		int startPos = pal.length()-1;
		int endPos = pal.length() -1;
		System.out.println("Enter a Word: ");
		pal=in.nextLine();
		
		boolean isPal = true;
		
		while (startPos < endPos)
		{
		
			String startLetter = pal.substring(startPos, startPos+1);
			String endLetter = pal.substring(endPos, endPos+1);
			
			if(startLetter.equals(endLetter)==false)
			{
				isPal=false;
				break;
			}
			startPos++;
			endPos--;
		}

		if(isPal==true)
		{
			System.out.println(pal+ " is a palindrome");
		}
		else
		{
			System.out.println(pal+ " is NOT a palindrome");
		}
	}

}
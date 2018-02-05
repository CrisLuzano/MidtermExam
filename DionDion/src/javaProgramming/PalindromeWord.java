package javaProgramming;

import java.util.Scanner;

public class PalindromeWord
{

	public static void main(String[] args) {
		String cris;
		String reversedString;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Word: ");
		cris = in.nextLine();
		
		reversedString = new StringBuilder(cris).reverse().toString();
		
		if(cris.equals(reversedString)){
			System.out.println(cris + " is a palindrome");
		}
		else{
			System.out.println(cris + " is NOT a palindrome");
		}

	}

}
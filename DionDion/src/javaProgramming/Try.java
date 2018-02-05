package javaProgramming;

import java.util.*;
import java.io.*;
public class Try {

	public static void main (String args[]) throws FileNotFoundException{

		Scanner sc = new Scanner(System.in);
		File file1 = new File("C://Users//DionDion//workspace//DionDion//src//javaProgramming//Inflectional.txt");
		File file2 = new File("C://Users//DionDion//workspace//DionDion//src//javaProgramming//Derivational.txt");

		Scanner scanner1 = new Scanner (file1);
		Scanner scanner2 = new Scanner (file2);

		System.out.println("Enter 1st word: ");
		String word1 = sc.nextLine();
		System.out.println("Enter 2nd word: ");
		String word2 = sc.nextLine();

		while(scanner1.hasNextLine())
		{
			String inflectionalWord = scanner1.nextLine();
			if(inflectionalWord.contains(word1)){
				System.out.println("The inflectional word for " +  word1 + " is " + inflectionalWord);
				break;
			}
			else
			{
				System.out.println("The word is not existing in the library");
				
			}
		}

		while(scanner2.hasNextLine())
		{
			String derivationalWord = scanner2.nextLine();
			if(derivationalWord.contains(word2)){
				System.out.println("The derivational word for " +  word2 + " is " + derivationalWord);
				break;
			}
			else
			{
				System.out.println("The word is not existing in the library");
				
			}
		}
	}
}
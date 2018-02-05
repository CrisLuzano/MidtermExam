package javaProgramming;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MachineProblem1 
{
	static Scanner inflectionalInputFile;
	static Scanner derivInputFile;
	static String inflectionalRowData;
	static String derivRowData;
	static String[] inflectionalRowDataSpecific = new String[12];
	static String[] derivRowDataSpecific = new String[12];
	static String inflectionalword1;
	static String inflectionalword2;
	static String inflectionalword3;
	static String inflectionalword4;
	static String inflectionalword5;
	static String inflectionalword6;
	static String derivword1;
	static String derivword2;
	static String derivword3;
	static String derivword4;
	static String derivword5;
	static String derivword6;

	public static void main (String args[]) throws FileNotFoundException
	{
		inflectionalInputFile = new Scanner(new FileReader("C://Users//DionDion//workspace//DionDion//src//javaProgramming//Inflectional.txt"));
		derivInputFile = new Scanner(new FileReader("C://Users//DionDion//workspace//DionDion//src//javaProgramming//Derivational.txt"));

		inflectionalInputFile.hasNext();
		inflectionalRowData = inflectionalInputFile.nextLine();
		inflectionalRowDataSpecific = inflectionalRowData.split(",");
		inflectionalword1 = inflectionalRowDataSpecific[0];
		inflectionalword2 = inflectionalRowDataSpecific[1];
		inflectionalword3 = inflectionalRowDataSpecific[2];
		inflectionalword4 = inflectionalRowDataSpecific[3];
		inflectionalword5 = inflectionalRowDataSpecific[4];
		inflectionalword6 = inflectionalRowDataSpecific[5];

		derivInputFile.hasNext();
		derivRowData = derivInputFile.nextLine();
		derivRowDataSpecific = derivRowData.split(",");
		derivword1 = derivRowDataSpecific[0];
		derivword2 = derivRowDataSpecific[1];
		derivword3 = derivRowDataSpecific[2];
		derivword4 = derivRowDataSpecific[3];
		derivword5 = derivRowDataSpecific[4];
		derivword6 = derivRowDataSpecific[5];

		Scanner sc = new Scanner(System.in);
		String enterFirstword;
		String enterSecondword;

		System.out.print("Enter first word: ");
		enterFirstword = sc.nextLine();

		if(enterFirstword.equals("work"))
		{
			System.out.println("The inflectional word for " + "work" + " is " +inflectionalword1);

		}else if(enterFirstword.equals("cat"))
		{
			System.out.println("The inflectional word for " + "cat" + " is " + inflectionalword2);

		}else if(enterFirstword.equals("walk"))
		{
			System.out.println("The inflectional word for " + "walk" + " is " + inflectionalword3);

		}else if(enterFirstword.equals("speak"))
		{
			System.out.println("The inflectional word for " + "speak" + " is " + inflectionalword4);

		}else if(enterFirstword.equals("fast"))
		{
			System.out.println("The inflectional word for " + "fast" + " is " + inflectionalword5);

		}else if(enterFirstword.equals("slow"))
		{
			System.out.println("The inflectional word for " + "slow" + " is " + inflectionalword6);
		}else{
			System.out.println("The word " + enterFirstword + " is not found in dictionary");
		}

		System.out.println();
		System.out.print("Enter second word: ");
		enterSecondword = sc.nextLine();

		if(enterSecondword.equals("modern"))
		{
			System.out.println("The derivational word for " + "modern" + " is " +derivword1);

		}else if(enterSecondword.equals("drink"))
		{
			System.out.println("The derivational word for " + "drink" + " is " + derivword2);

		}else if(enterSecondword.equals("nation"))
		{
			System.out.println("The derivational word for " + "nation" + " is " + derivword3);

		}else if(enterSecondword.equals("sense"))
		{
			System.out.println("The derivational word for " + "sense" + " is " + derivword4);

		}else if(enterSecondword.equals("frequent"))
		{
			System.out.println("The derivational word for " + "frequent" + " is " + derivword5);

		}else if(enterSecondword.equals("excited"))
		{
			System.out.println("The derivational word for " + "excited" + " is " + derivword6);
		}else{
			System.out.println("The word " + enterSecondword + " is not found in dictionary");
		}

		inflectionalInputFile.close();
		derivInputFile.close();
	}	
}
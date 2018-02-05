package javaProgramming;

import java.util.Scanner;

public class NlpMP1 
{
	public static void main (String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		
		String[] names = new String[3];
		names[0] = "cris";
		names[1] = "dionisio";
		names[2] = "luzano";
		
		String[] what = new String[3];
		what[0] = "pogi";
		what[1] = "mas pogi";
		what[2] = "pinaka pogi";
		
		String x = "";
		
		System.out.print("Enter first word: ");
		x = scanner.nextLine();
		
		if(x == names[0])
		{
			System.out.println(what[0]);
		}else{
			System.out.println("not found");
		}
		
		
		
		/*String[] cabinet = new String[4];
		
		cabinet[0] = "socks";
		cabinet[1] = "pants";
		cabinet[2] = "shirts";
		cabinet[3] = "accesories";
		
		System.out.println("The contents of the cabinet are: ");
		
		int i = 0;
		
		while(i < cabinet.length)
		{
			System.out.println(cabinet[i]);
			i++;
		}*/
		
		
		
		
	}

}

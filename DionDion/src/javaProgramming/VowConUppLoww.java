package javaProgramming;

import java.util.Scanner;

public class VowConUppLoww {

	public static void main(String[] args) {
		Scanner cris = new Scanner(System.in);
		System.out.println("Enter a Text");
		String dion = cris.nextLine();
		
		char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
		
		int vowel = 0;
		int consonant = 0;
		int upper = 0;
		int lower = 0;
		
		for (char c : dion.toCharArray()){
			if(new String(vowels).indexOf(c) < 0){
				vowel++;
			}
			else{
				consonant++;
			}
			if(c >= 'a' && c <= 'z'){
				lower++;
			}
			else{
				upper++;
			}
			
		System.out.println("vowels: " + vowel);
		System.out.println("consonants: " + consonant);
		System.out.println("lowercase: " + lower);
		System.out.println("uppercase: " + upper);
		}
	}
}
package javaProgramming;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CountingWord {
	public static void main(String[] args) throws IOException{
		//create input stream and scanner
	FileInputStream fin = new FileInputStream("readwords.txt");
	Scanner fileInput = new Scanner(fin);
	
	//create the arraylist
	ArrayList<String> words = new ArrayList<String>();
	ArrayList<Integer> count = new ArrayList<Integer>();
	
	//read through file and find the words
	while(fileInput.hasNext()){
		//get the next word
		String nextWord = fileInput.next();
		
	//Determine if the word is in the arraylist
		if(words.contains(nextWord)){
		int index = words.indexOf(nextWord);
		count.set(index, count.get(index)+1);
		}
		else{
			words.add(nextWord);
			count.add(1);
		}
	}
	//Close
	fileInput.close();
	fin.close();
	
	//Print out the results
	for(int i = 0; i < words.size(); i++){
		System.out.println(words.get(i) + " occured " + count.get(i) + " time(s)");
	}
 }
}

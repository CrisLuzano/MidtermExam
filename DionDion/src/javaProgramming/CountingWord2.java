package javaProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CountingWord2 {
	public static void main (String[] args){
				Scanner cris = new Scanner (System.in);
		        String test = "";
		        test = cris.nextLine();
		        
		        Set<String> duplicates = duplicateWords(test);
		        System.out.println("input : " + test);
		        System.out.println("The word " + duplicates + " is repeated");
		    }


		    /**
		     * Method to find duplicate words in a Sentence or String
		     * @param input String 
		     * @return set of duplicate words
		     */
		    public static Set<String> duplicateWords(String input){
		        
		        if(input == null || input.isEmpty()){
		            return Collections.emptySet();
		        }
		        Set<String> duplicates = new HashSet<>();
		        
		        String[] words = input.split("\\s+");
		        Set<String> set = new HashSet<>();
		        
		        for(String word : words){
		            if(!set.add(word)){
		                duplicates.add(word);
		            }
		        }
		        return duplicates;
		    }
}

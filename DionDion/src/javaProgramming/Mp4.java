package javaProgramming;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Mp4 {
	public static void main(String[] args) throws IOException{
		String arrayDataType[] = {"int","boolean","char"};
		String arrayID[] = {"a","b","x"};
		String arrayVal[] = {"1","2","3"};
		String arrayDel[] = {";"};
		String arrayAssignOp[] = {"="};
	
		File input = new File ("C:/Users/DionDion/Desktop/input.txt");
		File output = new File ("C:/Users/DionDion/Desktop/output.txt");
		FileWriter tagaSulat = new FileWriter(output);
		
			
				Scanner cris = new Scanner(input);
				while(cris.hasNextLine()){
					String diondion = cris.next();
					for(int x = 0; x < arrayDataType.length; x++){
						if(diondion.equals(arrayDataType[x])){
					tagaSulat.write("<data_type> ");
						}				
				}
				
				
				
					for(int x = 0; x < arrayID.length; x++){
						if(diondion.equals(arrayID[x])){
							tagaSulat.write("<id> ");
				}
				}
				
				
				
					for(int x = 0; x < arrayVal.length; x++){
						if(diondion.equals(arrayVal[x])){
							tagaSulat.write("<val> ");
				}
				}
			
				
				
					for(int x = 0; x < arrayDel.length; x++){
						if(diondion.equals(arrayDel[x])){
							tagaSulat.write("<del> ");
				}
				}
				
				
				
					for(int x = 0; x < arrayAssignOp.length; x++){
						if(diondion.equals(arrayAssignOp[x])){
							tagaSulat.write("<assign_optr> ");
						}
				}
				}
				tagaSulat.close();
					
	}
	
}
 




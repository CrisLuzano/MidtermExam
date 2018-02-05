package javaProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FIFO 
{
	public static void main (String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int frames, pointer = 0, de_fault = 0, fault = 0,referenceLength;
		int buffer[];
		int reference[];
		int mem_layout[][];

		System.out.println("Enter the number of Frames: ");
		frames = Integer.parseInt(br.readLine());

		System.out.println("Enter the length of the Reference string: ");
		referenceLength = Integer.parseInt(br.readLine());

		reference = new int[referenceLength];
		mem_layout = new int[referenceLength][frames];
		buffer = new int[frames];
		for(int s = 0; s < frames; s++)
			buffer[s] = 0;

		System.out.println("Enter the reference string: ");
		for(int i = 0; i < referenceLength; i++)
		{
			reference[i] = Integer.parseInt(br.readLine());
		}
		for(int i = 0; i < referenceLength; i++)
		{
			int search = -1;
			for(int j = 0; j < frames; j++)
			{
				if(buffer[j] == reference[i])
				{
					search = j;
					de_fault++;
					break;
				} 
			}
			if(search == -1)
			{
				buffer[pointer] = reference[i];
				fault++;
				pointer++;
				if(pointer == frames)
					pointer = 0;
			}
			for(int j = 0; j < frames; j++)
				mem_layout[i][j] = buffer[j];
		}

		for(int i = 0; i < frames; i++)
		{
			for(int j = 0; j < referenceLength; j++)
				System.out.printf("%3d ",mem_layout[j][i]);
			System.out.println();
		}
		
		System.out.println("Default: " + de_fault);
		System.out.println("Faults: " + fault);
		System.out.println("Percentage: " + (float)((float)fault/referenceLength*100) + "%");
	}
}
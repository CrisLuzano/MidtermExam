package javaProgramming;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Optimal 
{
	public static void main (String args[]) throws NumberFormatException, IOException
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list= new ArrayList<String>();
		ArrayList<String> faulDef= new ArrayList<String>();
		
		int frames = 0, pointer = 0, hit = 0, fault = 0,ref_len;
		boolean isFull= false;
		int bufferArr[];
		int refArr[];
		int layoutArr[][];

		System.out.println("Enter the number of Frames: ");
		frames = Integer.parseInt(br.readLine());

		System.out.println("Enter the length of the Reference string: ");
		ref_len= Integer.parseInt(br.readLine());
		refArr = new int[ref_len];
		layoutArr = new int[ref_len][frames];
		bufferArr = new int[frames];

		System.out.print("Enter the reference string: ");
		for(int i=0; i<ref_len;i++)
		{
			refArr[i] = Integer.parseInt(br.readLine());
			list.add(Integer.toString(refArr[i]));
		}
		System.out.println("\n");
		for(int j = 0; j < frames; j++)
		{
			bufferArr[j] = 0;
		}
		for(int i = 0; i < ref_len; i++)
		{
			int search = -1;
			for(int j = 0; j < frames; j++)
			{
				if(bufferArr[j] == refArr[i])
				{
					search = j;
					faulDef.add("D");
					hit++;
					break;
				} 
			}
			if(search == -1)
			{
				if(isFull)
				{
					int index[] = new int[frames];
					boolean index_flag[]= new boolean[frames];
					for(int j= i+1;j<ref_len;j++)
					{
						for(int k=0;k<frames;k++)
						{
							if((refArr[j] == bufferArr[k])&&(index_flag[k] == false))
							{
								index[k] = j;
								index_flag[k] = true;
								break;
							}
						}
					}
					int max = index[0];
					pointer = 0;
					if(max == 0)
					{
						max= 200;
					}
					for(int j=0;j<frames;j++)
					{
						if(index[j] == 0)
						{
							index[j]= 200;
						}
						if(index[j] > max)
						{
							max = index[j];
							pointer = j;
						}
					}
				}
				bufferArr[pointer] = refArr[i];
				fault++;
				faulDef.add("F");
				if(!isFull)
				{
					pointer++;
					if(pointer == frames)
					{
						pointer = 0;
						isFull=true;
					}
				}
			}
			for(int j = 0; j < frames; j++){
				layoutArr[i][j] = bufferArr[j];
			}
		}
		String [] arrayList= list.toArray(new String[0]);
		for(int j=0; j < arrayList.length;j++)
		{
			System.out.print("\t " + arrayList[j]);
		}
		System.out.println("\n");
		for(int i = 0; i < frames; i++)
		{
			for(int j = 0; j < ref_len; j++)
			{
				System.out.print("\t " + layoutArr[j][i]);

			}
			System.out.println();
		}
		System.out.println("\n");
		String [] faultDefaultLists= faulDef.toArray(new String[0]);
		for (int x = 0; x < faultDefaultLists.length; x++)
		{
			System.out.print("\t "+ faultDefaultLists[x]);
		}
		System.out.println();
		System.out.println("\n"+"The number of Defaults: " + hit);
		System.out.println("The number of Faults: " + fault);
		System.out.println("Page Fault Rate: " + (float)((float)fault/ref_len*100) + "%");

	}
}
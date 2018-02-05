//C:/Users/DionDion/Desktop/Midterm.txt
package javaProgramming;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MidtermExam {


	public static void main(String[] args) throws IOException {
		FileReader  br = new FileReader("C:/Users/DionDion/Desktop/Midterm.txt");

		String[] pilipino = {"1.pangngalan", "2.panghalip", "3.pandiwa", "4.pangatnig", "5.pangukol", "6.pang-angkop", "7.pang-uri","8.pang-abay","9.pantukoy","10.pangawing"};
		String panghalip = "sila";
		String pangatnig = "at";
		String pangangkop = "na";
		String pantukoy = "ang";
		String[] pangngalan = {"gagamba", "araw", "sanga", "ulan"};
		String[] pandiwa = {"umakyat","itinaboy","dumating"};
		String[] panguri = {"palaging","natuyo","maliliit","masaya"};

		Set<String> list= new HashSet<String>();
		Set<String> listPandiwa= new HashSet<String>();
		Set<String> listPantukoy= new HashSet<String>();

		Scanner sc= new Scanner(br);

		while(sc.hasNext()){
			String s = sc.nextLine();
			String [] a = s.split(" ");
			for(int i = 0; i<pilipino.length; i++) {
				if(i==0) {
					System.out.println(pilipino[i]);
					for(int j = 0; j<a.length;j++){
						for(int y = 0; y<pangngalan.length; y++) {
							if(a[j].equals(pangngalan[y])){
								if(!(list.contains(pangngalan[y]))){
									list.add(pangngalan[y]);
									System.out.println("\t"  + pangngalan[y]);
								}
							}
						}
					}
				}
				if(i==1) {
					System.out.println(pilipino[i]);
					for(int j = 0; j<a.length;j++){
						if(a[j].equals(panghalip))
							System.out.println("\t"  + panghalip);
					}
				}
				if(i==2) {
					System.out.println(pilipino[i]);
					for(int j = 0; j<a.length;j++){
						for(int y = 0;y<pandiwa.length;y++){
							if(a[j].equals(pandiwa[y]))
								if(!(list.contains(pandiwa[y]))){
									list.add(pandiwa[y]);
									System.out.println("\t"  + pandiwa[y]);
								}
						}
					}
				}
				if(i==3) {
					System.out.println(pilipino[i]);
					for(int j = 0; j<a.length;j++){
						if(a[j].equals(pangatnig))
							if(!(list.contains(pangatnig))){
								list.add(pangatnig);
								System.out.println("\t"  + pangatnig);
							}
					}
				}
				if(i==4) {
					System.out.println(pilipino[i]);
				}
				if(i==5) {
					System.out.println(pilipino[i]);
					for(int j = 0; j<a.length;j++){
						if(a[j].equals(pangangkop))
							if(!(list.contains(pangangkop))){
								list.add(pangangkop);
								System.out.println("\t"  + pangangkop);
							}
					}
				}
				if(i==6) {
					System.out.println(pilipino[i]);
					for(int j = 0; j<a.length;j++){
						for(int y = 0;y<panguri.length;y++){
						if(a[j].equals(panguri[y]))
							if(!(list.contains(panguri[y]))){
								list.add(panguri[y]);
								System.out.println("\t"  + panguri[y]);
							}
						}
					}
				}
			}
		}
	}

}

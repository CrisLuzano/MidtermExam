package javaProgramming;
import java.util.*;
import java.text.*;

public class DionDion {

	
	public static void main(String[] args) {
		DecimalFormat df=new DecimalFormat("#,###,###,###,###.00");
		Scanner accept=new Scanner(System.in);
		String name1=" ";
		double price=0.00, discount=0.00, netprice=0.00;
		System.out.print("Enter product: ");
		name1=accept.nextLine();
		System.out.print("Enter price: ");
		price=accept.nextDouble();
		//       F                T
		if((price>=0.00)&&(price<=10000.00))
		{
			System.out.println("Success");
			discount=price*.0;
			netprice=((price)-(price*discount));
		//
		}else if(price>=10001&&price<=20000)
		{
			discount=price*.05;
			netprice=price-discount;
		}else if(price<=20001&&price>=50000)
		{
			discount=(price)*.1;
			netprice=price-(price*discount);
		}else if(price<=50001&&price>=100000)
		{
			discount=(price)*.15;
			netprice=price-(price*discount);
		}else if(price>100000)
		{
			discount=(price)*.2;
			netprice=price-(price*discount);
		}else
			System.out.println("void");
		
		System.out.println("Price of "+ name1 +" is "+ price);
		System.out.println("Discount is "+ df.format(discount));
		System.out.println("Net Price is "+ df.format(netprice));
		}

	}

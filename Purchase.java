/*program to find total amount of purchased items from a shopping mall including GST etc
 Input : Item name,Quantity ,Total, GST
Expected output : Grand total */
 
package com.piedistrict;

import java.util.Scanner;

public class Purchase 
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);	
	System.out.println("Item Name :");
	String item1 = sc.next();
	int r1=20;
	System.out.println("Rate :"+r1);
	System.out.println("Quantity :");
	int q1= sc.nextInt();
	double t1=r1*q1;
	System.out.println("Total : "+t1);
	
	System.out.println("Item Name :");
	String item2 = sc.next();
	int r2=5;
	System.out.println("Rate :"+r2);
	System.out.println("Quantity :");
	int q2= sc.nextInt();
	double t2=r2*q2;
	System.out.println("Total : "+t2);
	
	System.out.println("Item Name :");
	String item3 = sc.next();
	int r3=30;
	System.out.println("Rate :"+r3);
	System.out.println("Quantity :");
	int q3= sc.nextInt();
	double t3=r3*q3;
	System.out.println("Total       : "+t3);
	
	double g=t1+t2+t3;
	System.out.println("Grand total :"+g);
	
	double GST=(g*5)/100;
	System.out.println("GST         :"+GST);

	double GT =GST+g;
	System.out.println("Grand total(GST inclusive) :"+GT);


	}
		

}
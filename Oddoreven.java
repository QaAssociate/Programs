//Program to display even or odd.
package com.piedistrict;

import java.util.Scanner;

public class Oddoreven 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i % 2 == 0) 
		{
			System.out.println("Even Number");
		} 
		else 
		{
			System.out.println("Odd Number");
		}

	}

}

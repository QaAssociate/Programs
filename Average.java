//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
package com.piedistrict;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) 
	{
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input numbers :");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println("Sum :" + (a + b + c));
		System.out.println("Average :" + (a + b + c) / 3);
	}

}

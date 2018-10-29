package com.piedistrict.java;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		int x, y, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :");
		x=sc.nextInt();
		System.out.println("Enter the second number :");
		y=sc.nextInt();
		System.out.println("Before swapping :");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("After swapping :");		
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}

}

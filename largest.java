package com.piedistrict;

import java.util.Scanner;

public class largest 
{

	public static void main(String[] args) 
	{
		int x, y, z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3 numbers:");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		if (x > y && x > z) 
		{
			System.out.println("largest number is:" + x);
		} 
		else if (y > z) 
		{
			System.out.println("largest number is:" + y);

		} 
		else 
		{
			System.out.println("largest number is:" + z);

		}
	}

}

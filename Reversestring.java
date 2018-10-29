package com.piedistrict.java;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {

		String n, rev = "";
		
		System.out.println("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextLine();
		int length = n.length();

		for (int i = length - 1; i >= 0; i--)

		rev = rev + n.charAt(i);

		System.out.println("Reverse of entered string is: " + rev);

	}

}

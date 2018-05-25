//Swap two numbers.
package com.piedistrict;

public class Swap {

	public static void main(String[] args) {
		int a = 10, b = 20, temp;
		System.out.println("Before Swapping:");
		System.out.println("a : 10");
		System.out.println("b : 20");
		{
			temp = a;
			a = b;
			b = temp;
		}
		System.out.println("After Swapping:");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}

}

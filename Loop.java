//Use a loop to display the numbers in the range 0-50 that are multiples of 5.
package com.piedistrict;

public class Loop
{

	public static void main(String[] args) 
	{
		int i;
		System.out.println("Multiple of 5 ");

		for (i = 0; i <= 50; i++)

			if (i % 5 == 0) 
			{
				System.out.println(i);
			}
	}

}

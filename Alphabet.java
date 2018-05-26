//Write a program to print uppercase alphabets and lowercase alphabets.
package com.piedistrict;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Alphabet 
{

	public static void main(String[] args)
	{
		char i;
		System.out.println("Uppercase letters");
		for (i = 'A'; i <= 'Z'; i++)
			System.out.println(" " + i);
		System.out.println("Lowercase letters");
		for (i = 'a'; i <= 'z'; i++)
			System.out.println(" " + i);
	}

}

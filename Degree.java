//1. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
package com.piedistrict.java;

import java.util.Scanner;

public class Degree {

	public static void main(String[] args) {
	
		  float temperature,celsius;
		  Scanner sc= new Scanner(System.in);
		  System.out.println("Enter the temperature in farenhiet : " );
		  temperature =sc.nextFloat();
		  celsius=(temperature-32)*5/9;
		  System.out.println("Temperature in celsius :"+celsius);
		

	}

}

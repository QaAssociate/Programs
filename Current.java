//Program to display current date and time.
package com.piedistrict;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Current
{

	public static void main(String[] args) 
	{
		System.out.println("Date And Time");

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));

	}

}

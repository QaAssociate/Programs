/*.  To verify Biometric attendence of 5 employees
Input : Name,Registered ID
Expected  Output : Return true if verified ,False otherwise.*/
package com.piedistrict;

import java.util.Scanner;

public class Biometric 
{

	public static void main(String[] args)
	{

	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the ID :");
        int i =sc.nextInt();
		switch(i)
		{
			case 1:
			       i=1;
			       {
			    	System.out.println("Arya");   
			    	System.out.println("Welcome to piedistrict");
			       }
			       break;
			       
		   case 2:
			       i=2;
	               {
			    	System.out.println("Anusree");   
			    	System.out.println("Welcome to piedistrict");
			       }
	               break;
		   case 3: 
			       i=3;
				   {
					System.out.println("Jinimol");   
					System.out.println("Welcome to piedistrict");
				   }
				   break;
		   case 4:
			       i=4;
				   {
					System.out.println("Vimnya");   
					System.out.println("Welcome to piedistrict");
				   }
				   break;
		   case 5: 
			       i=5;
				   {
					System.out.println("Daliya");   
					System.out.println("Welcome to piedistrict");
				   }
				   break;
		   default: 
	                System.out.println("Sorry,You are not a registered employee");
	                break;
		}}

}

/*To find one day profit of a workshop
Input : Type of vehicles, Service charges,Expense
Expected  Output : Total profit*/
 

package com.piedistrict;

import java.util.Scanner;

public class Workshop 
{
	public static void main(String[] args)                           
	{
    Scanner sc = new Scanner(System.in);
    
    String[] Choice;
    Choice = new String[2];
    Choice [0]="1";
    Choice [1]="2";
    System.out.println("    TATA MOTORS\r\n");
    System.out.println("Vehicle Name :");
    String name =sc.next();
    System.out.println("Type of vehicle :\r\n "+"\r\n1.Two wheeler\r\n" + "2.Four wheeler");
    System.out.println("\r\nChoose :");
    int type =sc.nextInt();
    String questions = Choice[0];
    switch(type) 
    {
    case 1:
	         questions = Choice[0];
	         {
	         System.out.println("Your Vehicle type is two wheeler");

	         }
	         break;
   default:
	       
           System.out.println("You selected four wheeler Vehicle ");

             }
    
    System.out.println("\r\nService Charge :");
    int s =sc.nextInt();

    System.out.println("Service Expence :");
    int e =sc.nextInt();
    
    int t=e;
    System.out.println("Total Expence :"+e);
    
    int p=s-t;
    if(p>0)
    {
    System.out.println("Profit of the company :"+p);
    }
    else
    {
    System.out.println("Loss of the company :"+p);
    }
	}
}
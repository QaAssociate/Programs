/*To conduct Online quize with multiple choice options.
Input - Minimum of 5 questions and answers
Expected  Output : Check answer is correct or not and add 2 marks if it is correct.*/

package com.piedistrict;

import java.util.Scanner;

public class Quiz 
{
	public static void main(String[] args) 
	{	 
		    Scanner sc = new Scanner(System.in);
		    
		    String[] Choice;
		    Choice = new String[4];
		    Choice [0]="A";
		    Choice [1]="B";
		    Choice [2]="C";
		    Choice [3]="D"; 
		    String questions = Choice[3];
		    
		    System.out.println("1.Raut Nacha is folk dance performed mainly by the tribal communities of which state?");
            System.out.println("\r\n[A].Rajasthan\r\n"+"[B].Jammu & Kashmir\r\n"+"[C].Assam\r\n" + "[D].Chhattisgarh\r\n");
            System.out.println("Answer:");
			String a = sc.next();
		    switch(a) 
		    {
		    case "D":
			         questions = Choice[3];
			         {
			         System.out.println("Correct Answer");
			         }
			         break;
		   default:
			        System.out.println("Wrong Answer");
		             }
		    
					
		    System.out.println("2.Which of the following is not a classical dance of India?\r\n");
			System.out.println("\r\n[A] Kathak\r\n" + "[B] Sattriya\r\n" + "[C] Manipuri\r\n" + "[D] Bhangra\r\n");
            System.out.println("Answer:");
            String b = sc.next();
		    switch(b) 
		    {
		    case "D":
			         questions = Choice[3];
			         {
			         System.out.println("Correct Answer");
			         }
			         break;
		   default:
			        System.out.println("Wrong Answer");
		             }
		    
             System.out.println("3.The most potent greenhouse gas among the following is?\r\n");
             System.out.println("\r\n[A]Carbon dioxide\r\n" + "[B]Methane\r\n" + "[C]Water Vapor\r\n" + "[D]Ozone\r\n");
             System.out.println("Answer:");
 			 String c = sc.next();
 			    switch(c) 
 			    {
 			    	     case "C":
 				         questions = Choice[2];
 				         {
 				         System.out.println("Correct Answer");
 				         }
 				         break;
 			             default:
 				        System.out.println("Wrong Answer");
 			             }
 			 

             System.out.println("4.Koodiyattam is a\r\n");
             System.out.println("\r\n[A]traditional dance of Kerala\r\n" + "[B]special food prepared in Tamilnadu\r\n" + 
                                "[C]boat race of Kerala\r\n" + "[D]dress worn in Karnataka\r\n");
             System.out.println("Answer:");
 			 String d = sc.next();
 	         switch(d) 
 			 {
 			             case "A":
 				         questions = Choice[0];
 				         {
 				         System.out.println("Correct Answer");
 				         }
 				         break;
 			             default:
 				         System.out.println("Wrong Answer");
 			             }

             System.out.println("5.The theory of classical music is discussed in?\r\n");
             System.out.println("\r\n[A].Samaveda\r\n" + "[B].Yajurveda\r\n" +"[C].Rigveda\r\n" +"[D].Atharvaveda\r\n");
             System.out.println("Answer:");
 			 String e = sc.next();
 	
 			    switch(e) 
 			    {
 			             case "A":
 				         questions = Choice[0];
 				         {
 				         System.out.println("Correct Answer");
 				         }
 				         break;
 			             default:
 				         System.out.println("Wrong Answer");
 			             }
 			 
 			 	}
       }
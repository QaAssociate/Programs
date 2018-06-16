/* To find monthly expense and savings  of a person
Input : Salary,Expense in each category(food,Travel,Accomodation)
Expected  Output : Total expense and  Total Saving of One month.*/

package com.piedistrict;

import java.util.Scanner;

public class Savings {

	public static void main(String[] args) 
	{
		int salary, food, Travel,acd, n, m , a, s;
		double total;
		salary = 8500;
		Scanner sc = new Scanner(System.in);
		System.out.println("Name           = Arya ");
		System.out.println("Designation    = QA Associate");
		System.out.println("Salary         = " + salary);
		System.out.println("Food Expence   =");
		food = sc.nextInt();
		System.out.println("Travel expence =");
		Travel = sc.nextInt();
		System.out.println("Accomodation   = ");
		acd = sc.nextInt();
		n = food * 22;
		m = Travel * 22;
		total = n + m + acd;
		System.out.println("Food expence in a month   = " + n);
		System.out.println("Travel expence in a month = " + m);
		System.out.println("Total                     = " + total);
		System.out.println("Savings                   = " + (salary - total));

	}

}

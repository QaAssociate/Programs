package com.piedistrict.java;

public class Contentequals {

	public static void main(String[] args) {
		String str1="Arya is a good girl";
		String str2="arya is a good girl";
		System.out.println("The string 1 : "+ str1);
		System.out.println("The string 2 : "+ str2);

		boolean str4= str1.contentEquals(str2);

		System.out.println("The string 2 contains in string 1 : "+str4);

	}

}

package com.java.basic;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("Enter the Number you want to print multi table : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println("This is the Multiplication Table for Num"+num +" : "+num*i);
		}

	}

}

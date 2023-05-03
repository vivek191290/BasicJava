package com.java.basic;

import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int num = scan.nextInt();
		
		if(num > 0)
		{
			System.out.println(num +" " + "Number is Positive");
		}
		else if(num < 0)
		{
			System.out.println(num +" " + "Number is Negative");
		}

		else
		{
			System.out.println(num +" "+ "Number is Zero");
		}
	}

}

package com.java.basic;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	System.out.println("Enter a Frist number :");
	
	int num1 = scan.nextInt();
	
	System.out.println("Enter a second number");
	
	int num2 = scan.nextInt();
	
	if(num1 > num2)
		System.out.println(num1+"  "+" First number is Greater");
	else
		System.out.println(num2+ "  "+"Second number is Greater");
	}

}

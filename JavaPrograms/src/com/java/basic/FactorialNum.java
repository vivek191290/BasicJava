package com.java.basic;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		System.out.println("Enter a Number for Factorial :");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int factorial=1;
		for(int i=num; i>1; i--)
		{
			factorial = i*factorial;
			System.out.println("Factorial result is :" +factorial);
		}
	}

}

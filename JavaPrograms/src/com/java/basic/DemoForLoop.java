package com.java.basic;

import java.util.Scanner;

public class DemoForLoop {

	public static void main(String[] args) {
		System.out.println("Enter the num for Range 1..to print :");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=1; i<=num; i++)
		{
			System.out.println("This is the Range of Num 1..." +num +":"+" " +i);
		}
	}

}

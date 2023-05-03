package com.java.basic;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scanner = new Scanner(System.in);


	        System.out.print("Enter an integer: ");
	        int numInt = scanner.nextInt();
	        		
	        System.out.print("Enter a double: ");
	        double numDouble = scanner.nextDouble();


	        System.out.print("Enter a float: ");
	        float numFloat = scanner.nextFloat();


	        System.out.print("Enter a boolean (true/false): ");
	        boolean bool = scanner.nextBoolean();


	        System.out.print("Enter a character: ");
	        char ch = scanner.next().charAt(0);


	        System.out.print("Enter a string: ");
	        String str = scanner.next();


	        System.out.println("Integer: " + numInt);
	        System.out.println("Double: " + numDouble);
	        System.out.println("Float: " + numFloat);
	        System.out.println("Boolean: " + bool);
	        System.out.println("Character: " + ch);
	        System.out.println("String: " + str);
	        scanner.close();

	}

}

package com.java.basic;

import java.util.Scanner;

public class ArithmeticsOperation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a fisrt number");
		
		int num1 = scanner.nextInt();
		
		System.out.println("Enter a second number");
		
		int num2 = scanner.nextInt();
		
		System.out.println("Enter a Third number");
		
		int num3 = scanner.nextInt();
		
		if(num1 > num2 && num1>num3 )
		{
			System.out.println(num1 + " " + "First number is Greater than other number :");
			
			
		}
		else if(num2>num3)
		{
			System.out.println(num2 + " " +"Second number is Greater than other number :");
		}
		else
		{
			System.out.println(num3 + " " + "Third number is Greater than other number :");
		}
	   
		int result1 = num1 + num2 * num3;
        int result2 = num3 + num1 / num2;
        int result3 = num1 % num2 + num3;
        int result4 = num1 * num2 + num3;
        
        System.out.println("Result of num1 + num2 * num3"  + " "+result1);
        
        System.out.println("Result of num3 + num1 / num2"  + " "+result2);
        
        System.out.println("Result of num1 % num2 + num3"  + " "+result3);
        System.out.println("Result of num1 * num2 + num3"  + " "+result4);
		
        scanner.close();
	   
	   
	  
	   
	}
	
		
	}



package com.java.basic;

import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		
		System.out.println("This is dice game program");
		Random random = new Random();
		int num = random.nextInt(6) +1;
		
		switch(num)
		
		{
		case 1: System.out.println("one");
		break;
		case 2: System.out.println("Two");
		break;
		case 3: System.out.println("Three");
		break;
		case 4: System.out.println("Four");
		break;
		case 5: System.out.println("Five");
		break;
		default : System.out.println("Six");
		}

	}

}

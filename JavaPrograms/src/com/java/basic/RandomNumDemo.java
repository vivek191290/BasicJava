package com.java.basic;

import java.util.Random;

public class RandomNumDemo {

	public static void main(String[] args) {
		Random random = new Random();
		System.out.println("This is Flip coin program");
		int num = random.nextInt(2);
		
		if(num == 0)
		{
			System.out.println("Head");
	
		}
		else
		{
			System.out.println("Tail");
		}

	}

}

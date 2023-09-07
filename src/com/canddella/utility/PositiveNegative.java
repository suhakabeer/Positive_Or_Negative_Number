package com.canddella.utility;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int ch;
	do {
		System.out.println("Enter the number");
		int n = scanner.nextInt();
		boolean numberCheck = numberCheck(n);
		if(numberCheck)
		{
			System.out.println("The number is positive");
		}
		else 
		{
			System.out.println("The number is neagative");
		}
		System.out.println("Do you want to contine");
		scanner.nextLine();
		ch = scanner.nextLine().charAt(0);
		}while(ch =='y'||ch =='Y');
	}
	

	private static boolean numberCheck(int n) {
		
		
		return n>=0;
	}

}

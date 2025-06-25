package guviTask6;

import java.util.Scanner;

public class LargestAmong3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number : ");
		int number1 = sc.nextInt();
		
		System.out.println("Enter the second number : ");
		int number2 = sc.nextInt();
		
		System.out.println("Enter the third number : ");
		int number3 = sc.nextInt();

		if (number1>number2)
		{
			if (number1>number3)
			{
				System.out.println("Number 1 is greater " + number1);
			}
			else 
			{
				System.out.println("Number 3 is greater " +number3);
			}
		}
		else 
		{
			
			System.out.println("Number 2 is greater " +number2);
		}

	}

}

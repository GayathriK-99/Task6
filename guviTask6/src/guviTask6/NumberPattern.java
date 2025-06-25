package guviTask6;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		int num = 1;
		
		for (int i=0; i<=number; i++)
		{
			
			for (int j=1;j<=i&&num<=number;j++)
			{
				
				System.out.print(num + "");
				num++; 
			}
			System.out.println();
		}
	

	}

}

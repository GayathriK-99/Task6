package guviTask6;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
	    int originalNumber = number; // Store original number to compare later
		int reversed = 0;

		        // Reverse the number using for loop
		        for (; number != 0; number /= 10) {
		            int digit = number % 10;
		            reversed = reversed * 10 + digit;
		        }

		        // Check if original and reversed numbers are same
		        if (originalNumber == reversed) {
		            System.out.println(originalNumber + " is a palindrome.");
		        } else {
		            System.out.println(originalNumber + " is not a palindrome.");
		        }

		        sc.close();
		    }
		


	}



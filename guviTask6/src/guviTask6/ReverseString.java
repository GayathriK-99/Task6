package guviTask6;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String str =  sc.next();
		
		String reverse = " "; 
		char arr[]= str.toCharArray();
		for(int i=str.length()-1; i>=0;i--)
		{
			
			reverse +=  str.charAt(i);
					
		}
		
		System.out.println("The reverse of the string is : " + reverse);
	}

}

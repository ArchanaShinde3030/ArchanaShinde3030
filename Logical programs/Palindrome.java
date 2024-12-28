package interview.programs;

/* 
 * write a program to determine whether a number is Palindrome number 
 * A palindrome number is a number that is same after reverse. For example 151   
 * It can also be a string like mom 
 * */

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		int n,originalNumber,reverse=0,r=0;
		System.out.println("Enter Any Number : ");
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		originalNumber=n; // store original number in temp variable
		
		while(n!=0)
		{
			r=n%10; 
			reverse=(reverse*10) + r; 
			n=n/10;
			
		}
		
		
		if(reverse==originalNumber)
		{
			System.out.println(originalNumber + " is a palindrome number");
		}
		
		else
		{
			System.out.println(originalNumber + " is NOT a palindrome number");
		}
		
		
	}
}

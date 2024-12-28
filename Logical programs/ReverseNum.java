package interview.programs;

/* java program to reverse a number */

import java.util.Scanner;


public class ReverseNum 
{
	public static void main(String[] args) 
	{
		int n,rev=0;
		System.out.println("Enter Any Number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		while(n!=0)
		{
			rev=(rev*10)+(n%10);
			n=n/10;
		}
		System.out.println("Reverse number is : "+rev);
	}
}


/* program to find Factorial of given number*/

package interview.programs;

import java.util.Scanner;


public class Factorial 
{
	public static void main(String[] args) 
	{
		int i,fact=1,n;

		System.out.println("Enter any number : ");
		Scanner sc=new Scanner(System.in);

		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}

		System.out.println("Factorial of given number is "+fact);

	}
}

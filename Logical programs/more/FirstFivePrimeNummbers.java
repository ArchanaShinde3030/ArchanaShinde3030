import java.util.Scanner;

/* program to display first 5 prime numbers  */

public class FirstFivePrimeNummbers {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("How many prime numbers ? ");
		int size=sc.nextInt();
		
		int count=0; // to keep track of count of prime numbers
		int no=1; // to keep track of numbers 
		
		int c=0;
		
		while(count<size)
		{
			c=0;
			
			/* for loop to find out factors of numbers */
			
			for(int i=1;i<=no;i++)
			{
				if(no%i==0)
				{
					c++;
				}
			}
			
			
			// if number is divisible by itself and 1 , then value of c will be 2 and that number is prime number
			
			if(c==2)
			{
				System.out.print(no+" ");// display prime number
				count=count+1; // increase count of prime numbers which are displayed
			}
			
			no=no+1;
			
		}

	}

}

package interview.programs;

/* java program to check whether a number is prime or not */

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int number=4;
		
		boolean isPrime=true;
		
		for(int i=2;i<4;i++)
		{
			if(number%i==0)
			{
				isPrime=false;
				break;
			}
		}
		
		
		if(isPrime)
		{
			System.out.println("It is prime number");
		}
		
		else
		{
			System.out.println("Not a prime");
		}
		
		
		
	}
}

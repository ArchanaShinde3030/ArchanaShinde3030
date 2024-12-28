package interview.programs;


/* 
write a program to check whether given number is Armstrong number or not 

 Armstrong number is a number which is equivalent to sum of cubes of it's digits 
 
153 = 1 + 125 + 27

*/
public class ArmStrongNumber {

	public static void main(String[] args) {
	
		int answer=-1;
	
		int no=81;
		int sum=0;
		
		int originalNumber = no;
		
		while(answer!=0)
		{
			int digit=no%10;
			sum = sum + digit*digit*digit;
			answer=no/10;
			no=answer;
			
		}
		
		System.out.println(sum);

		System.out.println(originalNumber);
	
		if(sum==originalNumber)
			
			System.out.println("It is armstrong number");
		else
			
			System.out.println("It is NOT");
	}
}

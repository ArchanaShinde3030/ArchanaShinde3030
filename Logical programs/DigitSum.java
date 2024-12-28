package interview.programs;

/* 
 * 
 * write a program to print sum of digits from number
 * 
 *  e.g. number = 123
 *  
 *  1+2+3=6 
 *  
 *  sum=6 should be printed
 * 
 * */
public class DigitSum {

	
	public static void main(String[] args) 
	{
		
			int no=123 ,sum=0;
		
			
			
			while(no!=0)
			{
				int digit = no%10;
				
				sum = sum + digit;
				
				no=no/10;
			}
			
			System.out.println(sum);
			
			
	}
}

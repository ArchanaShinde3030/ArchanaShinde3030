package interview.programs;


/* write a program to generate a Fibonacci series */

public class Fibseries {

	public static void main(String[] args) {
		
	
//		                          
//		0      1    1     2   3    5
//	                         

		
		int no1=0;
		int no2=1;
		int sum=0;
		
	System.out.print(no1 + " " + no2 + " ");

	for(int i=1;i<=4;i++ )
	{
		sum = no1+no2;
		System.out.print(sum + " ");
		no1=no2;
		no2=sum;
	}
}
}

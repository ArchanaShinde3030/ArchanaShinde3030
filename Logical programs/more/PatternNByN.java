import java.util.Scanner;

/* Write a program to print N*N pattern */

public class PatternNByN {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter number of rows :- ");
		int rowsize=sc.nextInt();
		
		for(int i=1;i<=rowsize;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print("@ ");
				}
				else
				{
					System.out.print(". ");
				}
			}
			
			
			System.out.println();
			
		}
		

	}

}

import java.util.Scanner;

/* display nth element from an array */

public class NthElementArray {
	
	public static void main(String[] args) {
		
		/*int x; // variable declaration
		x=30; // variable initialization
		
		int y=40; // variable declaration and initialization at same place
		*/
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter POSITION :- ");
		int pos=sc.nextInt();
	
		
		int[] a= {10,20,30,40,50};
		
		if(pos<=a.length)
		{
		
				for(int i=0;i<a.length;i++)
				{
					if(i+1==pos)
					{
						System.out.println(a[i]);
					}
				}
		}
		else
		{
			System.out.println("Please enter number less than or eaual to " + a.length);
		}
		
	}

}

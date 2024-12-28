package interview.programs;

/* java program to print elements of an array at odd position */


public class PrintingOddArray {
	
	public static void main(String[] args) {
		
				// 0   1  2  3
		int[] a = {10,20,30,40};
		
		
		for(int i=0;i<a.length;i++)
		{
			if(i%2==1)
			{
				System.out.println(a[i]);
			}
		}

		
	}// main ends
	
}

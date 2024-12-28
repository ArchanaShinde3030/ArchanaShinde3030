package interview.programs;

import java.util.Arrays;

/* java program to print largest element from an array */

public class LargestNumberInArray {

	public static void main(String[] args) {
		
		
		
		int[] a= {5,20,30,20,30};
		int size=a.length;
					
		System.out.println(Arrays.toString(a));
		
		int max=a[0];
		
		for(int i=0;i<size-1;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
				
		System.out.println(max);

	
	}
}

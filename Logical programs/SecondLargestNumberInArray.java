package interview.programs;

import java.util.Arrays;

/* java program to print Second largest element from an array */

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
		
		int[] a= {50,40,10,20,30};
		
		int size=a.length;
		
		sort(a, size);
			
		System.out.println(Arrays.toString(a));
		
		
		System.out.println(a[a.length-2]);

	
	}
	
	
	static void sort(int[] a , int size)
	{

		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(a[i]>a[j])
				{
					int temp;
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}


	}
}

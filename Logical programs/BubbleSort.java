package interview.programs;

import java.util.Arrays;


public class BubbleSort {
	
	public static void main(String[] args) {

		int[] a= {50,40,30,20,10};
		
		int size=a.length;
				
		BubbleSort.sort(a, size);
		
		System.out.println(Arrays.toString(a));
		
		
		
	
	
	}//main ends



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
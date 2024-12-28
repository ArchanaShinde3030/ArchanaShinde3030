import java.util.Arrays;
import java.util.Scanner;

/* display unique element from an array */

public class PrintNonDuplicateFromArrayava {
	
	public static void main(String[] args) {
		

		int[] a= {10,20,20,30,40,20,50,40};
		
		Arrays.sort(a);// [10,20,20,20,30,40,40,50]
		
		if(a[0]!=a[1])
			System.out.println(a[0]);
		
		if(a[a.length-1]!=a[a.length-2])
			System.out.println(a[a.length-1]);
		
		for(int i=1;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1] && a[i]!=a[i-1])
				System.out.println(a[i]);
		}
		

	}

}

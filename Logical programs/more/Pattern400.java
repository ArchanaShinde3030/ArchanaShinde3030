
public class Pattern400 {
public static void main(String[] args) {
	
	
	for (int i=400 ; i>=200 ; i = i-100)
	{
		
	     for(int j=1;j<=i/100;j++)
	    {
			System.out.print(i*(j+1) + " ");
	    }
	     
	     System.out.println();
	     System.out.println(i);
	}
	
	
	System.out.println("Reverse:- ");
	
	for(int i=200; i<=400; i=i+100) {
		
		System.out.println(i);
		
		for(int j=1; j<=i/100; j++)
		{
			
			System.out.print(j*i+i + " ");
			
		}
		System.out.println();
	}
	
}
}

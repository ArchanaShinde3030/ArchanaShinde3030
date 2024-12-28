package interview.programs;

/* Java program to reverse a string using swapping of characters */

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class ReverseString2 {

	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
	    System.out.println("Enter String :-  ");
	    
	    String s=br.readLine();
	    
	    char[] ch=s.toCharArray();// [j][a][v][a]
	    
	   
		
	    //i 0,1,2,3<4=ch.length
	    
	    	int index=0;
	    	
	    for(int i=ch.length-1;i>=ch.length/2;i--)
	    {
	    	char temp;
	    	temp=ch[i];
	    	ch[i]=ch[index];
	        ch[index]=temp;

	    	index++;
	    }
	    
	    System.out.println(ch);
	    
	    
	    
	    
	    
	    
	}
}

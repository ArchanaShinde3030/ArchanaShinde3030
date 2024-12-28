/* java program to reverse a string */

package interview.programs;

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class ReverseString {

	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
	    System.out.println("Enter String :-  ");
	    
	    String s=br.readLine();
	    
	    char[] ch=s.toCharArray();
	    
	    char[] ch2 = new char[ch.length]; 
		
	   
	    
	    	int index=0;
	    	
	    for(int i=ch.length-1;i>=0;i--)
	    {
	    	ch2[index]=ch[i];
	    	index++;
	    }
	    
	    System.out.println(ch2);
	    
	    
	    
	    
	    
	    
	}
}

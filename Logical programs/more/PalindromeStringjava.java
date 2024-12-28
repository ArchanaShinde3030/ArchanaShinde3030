import java.util.Scanner;

/* program to check whether string is palindrome or not */

public class PalindromeStringjava {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String :- ");
		String word=sc.next(); // mom
	
		StringBuffer sb=new StringBuffer(); // [mom] StringBuffer object
		
		for(int i=word.length()-1;i>=0;i--)
		{
			sb.append(word.charAt(i));
		}
		
		
		String reverseString=sb.toString();  // converting StringBuffer to String
		
		
		/* if reverseString and original string are equal then it is palindrome string */
		
		if(reverseString.equals(word))
		{
			System.out.println("palindrome string");
		}
		else
		{
			System.out.println("Not palindrome string");
		}
	}

}

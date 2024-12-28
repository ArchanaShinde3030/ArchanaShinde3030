/* java from to check whether vowel is present in a string
 	a,i,e,o,u are vowels
 */

package interview.programs;

public class CheckVowel {

	public static void main(String[] args) {
		
		String s = "java";
		boolean isFound=false;
		
		for(int index=0;index<s.length();index++)
		{
			char c = s.charAt(index);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
				isFound=true;
				break;
			}
		}
		
		
		if(isFound)
		{
			System.out.println("Vowel Present");
		}
		else
		{
			System.out.println("Vowel NOT Present");
		}
	}
}

package interview.programs;

/* write a program to convert digit to word 
 * 
 * 240 - two four zero
 * 
 * */
public class DigitToWord {

	public static void main(String[] args) 
	{
	
		String[]  numbers = {"zero","one","two","three","four","five","six","seven","eight","nine"};
				    //  0      1     2      3      4       5     6      7       8      9
		
		int no=240 ;
		
		String word = "";
			
			while(no!=0)
			{
				int digit = no%10;// digit = 2
				
				word = word + numbers[digit] + " ";
				
				no=no/10;//0

			}
			
			
			System.out.println(word);
			
			String[] words = word.split(" "); // words [zero][four][two]
							  //         0      1    2
						
			for(int i=words.length-1 ; i>=0 ; i--)
			{
				System.out.print(words[i] + " ");
			}
			
	}
}

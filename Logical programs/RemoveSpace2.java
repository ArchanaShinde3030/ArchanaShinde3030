/* java program to remove space from a string */

package interview.programs;

public class RemoveSpace2 {

	
	public static void main(String[] args) {
		
		
		String s = "java is  easy";
		
		StringBuffer  stringBuffer = new StringBuffer();
		
		char[] ch=s.toCharArray();
		
		// copy all characters from original string into stringBuffer object except ' ' character
		
		for(char c : ch)
		{
			if(c!=' ')
				stringBuffer.append(c);
						
		}
				
		s=stringBuffer.toString();
		
		System.out.println(s);
	
	}
}

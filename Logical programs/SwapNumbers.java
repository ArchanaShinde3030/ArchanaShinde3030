
/* swapping of 2 numbers without using third variable*/

package interview.programs;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int no1=10,no2=20;
		
		System.out.println("Before swapping :-  " + "no1= " + no1 + " no2= " + no2);
		
		
		no1= no1+no2;
		no2=no1-no2;
		no1=no1-no2;
		
		System.out.println("Before swapping :-  " + "no1= " + no1 + " no2= " + no2);
	}
}

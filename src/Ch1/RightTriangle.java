//Demonstrate Formula writing for right traingle
/**
 * author Naresh P
 * since 2018
 * version 1.1
 */

package Ch1;

public class RightTriangle {

	public static void main(String[] args) {
	
		int a,b,c;
		
		a = 10;
		b = 20;
		
		c = a * a + b * b;
	
		System.out.println("value of c is: "+ c);
		
		if (c == 550){
			System.out.println("It is rightangle triangle.");	
		}
		else
			System.out.println("Something is wrong with this triangle.");
	}

}
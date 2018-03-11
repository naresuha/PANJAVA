//Program to add digit within an integer.

/**
 * @ Author Naresh
 * @ Since 2018
 * @ version 1.1
 */
package Ch1;

public class AddInterger {

	public static void main(String[] args) {
		
		int j  = 786;
		
		int firstdigit = j % 10;
		int remainingnumber = j / 10;
		int seconddigit = remainingnumber % 10;
		remainingnumber = j / 10;
		int thirddigit = remainingnumber % 10;
		
		int countofdigits = firstdigit + seconddigit + thirddigit;
		
		System.out.println("Digit Count In a number: " + countofdigits);			
	}

}

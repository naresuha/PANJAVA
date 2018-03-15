// Program to calculate Largest No Among available Nos.
/**
 * @author Naresh
 * @since 2018
 * @version 1.1
 */

package Ch2;

public class GreatestNo {

	public static void main(String[] args) {
		int num1,num2,num3;
		num1 = 25;
		num2 = 100;
		num3 = 89;
		
		if (num1 > num2 & num1 > num3)
		{
			System.out.println("Largest No is:" + num1);
		}
			else
			{
				if (num2 > num1 & num2 > num3)
				System.out.println("Largest No is: " + num2);
			}
			else
			{
			System.out.println("Largest No is: " + num3);
			}
		}
	}

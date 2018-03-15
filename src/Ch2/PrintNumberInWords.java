//Print Number in words
/**
 * Author Naresh P
 * Year 2018-19
 * Version 1.1
 */
package Ch2;

public class PrintNumberInWords {

	public static void main(String[] args) {
		int number;
		number = 9;
		
		Switch(number)
		{
			case 1:
				System.out.println("Number is: ONE");
			break;
			case 2:
				System.out.println("Number is: TWO");
				break;
			case 3:
				System.out.println("Number is: THREE");
				break;
			case 4:
				System.out.println("Number is: FIVE");
				break;
			Default:
				System.out.println("Number is invalid");
		}
		
	}

}

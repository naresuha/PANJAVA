//Print Number in words

/**
 * author Naresh P
 * year 2018-19
 * version 1.1
 */
package Ch2;

public class PrintNumberInWords {

	public static void main(String[] args) {
		int number;
		number = 5;
		
		switch(number)
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
				System.out.println("Number is: FOUR");
				break;
			case 5:
				System.out.println("Number is: FIVE");
				break;
			default:
				System.out.println("Number is invalid");
		}
		
	}

}

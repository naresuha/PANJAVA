//Nested Try Statements.
/**
 * author Naresh P
 * since 2018
 * version 2.0
 */
package Ch10;

public class MultiTry {

	public static void main(String[] args) {
		
		try {
			int b=1;
			int c=0;
			int a = b/c;
			System.out.println("Value with an error!");
			try {
				if (c == 1);
				{
					a = b/(c-c);
				}
				if(c==2);
				{
					int d[] = {1};
					d[42] = 99;
				}
			}
				catch (ArrayIndexOutOfBoundsException e){
					System.out.println("Array Index out of bound: "+ e);
						}
				catch (ArithmeticException e){
					System.out.println("Divide by zero: "+ e);
				}
			}
		}
	}

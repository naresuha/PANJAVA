//Try & Catch Methods
/**
 * author Naresh P
 * since 2018
 * version 2.0
 */
package Ch10;

public class Exec1 {

	public static void main(String[] args) {

		int a,b;
		a = 100;
		b = 0;
		try{
			int c = a/b;
			System.out.println("Operation with error" + c);
		}
		catch (ArithmeticException e){
			int c = b/a;
			System.out.println("Value:" + c);
		}
		System.out.println("Try & Catch Resolve Error");
	}
}
		
		
		
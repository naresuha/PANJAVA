//Attempt to perform multi-catch operations
/**
 * author Naresh P
 * since 2018
 * version 2.0
 */
package Ch10;

public class MultiCatch {

	public static void main(String[] args) {

		int a = args.length;
		float d [] = {0.1f,0.2f,0.5f,0.8f,0.9f};
				
		try{
			int b = 10;
			int c = b/a;
			System.out.println("Value C: "+ c);
			System.out.println("Value of index: "+ d[7]);
		}
		catch (ArrayIndexOutOfBoundsException e){
			float d1[] ={0.1f,0.2f,0.5f,0.8f,0.9f,2.4f,3.6f,6.7f}; 
			System.out.println("Value of an Index: " + d1[7]);
		}
		catch (ArithmeticException e){
			a = 1;
			int b = 10;
			int c = b/a;
			System.out.println("Value C: " + c);
		}
		System.out.println("Multiple catch working well!");
	}
}
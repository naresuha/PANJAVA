//Exception handling for Array
/**
 * author Naresh P
 * since 2018
 * version 2.0
 */
package Ch10;

public class Exec2 {

	public static void main(String[] args) {
		
		try{
			int [] mylist = {10,20,30,40,50,60};
			System.out.println(mylist[7]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			int [] mylist = {10,20,30,40,50,60,70,80,90};
			System.out.println("Index value: "+ mylist[7]);
			}
		System.out.println("Array index error handling by Try & Catch: Success!");
		}		
	}

//Demostrate String modification methods
/**
 * author Naresh P
 * since 2018
 * version 1.1
 */
package Ch7;

public class ModString {

	public static void main(String[] args) {
		
		String st1 = "Justfordoctor.com";
		//substring method - create new string using portion of existing string
		System.out.print("Result1: ");
		System.out.println(st1.substring(13));
		
		//substring method with fixed start and end index
		System.out.print("Result2: ");
		System.out.println(st1.substring(0, 4));
		
		//concat to combine two string
		
		String st2 = "  Please pay on time! Thank you ";
		System.out.print("Result_Concat: ");
		System.out.println(st1.concat(st2));
		
		//replace - to replace all occurence of specified charactor
		
		System.out.print("Result_Replace: ");
		System.out.println(st1.replace("com", "co.in"));
		
		//trim() mainly used to trim or remove blank spaces in a string.
		
		String st3;
		st3 = st2.trim();
		
		System.out.print("Result_Trim:");
		System.out.println(st3);
	}

}

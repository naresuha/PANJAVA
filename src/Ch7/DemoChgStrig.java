//Demonstrate String character change

/**author Naresh P
 * since 2018
 * version 1.1
 */

package Ch7;

public class DemoChgStrig {

	public static void main(String[] args) {

		////toUppercase() method to converts all characters to upper case.
		String st1 = "happy ganesh chathurti 2018!";
				System.out.print("All upper: ");
				System.out.println(st1.toUpperCase());
				
		//use of two methods - trim & toLowercase in single line applied on string
		String st2 = "  CHANGE IS LIFE  ";
		System.out.print("Result1=");
		System.out.println(st2.trim().toLowerCase());
		
		//Introduction to StringBuffer class.
		
		StringBuffer st = new StringBuffer(st1);
		st.append(" (Festivals)");
		System.out.println(st);
	}
	
}

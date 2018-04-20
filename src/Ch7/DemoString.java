//Demonstrate String and related operations

/**
 * author Naresh P
 * since 2018
 * version 1.0
 */

package Ch7;

public class DemoString {

	public static void main(String[] args) {

		String f_name = "Sanrus";
		String l_name = "Training";
		
		String Institue = f_name +" " + l_name;
		
		System.out.println("Institue Name: " + Institue);
		
		System.out.println("Langth of First name = " + f_name.length());
		
		char result = "Training".charAt(0); // CharAT method return value for Index 0 in String
		
		System.out.println(result);
		
		// new array 'Return' created from string st1 using toCharArray method 
		
		String st1 = "Welcome to Sanrus Training";
		
		System.out.println("Return: ");
		
		System.out.println(st1.toCharArray());
		
		// comparing two strings st1 & st2 using equals() method
		
		String st2 = "Welcome to Sanrus Training!";
	
		boolean str_result;
		
		str_result = st1.equals(st2);
		
		System.out.println("Is two strings same: "+ str_result);
		
		// use of toUpperCase to convert to upper case characters.
		
		String st3 = st1.toUpperCase();
	
		boolean str_result1;
		
		str_result1 = st1.equalsIgnoreCase(st3); // using equalIgnorecase method 
		
		System.out.println("Is two strings equal: "+ str_result1);
		
		//new string created & region from existing string compared with new string 
		
		String st4 = new String ("Sanrus");
		
		System.out.println("Is String region matching:" + st1.regionMatches(11, st4, 0, 5));
		
		//'startsWith' method - to determine is the string beings with string 'Sanrus'
		//'endsWith' method - to determine is the string ends with specific string
		// Both "startsWith" & "EndsWith" methods are case sensitive.
		
		String st5 = "Sanrus the best!";
		
		System.out.println("Is String beging with Sanrus: " + st5.startsWith("Sanrus"));
		System.out.println("Is String ends with best: "+ st5.endsWith("Best") );
		
		if (st2 == st5){ // Operator == used to check whether two strings are matching
			System.out.println("Both String are matching");
		}
			else
			{
				System.out.println("String are not matching");
			}
		
		//"compareTo" method - Result value determine Invoking string is greater or less than string compared.
		
		String st6 = "Sanrus is now in Bramton";
		String st7 = "Sanrus was in NorthYork";
		
		System.out.println("Result: "+ st6.compareTo(st7));
	
		/** "indexOf" & "lastindexOf' method will give you
		 * 1st & last occurance of specific chanarter in a string. 
		 */
		System.out.println("Found 1st Index: "+ st5.indexOf('t'));
		System.out.println("Found last Index: "+ st5.lastIndexOf('t'));
	}
	
}
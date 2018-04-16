//Demonstrate Interface declaration & basic usage
/**
 * author Naresh P
 * since 2018
 * version 1.0
 */

package Ch9;

interface animal{ // Interface called 'Animal' defined
	public void eat();
	public void sleep();
	public void feel();
}

public class Mamal implements animal{ // Class Mamal implement interface animal

	public void eat(){
		
		System.out.println("Mammal eats");
	}
		
	public void sleep(){
		
		System.out.println("Mammal sleeps");
			
		}

	public void feel(){
		
		System.out.println("Mammal feels change in weather");

	}
	
public static void main(String agrs[]){ // Defined as object M for class Manal
	
	Mamal M = new Mamal(); 
	
	M.eat(); // Class object M used animal interface methods
	M.sleep();
	M.feel();
	}
} 
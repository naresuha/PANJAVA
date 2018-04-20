//one more example of interfaces in Java Program
/**
 * author Naresh p
 * since 2018
 * version 2.0
 */

package Ch9;

interface nt1{
	
	final int a = 100;
	
	void display();
}

public class TestClass implements nt1 {
	
	public void display(){
		 
		 System.out.println("Suresh");
	}

public static void main (String agrs[]){
	
	TestClass t = new TestClass();
	
	t.display();
	
	System.out.print("Scored: "+ a);
	
	}
}

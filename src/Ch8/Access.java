//example 1 for Inheritance
/**
 * author Naresh P
 * since 2018
 * version 1.1
 */
package Ch8;

class A{
	int i;
	protected int j; // applied non-access modifier
		void Z(){
		System.out.println("i & j: "+ i +" "+ j);
	}
}

class B extends A{ // applied inheritance. B is sub-class of super class A
	
	int k;
	int sum;
	
	void Y(){
		sum = i + j+ k;
		System.out.println("sum of all: "+ sum);
	}
}

class Access{
	public static void main(String agrs[]){ 
		
		A superob = new A(); // super class called directly.
		B subob = new B(); // sub class called directly.
		
		superob.i = 100; // values assigned to variable from super class
		superob.j = 200;
		
		superob.Z();
		
		subob.k = 300; // value assigned to sub-class variable.
		subob.Y();
	}
}
//Program for call by reference
/**
 * author Naresh P
 * since 2018
 * version 1.1
 */

package Ch7;

class test1{
	
	int i;
	
	test1(int r){ // Complier read from right to left.
		 i = r;
	}
	void S(test1 a){
		a.i *= 2;
		
	}
}

public class CallByRef {
	public static void main(String agrs[]){
		test1 T1 = new test1(4);
		System.out.println("Value of A: "+ T1.i);
		
		T1.S(T1);
		System.out.println("Value of A After: "+ T1.i);
		
	}

}

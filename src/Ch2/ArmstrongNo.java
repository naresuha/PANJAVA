//Program to check Armstrong No.
/**
 * author Naresh
 * since 2018
 * version 1.1
 */
package Ch2;

public class ArmstrongNo {

	public static void main(String[] args) {
		
		int i,j,k,val;
		
		i = 3;
		j = 7;
		k = 1;
		val = 371;
		
		if (i*i*i + j*j*j + k*k*k == val){
			
			System.out.println("Number is Armstrong No.");
		}
		
		else 
			System.out.println("No is NOT an Armstrong No.");
	}

}

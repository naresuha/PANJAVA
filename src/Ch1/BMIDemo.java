//Program to Compute Body Mass Index

/**
 * @author Naresh
 * @since 2018
 * @version 1.1
 */

package Ch1;

public class BMIDemo {

	public static void main(String[] args) {

		float P,In,BMI,M;
		P = 452F;
		In = 72F;
		
		P = (float)(P * 0.4536);
		In = (float) (In * 0.0254);
		M = In * In;
		
		BMI = (P / M);
		
		System.out.println("BMI is: " + BMI);
	}

}

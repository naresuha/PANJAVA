//Compute Area of Rectangle with Constructor
/**
 * author Naresh P
 * since 2018
 * version 1.1
 */

package Ch6;

class rectangle{
	double width;
	double length;
	
	rectangle(double w, double l){ // Constructor defined here
		width = w;
		length = l;
	}
	
	float area(){ // Method defined here
		return (float)(length * width);
	}
	
}

public class AreaRectangle {
	
	public static void main(String agrs []){
		
		rectangle rec1 = new rectangle(10,10);
		rectangle rec2 = new rectangle(20,20);
		
		System.out.println("Area of Rectangle1: " + rec1.area());
		System.out.println("Area of Rectangle2: " + rec2.area());
	}

}

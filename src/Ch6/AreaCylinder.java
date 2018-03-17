//compute area of Cylinder with ''this'Key word
/**
 * author Naresh P
 * since 2018
 * version 1.1
 */

package Ch6;

class Cylinder {
	double radius;
	double height;
	double pi;
	
	//Defined constructor with 'this'keyword
	Cylinder(double radius,double height,double pi){
		this.radius = radius;
		this.height = height;
		this.pi = pi;
	}

	float area(){ // Define Method to calculate area of Cylinder
		return (float) ((2 * pi * radius * height)+(2 * pi * radius* radius));
	}
}

public class AreaCylinder{

	public static void main(String agrs[]){
	
	Cylinder C1 = new Cylinder(10,20,3.14);
	Cylinder C2 = new Cylinder (100,200,3.14);
	
	System.out.println("Area of 1st Cylinder: " + C1.area());
	System.out.println("Area of 2nd Cylinder: " + C2.area());
	}
}
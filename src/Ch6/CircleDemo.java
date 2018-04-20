//Program to introduce class

/**
 * author Naresh P
 * since 2018
 * version 1.1
 */

package Ch6;

class Circle {
	
	int r;
	double pi;
}
class CircleDemo{
	
public static void main(String agrs[]){
	
	Circle circle1 = new Circle();
	
	circle1.r = 10;
	circle1.pi = 3.14;
	
	double area;
	area = circle1.pi * (circle1.r * circle1.r);
	System.out.println("Area of Circle is: "+ area);
	
	}
}
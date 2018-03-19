//Program to define Inheritance, run-time polymorphism, 'super' key word & over-riding
/**
 * author Naresh P
 * since 2018
 * version 1.1
 */
package Ch8;

class Figure{
	
	double dim1;
	double dim2;
	
	Figure(double a, double b){
		dim1 = a;
		dim2 = b;
	}
	
	double area(){
		System.out.println("Area is not defined.");
		return 0;
	}
}

class Rectangle extends Figure{
	
	Rectangle(double a,double b){
		
		super(a,b);
	}
	
	double area(){
		System.out.println("Area is for Rectangle.");
		return dim1 * dim2;
	}
}
class triangle extends Figure{
	
	triangle(double a, double b){
		
		super (a,b);
	}
	
	double area(){
		System.out.println("Area is for Triangle.");
		return (dim1 * dim2)/2;		
	}
}
	
public class FindAreas {
	public static void main(String agrs[]){
		
		Figure f = new Figure(10,20);
		triangle t = new triangle(10,20);
		Rectangle r = new Rectangle(10,20);
		
		Figure Figuref;//Need to understand this!
		
		Figuref = r;
		System.out.println("Area is: "+ Figuref.area());
		
		Figuref = t;
		System.out.println("Area is: "+ Figuref.area());
		f.area();
		
		Figuref = f;
		System.out.println("Area is:" + Figuref.area());	
	}
}
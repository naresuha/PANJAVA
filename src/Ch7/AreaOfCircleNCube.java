//Define two areas to accommodate constructor & method overloading 
/**
 * author Naresh P
 * since 2018
 * version 1.1
 */

package Ch7;

class areas{
	
	double r,a,pi;
	
	areas(float r,float pi){ //overloading constructor 'areas'
		this.r = r;
		this.pi = pi;
	}
	areas(double edge){
		edge = a;
	}
	
	double vol(double a){ // overloading method 'vol'
		return (6 * a * a);
	}
	float vol(){
		return (float) (pi * r * r );
	}
}

public class AreaOfCircleNCube {
	public static void main(String agrs[]){
		
		areas C1 = new areas(2.0f,3.14f);
		areas C2 = new areas(3.0d);
		
		System.out.println("Area of Circle: "+ C1.vol());
		System.out.println("Area of Cube: " + C2.vol(3.0d));
		
	}
	
}

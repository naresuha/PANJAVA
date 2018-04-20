//Calculate Area of a Triangle with method

/**
 * author naresh
 * since 2018
 * version 1.1
 */

package Ch6;

class Triangle {

	double height;
	double base;
	
	float area(){
		 return (float) ((height * base) / 2);
	}
}

class AreaTriangle{
	public static void main(String agrs []){
		
		Triangle T1 = new Triangle();
		Triangle T2 = new Triangle();
		
		T1.height = 20.0d;
		T1.base = 20.0d;
		
		System.out.println("Area of Triangle1: "+ T1.area());
		
		T2.height = 40.0d;
		T2.base = 40.0d;
		
		System.out.println("Area of Traingle2: "+ T2.area());
	}	
		
}
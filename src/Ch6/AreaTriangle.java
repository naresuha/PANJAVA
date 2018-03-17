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
		float area;
		
		T1.height = 10d;
		T1.base = 10d;
		
		area = T1.area();
		System.out.println("Area of Triangle1: "+ area);
		
		T2.height = 20d;
		T2.base = 20d;
		area = T2.area();
		System.out.println("Area of Traingle2: "+ area);
	}	
		
}
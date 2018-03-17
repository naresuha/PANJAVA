//Famous Box Demo with multiple object for same class.
/**
 * author Naresh p
 * since 2018
 * version 1.1
 */
package Ch6;

class Box { 
	
	double width;
	double height;
	double length;
}

public class BoxDemo2 {

	public static void main(String agrs []){
		Box box1 = new Box();
		Box box2 = new Box();
		 
		box1.width = 10;
		box1.length = 20;
		box1.height = 30;
		
		box2.width = 100;
		box2.length = 200;
		box2.height = 300;
		
		float vol;
		
		vol = (float)(box1.width * box1.length * box1.height);
		System.out.println("Volume of Box1: "+ vol);
		
		vol = (float)(box2.width * box2.length * box2.height);
		System.out.println("Volume of Box2: " + vol);
		
	}
}

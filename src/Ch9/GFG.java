//Additional example for Java Interfaces
/**
 * author Naresh P
 * since 2018
 * version 2.0
 */
package Ch9;

interface vehicle{ // Interface defined named 'vehicle'
	
	void changegears(int a); // interface method defined here.
	void speedup(int b);
	void applybreak(int c);
	
	}

 class Bicycle implements vehicle { // Implement method for class Bicycle
	
	int upspeed; // Variables declared here.
	int downspeed;
	int gears;
	static int speed = 2;
	
	public void changegears(int newgears){ // Interface method used in class Bicycle
		
		gears = newgears;
	}		
	public void speedup(int increment){
		
		upspeed = speed + increment;
	}
	public void applybreak(int decrement){
		
		downspeed = speed - decrement;
	}
	public void printstate(){
		
		System.out.println("HighSpeed: "+upspeed + " Lowspeed: "+downspeed +  
		" Gears: "+ gears);
	}
	
}

public class GFG{
	
	public static void main(String agrs[]){
		
		Bicycle B1 = new Bicycle(); // Object B1 is created type Bicycle
		
		B1.changegears(3);
		B1.speedup(2);
		B1.applybreak(2);
		
		System.out.println("Bicycle Current Performance: ");
		B1.printstate();
	}
}
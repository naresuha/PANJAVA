//Program to demonstrate Method overriding & 'Super'
/**
 * author Naresh P
 * since 2018
 * version 1.10
 */

package Ch8;

class vehicle{
	
	double speed;
	int gear;
	
	vehicle(double s, int g){
		speed = s;
		gear = g;
	}
	void perform(){
		
		System.out.println("Max speed: "+ speed);
		System.out.println("No of gears: "+ gear);
	}
	
}

class bike extends vehicle{
	
	int tyre;
	
	bike(double s, int g,int t){
		super(s,g);
		tyre = t;
	}
	
	void perform(){ // Method 'perform' override
		super.perform(); // using 'super' key word method from super class
		System.out.println("No of Tyres: "+ tyre);
	}
}

public class BikeVeh {
	public static void main(String agrs[]){
		bike bike1 = new bike(80,2,2);
		bike bike2 = new bike(120,4,3);
		
	bike1.perform();
	bike2.perform();
		
	}

}
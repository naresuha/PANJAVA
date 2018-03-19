//program create multilevel hierarchy & use 'super' key word.
/**
 * author naresh
 * since 2018
 * version 1.1
 */

package Ch8;

class box{
	private double length;
	private double width;
	private double height;
	double vol;
	
	box(double l,double w, double h){
		length = l;
		width = w;
		height = h;
	}
	
	double vol(){
		return vol = length * width * height;
	}
}

class weightbox extends box{
	 
	double weight;
	
	weightbox(double l,double w, double h,double W){
		
		super (l,w,h);
		weight = W;
	}
}
class shipment extends weightbox {
	
	float cost;
	
	shipment(double l,double w, double h,double W,float c){
		
		super (l,w,h,W);
		cost = c;
	}
}

public class InfoShipment {

	public static void main(String agrs[]){
		
		shipment ship1 = new shipment(1.0,2.0,3.0,4.0,40.5f);
		shipment ship2 = new shipment(10.0,20.0,30.0,40.0,400.8f);
		
		System.out.println("Cost of shipment: $ " + ship1.cost);
		System.out.println("Volume of Shipment: "+ ship1.vol());
		System.out.println("Weight of shipment: " + ship1.weight);
		
		System.out.println("Cost of shipment for ship2: $ " + ship2.cost);
		System.out.println("Volume of shipment for ship2: " + ship2.vol());
		System.out.println("Weight of shipment for ship2: " + ship2.weight);
		
	}
}

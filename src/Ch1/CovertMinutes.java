//Program to convert Minutes to days & Year

package Ch1;

public class CovertMinutes {

	public static void main(String[] args) {
	
		int min = 3456789;
		
		int hours = min / 60;
		
		int days = hours / 24;
		
		int years = days / 365;
		
		System.out.println("No of hours: " + hours);
		System.out.println("No of days: " + days);
		System.out.println("No ot Years: "+ years);
	}

}

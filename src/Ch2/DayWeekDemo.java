//Program to Write Identify day of the week using Integer input

/**
 * @author Naresh
 * @since 2018
 * @version 1.1
 */

package Ch2;

public class DayWeekDemo {

	public static void main(String[] args) {
		
		int Day;
		Day = 5;
		
		if (Day == 1)
		{
			System.out.println("Week Day is Monday");
		}
		else if (Day == 2)
		{
			System.out.println("Week Day is Tuesday");
		}
		else if (Day == 3)
  		{
	  		System.out.println("Week Day is Wednesday");
  		}
		else if (Day == 4)
  		{
	  		System.out.println("Week Day is Thursday");
  		}
		else if (Day == 5)
  		{
	  		System.out.println("Week Day is Friday");
  		}
		else if (Day == 6)
  		{
	  		System.out.println("Week Day is Saturday");
  		}
		else if (Day == 7)
  		{
	  		System.out.println("Week Day is Sunday");
  		}
		else
			System.out.println("Week Day is invalid");
	}
}

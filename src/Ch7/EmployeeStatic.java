//Demonstrate Non-Access Type 'Static'
/**
 * author Naresh P
 * since 2018
 * version 1.1
 */
package Ch7;

class employee{
	
	int id;
	String name;
	static String company = "SP"; // Static 'Company' defined
	
	employee(int id,String name){ // Constructor defined
		this.id = id;
		this.name = name;
	}
	
	void print(){ // Method Defined
		
		System.out.println(id + " "+ name + " "+ company);
		//Static variable 'company'called directly inside a class where it is defined
	}
}

public class EmployeeStatic {
	public static void main(String agrs[]){
		
		employee e1 = new employee (36,"Naresh");
		employee e2 = new employee (30,"Taylor");
		
		e1.print();
		e2.print();
		
		System.out.println(employee.company); 
		// Static instance variable call with class name & dot operator
		
	}

}

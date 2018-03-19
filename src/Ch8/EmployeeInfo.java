//Develop Program using 'super' keyword for constructor
/**
 * name Naresh P
 * since 2018
 * version 1.1
 */

package Ch8;

class person{
	
	String firstname, lastname;

	person(String f_name,String l_name){ // Constructor defined
		firstname = f_name;
		lastname = l_name;
	}
}

class employee extends person{ // Sub class employee for super class person
	
	int id;
	float salary;
	
	employee (String f_name,String l_name, int id, float salary){ // constructor for sub class
		
		super(f_name,l_name); // using 'super' keyword calling constructor from super class
		this.id = id;
		this.salary = salary;
	}
		void display(){ // Method for sub class employee
			
			System.out.println("firstname"+ " "+"lastname"+ " "+ id + " "+ salary);
	}
}
		class EmployeeInfo{
			public static void main(String agrs[]){
				
				employee e1 = new employee("Ankit","Sharma",345,45000);
				employee e2 = new employee("Taylor","Brace",456,60000);
				e1.display();
				e2.display();
			}
}
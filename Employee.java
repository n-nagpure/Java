import java.util.Scanner;

class Employee{
	int Employee_id;		
	String Name;
	Double Salary;

	public Employee(int employee_id, String name, Double salary){		//parametrized Constructor
		Employee_id = employee_id;
		Name=name;
		Salary=salary;
	}
	void show(){
		System.out.println("\nEmployee id is "+Employee_id);
		System.out.println("Employee name is "+Name);
		System.out.println("Employee Salary is "+Salary);
	}
}

class Employee_record{
	public static void main(String args[]){

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your ID=");
		int Employee_id = sc.nextInt();
		System.out.print("Enter your name=");
		String Name = sc.next();
		System.out.print("Enter your Salary=");
		Double Salary = sc.nextDouble();
	
		Employee E = new Employee(Employee_id, Name, Salary);
		E.show();
		

	}	
}

package employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee_Service {
	
	List<Employee> detail = new ArrayList<>();
	
	public void Addemployee(Scanner scanner) {
	
		Employee obj = new Employee();
		System.out.println("Enter Id");
		obj.Id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Name");
		obj.Name = scanner.nextLine();
		System.out.println("Enter Department");
		obj.Department = scanner.nextLine();
		System.out.println("Enter Salary");
		obj.Salary = scanner.nextInt();
		detail.add(obj);	
	}
	
	public void printdetail() {
		
		for (int i = 0; i<=detail.size()-1; i++) {
			Employee emp = detail.get(i);
			System.out.println(emp.Id+ " "+emp.Name+ " "+emp.Department+ " "+emp.Salary );
		
		}
	}
}

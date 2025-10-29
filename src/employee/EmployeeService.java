package employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService {
	
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
		boolean id = false;
		for (int i = 0; i<=detail.size()-1; i++) {
			Employee emp = detail.get(i);
			if (obj.Id == emp.Id) {
				System.out.println("This Id is already present in list Enter difrent Id.");
				id = true;
			}
		}
		if (id ==false) {
			detail.add(obj);
			System.out.println("Employee added Succesfully");
		}
	}
	
	public void printdetail() {
		
		for (int i = 0; i<=detail.size()-1; i++) {
			Employee emp = detail.get(i);
			System.out.println(emp.Id+ " "+emp.Name+ " "+emp.Department+ " "+emp.Salary );
		
		}
	}
	
	public void searchemployee(Scanner scanner) {
		System.out.println("Enter ID or Name: ");
		int Searchkey  = scanner.nextInt();
		
		boolean found = false; 
		for (int i = 0; i<=detail.size()-1; i++) {
			Employee emp = detail.get(i);
			if(Searchkey == emp.Id) {
				System.out.println(emp.Id+ " "+emp.Name+ " "+emp.Department+ " "+emp.Salary );
				found = true;
				break;
			}
		}
		
		if(found == false) {
			System.out.println("This employee is not in a list");
		}
	
		/*var emp = detail.stream().filter(x -> x.Id == id).findFirst().orElse(null);
		
		if(emp == null) {
			System.out.println("This employee is not in a list");
		}
		else {
			System.out.println(emp.Id+ " "+emp.Name+ " "+emp.Department+ " "+emp.Salary );
		}*/
		
	}
}

package employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService {
	
	List<Employee> employeeList = new ArrayList<>();
	
	public void Addemployee(Scanner scanner) {
		Employee obj = new Employee();
		scanner.nextLine();
		System.out.println("Enter Name");
		obj.Name = scanner.nextLine();
		System.out.println("Enter Department");
		obj.Department = scanner.nextLine();
		System.out.println("Enter Salary");
		obj.Salary = scanner.nextInt();
		obj.Id = employeeList.size()+1;
		employeeList.add(obj);
		System.out.println("Employee added to database successfully!!");
		System.out.println("Your ID is: " + obj.Id);
	}
	
	public void printdetail() {
		
		if (employeeList.isEmpty()) {
			System.out.println("There is no data in Database!!");
		}
		
		for (int i = 0; i<=employeeList.size()-1; i++) {
			Employee emp = employeeList.get(i);
			System.out.println(emp.Id+ " "+emp.Name+ " "+emp.Department+ " "+emp.Salary );
		
		}
	}
	
	public void searchEmployee(Scanner scanner) {
		System.out.println("Enter ID or Name: ");
		String Searchkey  = scanner.next();
		
/*		boolean found = false; 
		for (int i = 0; i<=detail.size()-1; i++) {
			Employee emp = detail.get(i);
			if(emp.Name.equalsIgnoreCase(Searchkey) || String.valueOf(emp.Id).equalsIgnoreCase(Searchkey)) {
				System.out.println(emp.Id+ " "+emp.Name+ " "+emp.Department+ " "+emp.Salary );
				found = true;
				break;
			}
		}
		
		if(found == false) {
			System.out.println("This employee is not in a Database!!");
		}
*/	
		var result = employeeList
						.stream()
						.filter(emp -> emp.Name.equalsIgnoreCase(Searchkey) 
										|| String.valueOf(emp.Id).equalsIgnoreCase(Searchkey))
						.findFirst()
						.orElse(null);
		
		if(result == null) {
			System.out.println("This employee is not in a list");
		}
		else {
			System.out.println(result.Id+ " "+result.Name+ " "+result.Department+ " "+result.Salary );
		}
		
	}
}

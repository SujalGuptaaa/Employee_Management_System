package employee;

public class Employee {
	int Id, Salary;
	String Name, Department;
	
	public Employee(int id , String name , String Department, int salary ) {
		Id = id;
		Salary = salary;
		Name = name;
		this.Department = Department;
		
		
	}
	public Employee() {}
}

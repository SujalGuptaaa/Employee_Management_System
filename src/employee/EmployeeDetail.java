package employee;

import java.util.Scanner;

public class EmployeeDetail {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			EmployeeService emps = new EmployeeService();
			System.out.println("---------------------Employee System----------------------------");
			System.out.println("1. Add Employee");
			System.out.println("2. Search Employee");
			System.out.println("3. Print Employee");
			System.out.println("4. Exit");
			System.out.println("----------------------------------------------------------------");
			while (true) {
				
				int num = scanner.nextInt();
				
				if (num==1) {
					emps.Addemployee(scanner);
					System.out.println("Employee added Succesfully");
				}
				else if (num==2) {
					emps.searchemployee( scanner);
				}
				else if (num==3) {
					emps.printdetail();
				}
				else {
					break;
				}
				scanner.nextLine();
				System.out.println("----------------------------------------------------------------");
			}
			System.out.println("Program End");
		}
		catch(Exception exception)
		{
			System.out.println("Error Occured! Please restart");
		}
		finally
		{
			scanner.close();
		}
		
	}

}


/* 
Title of the Application: Employee Details
Author: B.KAMAL
Created Date: 02.04.2024
Last modified Date: 03.04.2024
Reviewed By:
Reviewed Date:
*/

public class Employee {
	int employee_Id;
	String name;
	String gender;
	String department;
	String designation;
	double grossSalary;

	public Employee(int employee_Id, String name, String gender, String department, String designation, double salary) {
		this.employee_Id = employee_Id;
		this.name = name;
		this.gender = gender;
		this.department = department;
		this.designation = designation;
		this.grossSalary = salary;
	}

	public double calculatesalary() {
		double  netSalary = ( grossSalary-((0.10*grossSalary)-(0.08*grossSalary)));
				return netSalary;

	}

	public void display() {
		System.out.println("Employee Details");
		System.out.println("Employee Id: " + employee_Id);
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Department: " + department);
		System.out.println("Designation: " + designation);
		System.out.println("netSalary: " + calculatesalary());
	}

	public static void main(String[] args) {

		Employee employee = new Employee(1000, "Kamal", "Male", "Development", "Employee", 30000.00);

		employee.display();}}
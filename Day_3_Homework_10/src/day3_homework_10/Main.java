package day3_homework_10;

public class Main {

	public static void main(String[] args) {
		
		// Inheritance Yapisini Anlamak
		
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		CustomerManager customerManager = new CustomerManager();
		EmployeeManager employeeManager = new EmployeeManager();
		
		customer.customerFirstName = "Dursun";
		customer.customerLastName = "K�kt�rk";
		customer.customerAge = 36;
		customer.customerEmail = "dursunserefkokturk@gmail.com";
		
		employee.customerFirstName = "Dursun";
		employee.customerLastName = "K�kt�rk";
		employee.customerAge = 36;
		employee.employeeSalary = 5000;
	}
}
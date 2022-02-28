package assignment20220225;

public class EmployeeService {

	public String addEmployee(String empName, double salary) {

		System.out.println("*** START addEmployee :: empName: " + empName);

		// TODO add employee to database

		System.out.println("*** END addEmployee :: empName: " + empName);
		return empName + " is Added Successfully";
	}

	public String removeEmployee(String empName) {
		return empName + " is Removed Successfully";
	}

	public String updateEmployee(String empName, String empNameToUpdate) {
		return empName + " is Updated Successfully to " + empNameToUpdate;
	}

	public String calculateSalary(String empName, double salary) {
		salary = salary + (salary * 0.1);
		return "Salary is " + salary + " for employee " + empName;
	}

	public String calculatePf(String empName, double salary) {
		double pf = salary * 0.1;
		return "PF of " + empName + " is " + pf;
	}

	public String calculateHis(String empName, long salary) {
		double his = salary * 0.05;
		return "HIS of " + empName + " is " + his;
	}
}

package assignment20220225;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test; //Jupiter is JUnit 5 
import assignment20220225.EmployeeService;

public class EmployeeServiceTest {

	@Test
	public void addEmployeeTest() {

		EmployeeService empService = new EmployeeService();

		String result = empService.addEmployee("Balaji", 1000);

		assertEquals("Balaji is Added Successfully", result);

	}

	@Test
	public void removeEmployeeTest() {
		EmployeeService empService = new EmployeeService();

		String result = empService.removeEmployee("Bhanu");

		assertEquals("Bhanu is Removed Successfully", result);
	}
	
	@Test
	public void updateEmployeeTest() {
		EmployeeService empService = new EmployeeService();

		String result = empService.updateEmployee("Bhanu", "Balaji");

		assertEquals("Bhanu is Updated Successfully to Balaji", result);
	}
	
	@Test
	public void calculateSalaryTest() {
		EmployeeService empService = new EmployeeService();

		String result = empService.calculateSalary("Bhanu", 1000);

		assertEquals("Salary is 1100.0 for employee Bhanu", result);
	}
	
	@Test
	public void calculatePfTest() {
		EmployeeService empService = new EmployeeService();

		String result = empService.calculatePf("Bhanu", 1000);

		assertEquals("PF of Bhanu is 100.0", result);
	}
	
	@Test
	public void calculateHisTest() {
		EmployeeService empService = new EmployeeService();

		String result = empService.calculateHis("Bhanu", 1000);

		assertEquals("HIS of Bhanu is 50.0", result);
	}

}

package assignment20220218;

/*
15. Write the code on below scenario :

Create an Employee Object which has the below members :

1. name : public member.
2. address : public member.
3. salary : private member
4. id : public member

you need to create three employee such as : CEO,Project Manager and Team Lead who will inherit all those properties.
You need to create one more super user HR who has access over the system and can see all the details of all employees. This class will contain one method calculatesalary which will give 
the salary of the employee as : employee's salary * hike (consider hike =10%).

Data Sample :

CEO : name : "Rajesh Kumar ", address : "SaltLake,Kolkata", salary : 70000, id :1, calculatedsalary : 70000*10%
*/

abstract class Hr {
	abstract double calculateSalary();
}

class Employee extends Hr {
	public String name;
	public String address;
	private double salary;
	public long id;
	Employee(String name, String address, double salary, long id){
		this.name= name;
		this.address = address;
		this.salary = salary;
		this.id = id;
	}
	double getSalary() {
		return salary;
	}
	@Override
	double calculateSalary(){
		return (salary/100)*10;
	}
}

class Ceo extends Employee {
	Ceo(String name, String address, double salary, long id){
		super(name, address, salary, id);
	}
}

class ProjectManager extends Employee {
	ProjectManager(String name, String address, double salary, long id){
		super(name, address, salary, id);
	}
}

class TeamLead extends Employee {
	TeamLead(String name, String address, double salary, long id){
		super(name, address, salary, id);
	}
}
 
public class Ques15
{
    public static void main(String[] args)
    {
    	Ceo ceo = new Ceo("Rajesh Kumar", "SaltLake, Kolkata", 70000, 1);
    	System.out.println("CEO: name: " + ceo.name + ", address: " + ceo.address + ", salary: " + ceo.getSalary() + ", id: " + ceo.id + ", calculatedSalary: " + ceo.calculateSalary());
    }
}

public class MainClass1 {

	public static void main(String[] args) {
		// creating object
		Employee emp1 = new Employee();
		System.out.println("first employee details");
		emp1.empName = "Ramesh";
		emp1.age = 23;
		emp1.gender = 'M';
		emp1.salary = 30000;
		emp1.empId = 23;

		emp1.greet();
		emp1.printDetails();
		emp1.education();
		System.out.println(" ");
		System.out.println("Second Employee detail");

		Employee emp2 = new Employee();
		emp2.empName = "Priya";
		emp2.age = 22;
		emp2.gender = 'F';
		emp2.salary = 35000;
		emp2.empId = 216;

		emp2.greet();
		emp2.printDetails();
		emp2.education();

	}

}

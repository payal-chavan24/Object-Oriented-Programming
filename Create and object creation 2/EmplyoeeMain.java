
public class EmplyoeeMain {

	public static void main(String[] args) {
		// creating object
		System.out.println("first object creation");
		Employee emp1 = new Employee();
		emp1.empName = "Ramesh";
		emp1.age = 23;
		emp1.gender = 'M';
		emp1.salary = 30000;
		emp1.empId = 23;
		emp1.greet();
		emp1.printDetails();
		emp1.education();
		emp1.unity();
		System.out.println("---------- ");

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
		emp2.unity();
		System.out.println("--------");
		System.out.println("third object creation");
		Employee emp3 = new Employee();
		emp3.empName = "Roshan singh";
		emp3.age = 29;
		emp3.gender = 'M';
		emp3.salary = 56000;
		emp3.empId = 280;
		emp3.greet();
		emp3.printDetails();
		emp3.education();
		emp3.unity();
		System.out.println("---------- ");

		System.out.println("fourth Employee detail");
		Employee emp4 = new Employee();
		emp4.empName = "Rahul Chavan";
		emp4.age = 25;
		emp4.gender = 'M';
		emp4.salary = 40000;
		emp4.empId = 367;
		emp4.greet();
		emp4.printDetails();
		emp4.education();
		emp4.unity();

	}

}

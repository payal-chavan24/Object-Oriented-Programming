
public class Employee {
	// global variable
	int empId;
	String empName;
	double salary;
	char gender;
	int age;

	// method
	void greet() {
		System.out.println("Hello welcome to company");
	}

	void printDetails() {
		System.out.println("Emplyoee Id =" + empId);
		System.out.println("Emplyoee age =" + age);
		System.out.println("Emplyoee Name =" + empName);
		System.out.println("Emplyoee Salary  =" + salary);
		System.out.println("Emplyoee gender  =" + gender);
	}

	void experience() {
		System.out.println("Fresher");
	}

	void education() {
		System.out.println("Under Graguate");

	}

}

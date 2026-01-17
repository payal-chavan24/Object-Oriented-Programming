public class EmployeeMain {
	public static void main(String args[]) {
		Employee1 emp1 = new Employee1();
		String a = emp1.empName = "Ramesh";
		double b = emp1.salary = 25000;
		int c = emp1.empId = 456;
		System.out.println("Name of Employee =" + a);
		System.out.println("Salary" + b + "/-");
		System.out.println("Emplyoee Id=" + c);
		System.out.println("------");
		Employee1 emp2 = new Employee1();
		String d = emp2.empName = "Rahul Sharma";
		double e = emp2.salary = 56000;
		int f = emp2.empId = 567;
		System.out.println("Name of Employee =" + d);
		System.out.println("Salary" + e + "/-");
		System.out.println("Emplyoee Id=" + f);
		System.out.println("------");

	}
}


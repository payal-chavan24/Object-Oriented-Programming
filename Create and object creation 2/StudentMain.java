
public class StudentMain {
	public static void main(String args[]) {
		System.out.println("first object creation");
		Student s1 = new Student();
		s1.name = "Payal Chavan";
		s1.age = 22;
		s1.city = "Pune";
		s1.gender = "female";
		s1.id = 24;
		s1.section = 'A';
		s1.display();
		s1.reading();
		s1.studying();
		s1.wrinting();
		s1.rule();
		System.out.println("--------");
		System.out.println("Second object creation");
		Student s2 = new Student();
		s2.name = "riya shetty";
		s2.age = 25;
		s2.city = "kalburgi";
		s2.gender = "female";
		s2.id = 27;
		s2.section = 'B';
		s2.display();
		s2.reading();
		s2.studying();
		s2.wrinting();
		s2.rule();
		System.out.println("--------");
		System.out.println("third object creation");
		Student s3 = new Student();
		s3.name = "Ajay khan";
		s3.age = 27;
		s3.city = "Hydrabad";
		s3.gender = "Male";
		s3.id = 30;
		s3.section = 'c';
		s3.display();
		s3.reading();
		s3.studying();
		s3.wrinting();
		s3.rule();
		System.out.println("--------");
		System.out.println("fourth object creation");
		Student s4 = new Student();
		s4.name = "Rohan Varma";
		s4.age = 32;
		s4.city = "Delhi";
		s4.gender = "male";
		s4.id = 90;
		s4.section = 'D';
		s4.display();
		s4.reading();
		s4.studying();
		s4.wrinting();
		s4.rule();

	}
}

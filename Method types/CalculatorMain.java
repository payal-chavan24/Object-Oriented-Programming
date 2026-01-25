
public class CalculatorMain {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println("Addition =" + c.printAdd(56, 98));
		System.out.println("substraction =" + c.printsub(67, 98));
		System.out.println("Multiplication =" + c.printmultiply(87, 6));
		System.out.println("Division =" + c.printdiv(65, 5));
		System.out.println("Modulus =" + c.printmodule(67, 5));
	}

}



public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		bank.accountHolderName = "Aasha Singh";
		bank.accountNumber = 56783646L;
		bank.balance = 25000.09;
		System.out.println("Holder Name =" + bank.accountHolderName);
		System.out.println("Account Number =" + bank.accountNumber);
		System.out.println("Balance =" + bank.balance);

	}

}

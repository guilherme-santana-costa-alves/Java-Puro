// Bank account with transfer, deposit, withdraw and loans features

package banco;

public class DriverForBankAccount {

	public static void main(String[] args) {
		BankAccount tom = new BankAccount("Tom");
		tom.deposit(500.0);
		BankAccount sandy = new BankAccount("Sandy");
		sandy.deposit(200.);
		tom.transfer(100.0, sandy);
		sandy.withdraw(50.0);
		sandy.withdraw(600.0);
		System.out.println(sandy.getBalance());
		tom.salary(300.0);
		tom.loan(500.0);
		tom.loan(29999.0);
	}

}

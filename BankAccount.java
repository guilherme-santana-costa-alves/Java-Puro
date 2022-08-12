package banco;

public class BankAccount {
	//Declaring variables
	private double balance;
	private String name;
	private double income;
	private double credit;
	//Initiating the constructor
	public BankAccount (String name) {
		this.name = name;
		balance = 0.0;
		income = 0.0;
	}
	
	// creating methods to get the values from the private variables
	public double getBalance () {
		return balance;
	}
	
	public String getName() {
		return name;
	}
	
	public double getIncome () {
		return income;
	}
	
	public double getCredit () {
		return credit;
	}
	
	// creating the deposit, withdraw, transfer, salary and loan method
	public void deposit(double amount) {
		balance += amount;
		System.out.println(name + " has deposited $" + amount + " the new balance is $" + balance);
	}
	
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println(name + " has withdraw $" + amount + " the new balance is $" + balance);
		}
		else {
			System.out.println("Withdraw of " + amount + " by " + name + " has failed");
		}
	}
	
	public void salary (double amount) {
		income += amount;
		System.out.println(name + " salary is $" + amount);
	}
	
	public void transfer (double amount, BankAccount acc) {
		if (this.balance < amount) {
			System.out.println("Transfers failed, maximum transfer possible is " + balance);
		}
		else {
			this.balance -= amount;
			acc.balance += amount;
			System.out.println("Deposit of $" + amount + " was sucessful " + "Account of " + this.name + " becomes $" + this.balance);
			System.out.println("Deposit of $" + amount + " by " + this.name + " was sucessful " + "Account of " + acc.name + " becomes $" + acc.balance);
		}
	}
	
	public void loan (double amount) {
		if (income * 2 > amount) {
			this.balance += amount;
			System.out.println("Loan of $" + amount + " was approved, your new balance is $" + this.balance);
		}
		else {
			System.out.println("Loan of $" + amount + " was denied, your income of $" + this.income + " is to low");
		}
	}
}

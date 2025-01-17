package jul3;

public class BankAccount {
	
	    private double balance;

	    public BankAccount(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
	    }

	    public void deposit(double amount, double interestRate) {
	        double interest = amount * (interestRate / 100);
	        balance += amount + interest;
	        System.out.println("Deposited $" + amount + " with " + interestRate + "% interest. New balance: $" + balance);
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public static void main(String[] args) {
	        BankAccount account = new BankAccount(1000);

	        account.deposit(500);


	        account.deposit(200, 5);

	        System.out.println("Final balance: $" + account.getBalance());
	    }
}


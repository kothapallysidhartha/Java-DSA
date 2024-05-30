class BankAccount{
	public double balance;
	public BankAccount(double initialBalance){
		this.balance=initialBalance;
		System.out.println("Initial Balance="+balance);
	}
	
	public void deposit(double amount){
		balance=balance+amount;
		System.out.println("Deposited= "+amount);
		displayBalance(balance);
	}
	
	public void withDraw(double amount){
		if(amount<balance){
			balance=balance-amount;
			System.out.println("Withdrawn= "+amount);
		}
		else{
			System.out.println("Insufficient funds for withDrawal.");
		}
		displayBalance(balance);
	}
	
	public void displayBalance(double balance){
		System.out.println("Current Balance= "+balance);
	}
}

class SavingsAccount extends BankAccount{
	public SavingsAccount(double initialBalance){
		super(initialBalance);
	}
	
	public void withDraw(double amount){
		if(balance-amount>100){
			super.withDraw(amount);
		}
		else{
			System.out.println("Withdrawals not allowed.Minimum balance of $100 must be maintained");
		}
	}
}

class Prog4{
	public static void main(String args[]){
		System.out.println("Bank Account");
		BankAccount acc=new BankAccount(500);
		acc.deposit(500);
		acc.withDraw(800);
		System.out.println();
		System.out.println("Savings Account");
		SavingsAccount Acc=new SavingsAccount(600);
		Acc.withDraw(400);
	}
}

abstract public class Account {
    
    private long accountNo;
	private double balance=2000;
	User user;
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Account(){}
     
	public Account(long accountNo, double balance, User user) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
		this.user = user;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	abstract String deposit(double amount,long accountNo);
    abstract String withdrawal(double amount,long accountNo);
    abstract String showBalance(long accountNo);
    abstract String transferAmount(long accountNoSender,long accountNoReceiver,double transferAmount);
}

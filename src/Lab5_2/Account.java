package Lab5_2;

public class Account {
	protected int accountNo;
	protected String customerName;
	protected float balance;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(int accountNo, String customerName, float balance) {
		super();
		this.accountNo = accountNo;
		this.customerName = customerName;
		this.balance = balance;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	
	
	
	
	

}

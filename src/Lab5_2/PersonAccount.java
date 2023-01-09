package Lab5_2;

public class PersonAccount extends Account{
	protected float fee;
	
	public PersonAccount() {
		// TODO Auto-generated constructor stub
	}

	public PersonAccount(int accountNo, String customerName, float balance, float fee) {
		super(accountNo, customerName, balance);
		this.fee = fee;
	}
	
	
	public void withDraw() {
		
	}
	public void deposite() {
		
	}

	public float getFee() {
		return fee;
	}

	public void setFee(float fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "PersonAccount [fee=" + fee + ", accountNo=" + accountNo + ", customerName=" + customerName
				+ ", balance=" + balance + "]";
	}

	
	
	

	
	
	

}

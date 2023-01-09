package Lab5_2;

import java.util.Scanner;



public class SavingAccount extends Account {
	
	protected double rate;
	protected int period;
	
	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(int accountNo, String customerName, float balance, double rate, int period) {
		super(accountNo, customerName, balance);
		this.rate = rate;
		this.period = period;
	}

	public double getRate() {
		return rate;
		
		
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}
	
	public void checkInterest(Scanner sc) {
		System.out.println("Period: ");
		period = Integer.parseInt(sc.nextLine());
		if (period == 1) {
			rate = 0.05;
			
		}
		else if (period == 3) {
			rate = 0.055;
		} 
		else if (period == 6) {
			rate = 0.06;
		} 
		else if (period == 12) {
			rate = 0.07;
		}
		else if (period == 24) {
			rate = 0.075;
		}
		else if (period == 36) {
			rate = 0.08;
		} else {
			rate = 0.018;
		}
		
		balance *= rate;
		
		
		
		
		
		
		
	}

	@Override
	public String toString() {
		return "SavingAccount [rate=" + rate + ", period=" + period + ", accountNo=" + accountNo + ", customerName="
				+ customerName + ", balance=" + balance + "]";
	}
	
	public void intputData(Scanner sc) {
		System.out.println("Account no: ");
		this.accountNo = Integer.parseInt(sc.nextLine());
		System.out.println("Customer Name: ");
		this.customerName = sc.nextLine();
		System.out.println("Balance: ");
		this.balance = Float.parseFloat(sc.nextLine());
		
	}
	
	
	
	
	
	

}

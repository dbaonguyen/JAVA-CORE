package Lab5_2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PersonAccount per = new PersonAccount(1, "Nguyen", 10, 100);
		System.out.println(per.toString());
		SavingAccount sav = new SavingAccount();
		sav.intputData(sc);
		sav.checkInterest(sc);
		System.out.println(sav.toString());
		

	}

}

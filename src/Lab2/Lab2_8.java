package Lab2;

import java.util.Scanner;


public class Lab2_8 {
	public static void main(String[] args) {
		int luachon;
		int n=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("=============================Menu============================");
			System.out.println("1. Nhap n: ");
			System.out.println("2. Convert to binary: ");
			System.out.println("3. Convert to octal: ");
			System.out.println("4. Convert to hexa number: ");
			System.out.println("5. Exit");
			System.out.println("Moi ban nhap tu 1-5: ");
			luachon = sc.nextInt();
			
			
			switch (luachon) {
			case 1:
				System.out.println("Nhap n: ");
				n = sc.nextInt();
				
				break;
			case 2:
				String nhiphan = "";
				int thapPhan = n;
				while (thapPhan > 0) {
					nhiphan += thapPhan%2;
					thapPhan /= 2;
					
 				}
				String daoNguoc = "";
				for (int i = nhiphan.length()-1;i>=0;i--) {
					daoNguoc += nhiphan.charAt(i);
					
				}
				System.out.println(daoNguoc);
				break;
				
			case 3:
				String batphan = "";
				int thapphan = n;
				while (thapphan > 0) {
					batphan += thapphan %8;
					thapphan /= 8;
					
				}
				String daonguoc ="";
				for (int i = batphan.length()-1;i>=0;i--) {
					daonguoc += batphan.charAt(i);
					
				}
				System.out.println(daonguoc);
				break;
			case 4:
				String tlphan ="";
				int phan=n;
				while(phan>0) {
					tlphan += phan %16;
					phan /= 16;
					
				}
				String nguocdao ="";
				for (int i = tlphan.length()-1;i>=0;i--) {
					nguocdao += tlphan.charAt(i);
					
				}
				System.out.println(nguocdao);
				break;
			case 5:
				System.exit(0);
				break;

			default:
				System.out.println("Moi ban chon lai");
				break;
			}
		} while (1==1);
	}

	private static void exit(int i) {
		// TODO Auto-generated method stub
		
	}

}

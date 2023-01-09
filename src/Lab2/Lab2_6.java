package Lab2;

import java.util.Scanner;

public class Lab2_6 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap n: ");
			n = sc.nextInt();
		} while (n<2 || n >10);
		int gt=1;
		for (int i = 1;i<=n;i++) {
			gt *= i;
			
			
		}
		System.out.println("Giai thua cua "+n+" la: "+gt);

	}

}

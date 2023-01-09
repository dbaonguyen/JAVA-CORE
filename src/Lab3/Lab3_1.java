package Lab3;

import java.util.Scanner;

public class Lab3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so phan tu cua mang:");
		int n = Integer.parseInt(sc.nextLine());
		int[] arrInt = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("arrInt["+i+"]=");
			arrInt[i] = Integer.parseInt(sc.nextLine());
		}
		


	}
}

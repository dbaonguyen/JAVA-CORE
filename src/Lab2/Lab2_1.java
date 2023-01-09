package Lab2;

import java.util.Scanner;

public class Lab2_1 {

	public static void main(String[] args) {
		int so1,so2,so3,so4;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so 1: ");
		so1 = sc.nextInt();
		System.out.println("Nhap so 2: ");
		so2 = sc.nextInt();
		System.out.println("Nhap so 3: ");
		so3 = sc.nextInt();
		System.out.println("Nhap so 4: ");
		so4 = sc.nextInt();
		
		if (so1 > so2 && so1 > so3 && so1 > so4) {
			System.out.println("So 1 la so lon nhat.");
		}
		else if (so2 > so1 && so2 > so3 && so2 > so4) {
			System.out.println("So 2 la so lon nhat.");
		} 
		else if (so3 > so1 && so3 > so2 && so3 > so4) {
			System.out.println("So 3 la so lon nhat.");
		} 
		else {
			System.out.println("So 4 la so lon nhat.");
		}
		

	}

}

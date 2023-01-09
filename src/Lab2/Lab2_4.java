package Lab2;

import java.util.Scanner;

public class Lab2_4 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap canh a: ");
		a = sc.nextInt();
		System.out.println("Nhap canh b: ");
		b = sc.nextInt();
		System.out.println("Nhap canh c: ");
		c = sc.nextInt();
		
		if ((a + b) > c) {
			System.out.println("3 canh tao nen tam giac");
		} 
		else {
			System.out.println("3 canh k tao nen tam giac");
		}
		
		if ((a*a)+(b*b)==(c*c) && (a + b) > c) {
			System.out.println("Ba canh tao nen tam giac vuong");
		} 
		else if (a == b && a == c && b == c && (a + b) > c) {
			System.out.println("Ba canh tao nen tam giac deu");
		}
		else if (a==b && (a + b) > c) {
			System.out.println("Ba canh tao nen tam giac can");
		} 
		else if (a==b && (a*a)+(b*b)==(c*c) && (a+b)>c) {
			System.out.println("Ba canh tao nen tam giac vuong can");
		}
	}

}

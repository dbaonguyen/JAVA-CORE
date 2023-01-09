package Exception;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		System.out.println("Nhap vao so thu nhat: ");
		a = sc.nextInt();
		System.out.println("Nhap vao so thu hai");
		b = sc.nextInt();
		try {
			int c = a/b;
			
			System.out.println(c);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Error");
		} finally {
			System.out.println("Ok");
		}
		
		System.out.println("End");
		
		
		

	}

}

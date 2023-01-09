package Exception;

import java.util.Scanner;

public class Demo2 {
	int number;
	public void inputDataNumber(Scanner sc) throws Exception{
		System.out.println("Nhap so: ");
		number = sc.nextInt();
		if (number < 0) {
			throw new Exception("Xu ly voi gia tri num nhap vao nho hon 0");
			
		}
		System.out.println("num = "+number);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 demo2 = new Demo2();
		Scanner sc = new Scanner(System.in);
		boolean demo = Boolean.parseBoolean(sc.nextLine());
		System.out.println("demo= "+demo);
		try {
			demo2.inputDataNumber(sc);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		System.out.println("Lmao");

	}

}

package Lab3;

import java.util.Scanner;

public class Lab3_3 {

	public static void main(String[] args) {
		int n,m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		n = sc.nextInt();
		System.out.println("Nhap m: ");
		m = sc.nextInt();
		int[][] array = new int[n][m];
		do {
			int luachon;
			System.out.println("======================Menu=======================");
			System.out.println("1. Nhập giá trị các phần tử mảng");
			System.out.println("2. Hiển thị mảng vừa nhập theo ma trận");
			System.out.println("3. In giá trị các phần từ nằm trên đường biên");
			System.out.println("4. In giá trị và tổng các phần tử nằm trên đường chéo chính và đường chéo phụ");
			System.out.println("5. Sắp xếp các cột trong mảng tăng dần");
			System.out.println("6. Exit");
			System.out.println("Chon tu 1-6: ");
			luachon = sc.nextInt();
			
			switch (luachon) {
			case 1:
				for (int i=0;i<array.length;i++) {
					for (int j=0;j<array[i].length;j++) {
						System.out.println("Array["+i+"]["+j+"] = ");
						array[i][j] = sc.nextInt();
					}
				}
				break;
			case 2:
				for (int i=0;i<array.length;i++) {
					for (int j=0;j<array[i].length;j++) {
						System.out.print(array[i][j]);
						System.out.print("\t");
					}
					System.out.println();
				}
				
				
				break;
			case 3:
				for (int i=0;i<array.length;i++) {
					for (int j=0;j<array[i].length;j++) {
						if (i==0 || i==n-1 || j==0 || j==n-1) {
							System.out.print(array[i][j]);
							System.out.print("\t");
							} 
						else {
								System.out.print("\t");
							}
						
						
					}
					System.out.println();
				}
				break;
			case 4:
				int sum=0;
				for (int i=0;i<array.length;i++) {
					for (int j=0;j<array[i].length;j++) {
						if (i==j || i+j==array[i][j]-1) {
							sum += array[i][j];
							System.out.print(array[i][j]);
							System.out.print("\t");
						} else {
							System.out.print("\t");
						}
						
					}
					System.out.println();
				}
				System.out.println("Tong duong cheo chinh va duong cheo phu la: "+sum);
				
				break;
			case 5:
				int temp;
				for (int i=0;i<array.length;i++) {
					for (int j=0;j<array[i].length;j++) {
						for (int k=0;k<array[i].length;k++) {
							if (array[i][k] > array[i][k+1]) {
								temp = array[i][k];
								array[i][k] = array[i][k+1];
								array[i][k+1] = temp;	
						}
					}
				}
				
				
				}
				System.out.println("Mang sau khi duoc sap xep la: ");
				for (int i=0;i<array.length;i++) {
					for (int j=0;j<array[i].length;j++) {
						System.out.println("array["+i+"]["+j+"] = "+array[i][j]);
					}
				}
				break;
				
			case 6:
				System.exit(0);
				break;
			default :
				System.out.println("Moi ban nhap lai!");
			}
			
				
			
			
				
		} while (1==1);
		

	}

}
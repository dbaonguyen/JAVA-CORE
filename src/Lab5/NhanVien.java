package Lab5;

import java.util.Scanner;

public class NhanVien {
	
	private String hoTen;
	private String diaChi;
	
	public NhanVien() {
		
	}

	public NhanVien(String hoTen, String diaChi) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
	}
	
	public void inThongTin() {
		System.out.println("Họ và tên: "+hoTen);
		System.out.println("Địa chỉ: "+diaChi);
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhập họ và tên: ");
		hoTen = sc.nextLine();
		System.out.println("Nhập địa chỉ: ");
		diaChi = sc.nextLine();
	}

}

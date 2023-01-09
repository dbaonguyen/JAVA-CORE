package Lab5;

import java.util.Scanner;

public class GiangVien extends NhanVien {
	private String chuyenNganh;
	public GiangVien() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void nhapThongTin(Scanner sc) {
		// TODO Auto-generated method stub
		super.nhapThongTin(sc);
		System.out.println("Nhập vào chuyên ngành: ");
		chuyenNganh = sc.nextLine();
	}
	
	public GiangVien(String chuyenNganh) {
		super();
		this.chuyenNganh = chuyenNganh;
	}

	@Override
	public void inThongTin() {
		// TODO Auto-generated method stub
		super.inThongTin();
		System.out.println("Chuyên ngành giảng dạy: "+chuyenNganh);
	}
	
	
	

}

package Bkap;

import java.util.Scanner;

public class SinhVien {
	private String maSV;
	private String tenSV;
	private String lop;
	private float diemToan;
	private float diemLy;
	private float diemHoa;
	private float diemTB;
	
	public SinhVien() {
		
		
	}

	public SinhVien(String maSV, String tenSV, String lop, float diemToan, float diemLy, float diemHoa, float diemTB) {
		super();
		this.maSV = maSV;
		this.tenSV = tenSV;
		this.lop = lop;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
		this.diemTB = diemTB;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getTenSV() {
		return tenSV;
	}

	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}
	
	public void inputData(Scanner sc) {
		System.out.println("Nhập mã sinh viên: ");
		this.maSV = sc.nextLine();
		System.out.println("Nhập tên sinh viên");
		this.tenSV = sc.nextLine();
		System.out.println("Nhập lớp: ");
		this.lop = sc.nextLine();
		System.out.println("Nhập điểm toán: ");
		this.diemToan = Float.parseFloat(sc.nextLine());
		System.out.println("Nhập điểm lý: ");
		this.diemLy = Float.parseFloat(sc.nextLine());
		System.out.println("Nhập điểm hóa: ");
		this.diemHoa = Float.parseFloat(sc.nextLine());
		
	}
	
	public void displayData() {
		System.out.println("Mã Sinh viên: "+maSV);
		System.out.println("Tên Sinh viên: "+tenSV);
		System.out.println("Lớp: "+lop);
		System.out.println("Điểm toán: "+diemToan);
		System.out.println("Điểm lý: "+diemLy);
		System.out.println("Điểm hóa: "+diemHoa);
	}
	
	public float calDiemTB() {
		return (diemToan+diemLy+diemHoa)/3;
	}
	
	public String xeploaiSV() {
		String xepLoai;
		if (calDiemTB()>8) {
			return xepLoai = "Sinh viên xếp loại giỏi";
			
		} else if (calDiemTB()>6 && calDiemTB()<7) {
			return xepLoai = "Sinh viên xếp loại khá";
			
		} else {
			return xepLoai = "Sinh viên xếp loại trung bình";
		}
	}
	
	
	

}

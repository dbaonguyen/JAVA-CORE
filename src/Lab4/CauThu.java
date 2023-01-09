package Lab4;

public class CauThu {
	// thuộc tính
	public String tenCauThu;
	public String viTri;
	public String quocTich;
	// phương thức khởi tạo;
	public CauThu(String tenCauThu,String viTri, String quocTich) {
		this.tenCauThu = tenCauThu;
		this.viTri = viTri;
		this.quocTich = quocTich;
		
	}
	
	public String tenCLB;
	public Integer giaiHang;
	public Integer viTriTop;
	
	// phương thức in ra thông tin cầu thủ
	public void thongtinCauThu() {
		System.out.println("Thông tin cầu thủ: ");
		System.out.println("Họ Tên "+tenCauThu);
		System.out.println("Vị trí "+viTri);
		System.out.println("Quốc tịch "+quocTich);
	}
	
	
}

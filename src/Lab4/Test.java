package Lab4;

public class Test {
	public static void main(String[] args) {
		CauThu cauThu1 = new CauThu("Nguyễn Công Phương", "Tiền đạo cánh", "Việt Nam");
		CauThu cauThu2 = new CauThu("Haaland", "Tiền đạo cắm", "Na uy");
		CLB cauLacBo = new CLB("PSG",5,1);
		
		// truy cập vào thuộc tính 
		
		// truy cập vào phương thức
		cauThu1.thongtinCauThu();
		System.out.println();
		cauThu2.thongtinCauThu();
		System.out.println();
		cauLacBo.thongtinCLB();
		
	}

}

package Lab4;

public class CLB {
	public String tenCLB;
	public Integer giaiHang;
	public Integer viTriTop;
	
	public CLB(String tenCLB,Integer giaiHang, Integer viTriTop) {
		this.tenCLB = tenCLB;
		this.giaiHang = giaiHang;
		this.viTriTop = viTriTop;
		
	}
	
	
	public void thongtinCLB() {
		System.out.println("Thong tin clb: ");
		System.out.println("Ten: "+tenCLB);
		System.out.println("Giai Hang: "+giaiHang);
		System.out.println("Vi tri top: "+viTriTop);
	}
}

	



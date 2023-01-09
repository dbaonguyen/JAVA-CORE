package Thread;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LuongDon ld1 = new LuongDon();
		LuongDon1 ld2 = new LuongDon1();
		LuongRunnable ld3 = new LuongRunnable();
		
		
		System.out.println("Luong main");
		ld2.start();
		ld1.start();
		
		
	}

}

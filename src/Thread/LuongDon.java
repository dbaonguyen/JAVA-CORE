package Thread;

public class LuongDon extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		LuongDon luongdon = new LuongDon();
		luongdon.start();
	}
	

}

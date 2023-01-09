package Thread;

public class LuongDon1 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("Hello 2");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}

package Thread;

public class LuongRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("Hello Runnable");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	
	
}

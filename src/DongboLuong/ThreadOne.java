package DongboLuong;

import java.util.Random;

public class ThreadOne extends Thread{
	DataShared data;
	
	public ThreadOne() {
		// TODO Auto-generated constructor stub
	}

	public ThreadOne(DataShared data) {
		super();
		this.data = data;
	}
	
	@Override
	public void run() {
		Random r = new Random();
		while (true) {
			synchronized (data) {
				if (data.getControl() == 1) {
					int n = 1 + r.nextInt(50);
					data.setNumber(n);
					System.out.println("Thread One"+n);
					data.setControl(2);
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else {
					try {
						data.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}
	}
}

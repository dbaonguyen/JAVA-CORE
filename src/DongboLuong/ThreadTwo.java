package DongboLuong;

import java.util.Random;

public class ThreadTwo extends Thread {
	DataShared data;
	public ThreadTwo() {
		// TODO Auto-generated constructor stub
	}

	public ThreadTwo(DataShared data) {
		super();
		this.data = data;
	}
	
	@Override
	public void run() {
		Random r = new Random();
		while (true) {
			synchronized (data) {
				if (data.getControl() == 2) {
					int n = data.getNumber();
					if (n%2==0) {
						System.out.println("Thread two"+n+" la so chan");
						
					} else {
						System.out.println("Thread two"+n+" la so le");
						
					}
					data.setControl(1);
					data.notify();
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

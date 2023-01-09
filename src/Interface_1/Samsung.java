package Interface_1;

import Interface.ISmartPhone;
import Interface.Iphone;

public class Samsung implements Iphone,ISmartPhone {
	private String model;
	@Override
	
	public void nghe() {
		// TODO Auto-generated method stub
		System.out.println("Samsung đang nghe");
	}

	@Override
	public void goi() {
		// TODO Auto-generated method stub
		System.out.println("Samsung đang gọi");
	}
	
	public Samsung() {
		// TODO Auto-generated constructor stub
	}

	public Samsung(String model) {
		super();
		this.model = model;
	}

	@Override
	public void camUng() {
		// TODO Auto-generated method stub
		
	}
	
	

}

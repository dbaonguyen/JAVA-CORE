package Lab5_3;

public class Sony extends DigitalCamera {
	
	private boolean autoFocus;
	private boolean panorama;
	
	public Sony() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	

	public Sony(String make, String model, int megapixels, double price, boolean autoFocus, boolean panorama) {
		super(make, model, megapixels, price);
		this.autoFocus = autoFocus;
		this.panorama = panorama;
	}



	@Override
	public void capture() {
		System.out.println("Đã chụp ảnh!");
		
	}



	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		super.showDetails();
	}
	
	
	
	

}

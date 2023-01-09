package Lab5_3;

public class Samsung extends DigitalCamera{
	
	private boolean autoFocus;
	private boolean panorama;
	
	public Samsung() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Samsung(String make, String model, int megapixels, double price, boolean autoFocus, boolean panorama) {
		super(make, model, megapixels, price);
		this.autoFocus = autoFocus;
		this.panorama = panorama;
	}
	
	



	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		super.showDetails();
		System.out.println("autoFocus: "+ (autoFocus ? "Có" : "Không"));
		System.out.println("panorama: "+ (panorama ? "Có" : "Không"));
	}

	@Override
	
	public void capture() {
		// TODO Auto-generated method stub
		System.out.println("Máy SamSung: "+super.getModel());
	}
	
	
	

}

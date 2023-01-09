package Lab5_3;

public abstract class DigitalCamera {
	
	private String make;
	private String model;
	private int megapixels;
	private double price;
	public DigitalCamera() {
		// TODO Auto-generated constructor stub
	}
	public DigitalCamera(String make, String model, int megapixels, double price) {
		super();
		this.make = make;
		this.model = model;
		this.megapixels = megapixels;
		this.price = price;
	}
	
	public void showDetails() {
		System.out.println("Make: "+make);
		System.out.println("Model: "+model);
		System.out.println("Megapixel: "+megapixels);
		System.out.println("Price: "+price);
	}
	
	
	
	public String getModel() {
		return model;
	}
	
	public abstract void capture();
	
	

}

package Lab5_5;

public class Cylinder extends Circle {
	private double height;
	
	public Cylinder() {
		// TODO Auto-generated constructor stub
	}

	public Cylinder(double radius) {
		super(radius);
	}

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	public Cylinder(double radius, String color, double height) {
		super(radius, color);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		return (getRadius()*getRadius()*height*3.14);
	}
	
	
	
	

}

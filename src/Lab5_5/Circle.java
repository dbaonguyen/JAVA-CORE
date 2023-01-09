package Lab5_5;

public class Circle {
	private double radius = 1.0;
	private String color = "red";
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	

	public Circle(double radius) {
		super();
		this.radius = radius;
	}


	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return (3.14*radius*radius);
	}


	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
	
	
	

}

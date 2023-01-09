package Lab5_6;

public class Circle extends Shape {
	protected double radius;
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return (3.14*2*radius);
	}
	
	public double getPerimeter() {
		return (2*3.14*radius);
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
	
	
	
	
	
	
	
	

}

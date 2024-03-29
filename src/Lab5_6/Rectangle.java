package Lab5_6;

public class Rectangle extends Shape{
	protected double width;
	protected double length;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(String color, boolean filled, double width, double length) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea() {
		return width*length;
	}
	
	public double getPerimeter() {
		return (width+length)/2;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}
	
	

	
	
	
	
	
	

}

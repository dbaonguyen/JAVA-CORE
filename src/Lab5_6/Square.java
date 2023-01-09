package Lab5_6;



public class Square extends Rectangle{
	private double side;
	public Square() {
		// TODO Auto-generated constructor stub
	}
	public Square(double side) {
		this.side = side;
	}
	
	public Square(String color, boolean filled, double width, double length, double side) {
		super(color, filled, width, length);
		this.side = side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "Square [side=" + side + ", width=" + width + ", length=" + length + "]";
	}
	
	
	
	
	
	
	
	
	
	
}

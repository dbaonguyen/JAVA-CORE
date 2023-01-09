package DongboLuong;

public class DataShared {
	private int number;
	private int control = 1;
	public DataShared() {
		
	}
	public DataShared(int number, int control) {
		super();
		this.number = number;
		this.control = control;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getControl() {
		return control;
	}
	public void setControl(int control) {
		this.control = control;
	}
	
}

package Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;
import java.util.List;

public class Employee  {
	// định nghĩa các trường
	private String employeeId;
	private String employeeName;
	private int age;
	private float rate;
	private float salary;
	private boolean employeeStatus;
	private List<Employee> empList;
	// phương thức khởi tạo không tham số
	
	public Employee(){
		
		
	}
	
	
	
	// phương thức khởi tạo đủ tham số

	public Employee(String employeeId, String employeeName, int age, float rate, float salary, boolean employeeStatus) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.age = age;
		this.rate = rate;
		this.salary = salary;
		this.employeeStatus = employeeStatus;
	}
	
	
	

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public boolean isEmployeeStatus() {
		return employeeStatus;
	}

	public void setEmployeeStatus(boolean employeeStatus) {
		this.employeeStatus = employeeStatus;
	}
	// phương thức nhập thông tin nhân viên
	public void inputData(Scanner sc) {
		System.out.println("Nhap vao ma nhan vien: ");
		this.employeeId = sc.nextLine();
		System.out.println("Nhap vao ten nhan vien: ");
		this.employeeName = sc.nextLine();
		System.out.println("Nhap vao tuoi: ");
		this.age = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap vao he so luong");
		this.rate = Float.parseFloat(sc.nextLine());
		System.out.println("Nhap vao trang thai nhan vien: ");
		this.employeeStatus = Boolean.parseBoolean(sc.nextLine());
	}
	// phương thức hiển thị thông tin của nhân viên
	public void InThongTin() {
		System.out.println("EmployeeId: "+employeeId);
		System.out.println("EmployeeName: "+employeeName);
		System.out.println("EmployeeAge: "+age);
		System.out.println("SalaryRate: "+rate);
		System.out.println("EmployeeStatus: "+(employeeStatus ? "còn làm" : "Nghỉ việc"));
	}
	// phương thức tính tiền lương
	public float calSalary() {
		return rate*1300000;
	}



	


	
	
	

	
	
		
	
	
	
	


	
	
	
	
	
	
	

}

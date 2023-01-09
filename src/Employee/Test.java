package Employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

public class Test {

	public static void main(String[] args) {
		List<Employee> listEmployee = new ArrayList<Employee>();
		
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("========================Menu======================");
			System.out.println("1. Nhập thông tin cho n nhân viên");
			System.out.println("2. Tính lương tất cả nhân viên");
			System.out.println("3. Hiển thị thông tin tất cả nhân viên");
			System.out.println("4. Sắp xếp nhân viên theo lương tăng dần");
			System.out.println("5. Tìm kiếm nhân viên theo tên nhân viên");
			System.out.println("6. Cập nhật trạng thái nhân viên theo mã nhân viên");
			System.out.println("7. Thoát");
			System.out.println("Mời bạn chọn từ 1-7: ");
			int luachon = Integer.parseInt(sc.nextLine());
			
			switch (luachon) {
			case 1:
				System.out.println("Nhập vào số nhân viên muốn thêm: ");
				int n = Integer.parseInt(sc.nextLine());
				
				for (int i = 0;i<n;i++) {
					System.out.println("Nhập thông tin cho nhân viên thứ "+(i+1));
					Employee employee = new Employee();
					employee.inputData(sc);
					listEmployee.add(employee);
					
				}
				
				break;
			case 2:
				for (Employee employee : listEmployee) {
						System.out.println("Ho ten: "+employee.getEmployeeName()+", Luong: "+employee.calSalary());
				}
				
				break;
			case 3:
				for (Employee employee : listEmployee) {
					employee.InThongTin();
				}
				
				
				break;
			case 4:
				// Sắp xếp nhân viên theo lương tăng dần 
				for (int i = 0;i<listEmployee.size();i++) {
					for (int j = 0; j<listEmployee.size()-1;j++) {
						if(listEmployee.get(j).calSalary() > listEmployee.get(j+1).calSalary()) {
							Employee e = new Employee();
							e = listEmployee.get(j);
							listEmployee.set(j, listEmployee.get(j+1));
							listEmployee.set(j+1, e);
							
						}
					}
				}
				System.out.println("Danh sach luong tang dan: ");
				for (Employee employee : listEmployee) {
					employee.InThongTin();
				}
					
							
				break;
			case 5:
				// Tìm kiếm nhân viên theo tên
				System.out.println("Nhập vào tên nhân viên cần tìm: ");
				String eName = sc.nextLine();
				
				for (Employee employee : listEmployee) {
					if (employee.getEmployeeName().compareTo(eName)==0) {
						employee.InThongTin();
					}
					
				}
								
				break;
			case 6:
				System.out.println("Nhập vào mã nhân viên muốn cập nhật: ");
				String mnv = sc.nextLine();
				for (Employee employee : listEmployee) {
					if(employee.getEmployeeId().compareTo(mnv)==0) {
						//cách 1:
//						System.out.println("Nhập vào trạng thái muốn cập nhật");
//						Boolean status = Boolean.parseBoolean(sc.nextLine());
//						employee.setEmployeeStatus(false);
//						System.out.println("Cập nhật thành công");
						
						//cách 2:
						employee.setEmployeeStatus(!employee.isEmployeeStatus());
						System.out.println("Cập nhật thành công");
					}
				}
				break;
			case 7:
				System.exit(0);
				break;
			default:
				System.out.println("Mời bạn nhập lại");
				break;
			}
			
		} while (true);

	}

}

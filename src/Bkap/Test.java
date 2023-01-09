package Bkap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<SinhVien> dssv = new ArrayList<SinhVien>();
		do {
			int luachon;
			System.out.println("==========================Menu========================");
			System.out.println("1. Nhập thông tin cho n Sinh viên");
			System.out.println("2. Danh sách sinh viên");
			System.out.println("3. Hiển thị 3 sinh viên có điểm TB cao nhất");
			System.out.println("4. Hiển thị danh sách sinh viên sau khi xét loại học lực");
			System.out.println("Mời bạn chọn từ 1-4: ");
			luachon = Integer.parseInt(sc.nextLine());
			
			switch(luachon) {
			case 1:
				System.out.println("Nhập số sinh viên bạn muốn thêm: ");
				int n = Integer.parseInt(sc.nextLine());
				
				for (int i=0;i<n;i++) {
					System.out.println("Nhập thông tin cho sinh viên thứ: "+(i+1));
					SinhVien sinhVien = new SinhVien();
					sinhVien.inputData(sc);
					dssv.add(sinhVien);
				}
				
				break;
			case 2:
				System.out.println("Danh sách sinh viên: ");
				for (SinhVien sinhVien : dssv) {
					sinhVien.displayData();
				}
				
				break;
			case 3:
				for (int i=0;i<dssv.size();i++) {
					for (int j=0;j<dssv.size()-1;j++) {
						if(dssv.get(j).calDiemTB()<dssv.get(j+1).calDiemTB()) {
							SinhVien sv = new SinhVien();
							sv = dssv.get(j);
							dssv.set(j, dssv.get(j+1));
							dssv.set(j+1, sv);
						}
					}
				}
				// in ra 3 sv co diem tb cao nhat
				System.out.println("3 sinh viên đạt điểm trung bình cao nhất là: ");
				for (int i=0;i<3;i++) {
					dssv.get(i).displayData();
				}
				break;
			case 4:
				for (SinhVien sinhVien : dssv) {
					System.out.println("Họ tên sinh viên: "+sinhVien.getTenSV()+", Học lực: "+sinhVien.xeploaiSV());
				}
				break;
			default:
				
				break;
			}
			
			
		} while(true);
	}

}

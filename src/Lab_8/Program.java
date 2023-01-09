package Lab_8;

import java.io.File;
import java.io.IOException;

public class Program {
	public static void main(String[] args) {
		// tạo thư mục
//		Program.createFolder("D:\\FolderNew");
		// tạo mới file
		Program.createFile("D:\\FolderNew\\test.txt");
	}
	
	public static void createFolder(String path) {
		File file = new File(path);
		if (file.exists()) {
			System.out.println("Đường dẫn tồn tại");
		} else {
			file.mkdir();
			System.out.println("Thư mục đã được tạo mới: "+file.getAbsolutePath());
		}
		
	}
	// tạo file
	public static void createFile(String path) {
		File file = new File(path);
		if (file.exists()) {
			System.out.println("File đã tồn tại");
		} else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

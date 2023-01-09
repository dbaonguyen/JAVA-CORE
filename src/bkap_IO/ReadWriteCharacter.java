package bkap_IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteCharacter {
	public static void main(String[] args) {
		ReadWriteCharacter.writeCharacter("Category.txt");
	}
	
	public static void writeCharacter(String fileName) {
		try {
			FileWriter fw = new FileWriter(fileName);
			// ghi dữ liệu
			fw.write("File này là file category.txt");
			fw.close();
			System.out.println("Ghi file thành công");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	// doc file
	public static void readCharacter(String fileName) {
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line;
			System.out.println("Noi dung trong file");
			try {
				while ((line = br.readLine()) != null) {
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

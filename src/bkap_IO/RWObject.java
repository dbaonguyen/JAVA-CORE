package bkap_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class RWObject {
	public static void main(String[] args) {
		List<Category> listCategory = RWObject.readObject("data.txt");
		listCategory.add(new Category("C1", "Ao", false));
		listCategory.add(new Category("C2", "quan", true));
		listCategory.add(new Category("C3", "khan", false));
		System.out.println("ghi");
		RWObject.writeObject("data.txt", listCategory);
		
		// doc file object
		
		for (Category category : listCategory) {
			System.out.println(category.toString());
		}
	}
	
	public static void writeObject(String path,List<Category> listCategories) {
		try {
			FileOutputStream stream = new FileOutputStream(path);
			try {
				ObjectOutputStream inStream = new ObjectOutputStream(stream);
				inStream.writeObject(listCategories);
				stream.close();
				inStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static List<Category> readObject(String path){
		
			
			try {
				FileInputStream inputStream = new FileInputStream(path);
				try {
					ObjectInputStream stream = new ObjectInputStream(inputStream);
					List<Category> listCate = (List<Category>) stream.readObject();
					return listCate;
				} catch (IOException | ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		 
		return null;
		
	}

}

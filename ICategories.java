package Interface;

import java.util.List;
import java.util.Scanner;

import Class.Categories;

public interface ICategories {
	
	public void inputData(Scanner sc, List<Categories> listCategory) throws Exception; //Nhap thong tin danh muc
	public void displayData(); // In thong tin danh muc
	
	

}

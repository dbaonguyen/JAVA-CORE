package Interface;

import java.util.List;
import java.util.Scanner;

import Class.Categories;
import Class.Product;

public interface IProduct {
	float MIN_INTEREST_RATE = (float) 0.2;
	
	
	public void displayData(); // Hiển thị thông tin sản phẩm
	public void calProfit(); // Tính lợi nhuận trên các sản phẩm
	public void inputData(Scanner sc, List<Categories> listCategory, List<Product> listProducts) throws Exception;
	
		
	
	
	

}

package Class;

import java.io.Serializable;
import java.util.List;
import java.util.Locale.Category;
import java.util.Scanner;

import Interface.ICategories;

public class Categories implements ICategories,Serializable{
	
	private static final long serialVersionUID = 1L;
	private int catalogId;
	private String catalogName;
	private String decriptions;
	private boolean catalogStatus;
	private int parentId;
	private Category catalog;
	
	
	public Categories() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Categories(int catalogId, String catalogName, String decriptions, boolean catalogStatus, int parentId, Category catalog) {
		super();
		this.catalogId = catalogId;
		this.catalogName = catalogName;
		this.decriptions = decriptions;
		this.catalogStatus = catalogStatus;
		this.parentId = parentId;
		this.catalog = catalog;
	}
	

	public int getCatalogId() {
		return catalogId;
	}



	public void setCatalogId(int catalogId) {
		this.catalogId = catalogId;
	}



	public String getCatalogName() {
		return catalogName;
	}



	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}



	public String getDecriptions() {
		return decriptions;
	}



	public void setDecriptions(String decriptions) {
		this.decriptions = decriptions;
	}



	public boolean isCatalogStatus() {
		return catalogStatus;
	}



	public void setCatalogStatus(boolean catalogStatus) {
		this.catalogStatus = catalogStatus;
	}



	public int getParentId() {
		return parentId;
	}
	
	



	public Category getCatalog() {
		return catalog;
	}



	public void setCatalog(Category catalog) {
		this.catalog = catalog;
	}



	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	
	public boolean checkIdEx(List<Categories> listCategory, int maDM) {
		boolean check = false;
		for (Categories cate : listCategory) {
			if(cate.catalogId == maDM) {
				check = true;
				break;
				
			}
			
		}
		
		return check;
		
	}

	@Override
	public void inputData(Scanner sc, List<Categories> listCategory) throws Exception {
		// TODO Auto-generated method stub
		do {
			try {
				System.out.println("Mã danh mục: ");
				this.catalogId = Integer.parseInt(sc.nextLine());
				if (this.catalogId <= 0) {
					System.err.println("Sai định dạng");
				} else {
					// check điều kiện mã duy nhất
					if (this.checkIdEx(listCategory, catalogId)) {
						System.err.println(catalogId+" đã tồn tại, vui lòng nhập mã mới");
					}
					else {
						break;
					}
					
				}			
			} catch (Exception e) {
				
				System.err.println("Khong phai so nguyen");
			}
			
			
			
			
		} while (true);
		
		do {
			try {
				System.out.println("Tên danh mục: ");
				this.catalogName = sc.nextLine();
				if (this.catalogName.length()<6 || this.catalogName.length()>30) {
					System.err.println("Tên danh mục phải từ 6-30 ký tự");
				} else {
					break;
				}
				
			} catch (Exception e) {
				System.err.println("Không phải ký tự");
			}
			
		} while (true);
		
		do {
			
			System.out.println("Mô tả danh mục: ");
			this.decriptions = sc.nextLine();
			if (this.decriptions.length()==0) {
				System.err.println("Không được để trống");
			} 
			else {
				break;
			}
				
						
		} while (true);
		
		do {
			System.out.println("Trạng thái danh mục: ");
			String status = sc.nextLine();
			
			if (status.equals("true") || status.equals("false")) {
				this.catalogStatus = Boolean.parseBoolean(status);
				break;
				
			} else {
				System.err.println("Vui lòng nhập true hoặc false");

			}
			
		} while (true);
		
		do {
			try {
				System.out.println("Mã danh mục cha: ");
				this.parentId = Integer.parseInt(sc.nextLine());
				if(this.checkIdEx(listCategory, this.parentId)) {
					break;
				} else {
					if (this.parentId == 0) {
						break;
					} else {
						System.err.println("Danh mục cha không tồn tại");
					}
					
				}
				
			} catch (Exception e) {
				System.err.println("Không được bỏ trống hoặc nhập ký tự");
			}
			
			
			
		} while (true);
		
	}

	@Override
	public void displayData() {
		// TODO Auto-generated method stub
		System.out.println("Mã danh mục: "+catalogId);
		System.out.println("Tên danh mục: "+catalogName);
		System.out.println("Mô tả danh mục: "+decriptions);
		System.out.println("Trạng thái danh mục: "+(catalogStatus ? "Hoat dong" : "Khong hoat dong"));
		System.out.println("Mã danh mục cha: "+parentId);
		
		
	}
	
	
	
	



	
}

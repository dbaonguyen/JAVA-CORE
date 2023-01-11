package Class;

import java.util.Scanner;
import java.io.Serializable;
import java.util.List;


import Interface.IProduct;

public class Product<T> implements IProduct,Serializable{
	private static final long serialVersionUID = 1L;
	private String productId;
	private String productName;
	private String title;
	private float importPrice;
	private float exportPrice;
	private float profit;
	private String descriptions;
	private boolean productStatus;
	private Categories catelog;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Product(String productId, String productName, String title, float importPrice, float exportPrice,
			float profit, String descriptions, boolean productStatus, Categories catelog) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.title = title;
		this.importPrice = importPrice;
		this.exportPrice = exportPrice;
		this.profit = profit;
		this.descriptions = descriptions;
		this.productStatus = productStatus;
		this.catelog = catelog;
	}
	
	
	


	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public float getImportPrice() {
		return importPrice;
	}


	public void setImportPrice(float importPrice) {
		this.importPrice = importPrice;
	}


	public float getExportPrice() {
		return exportPrice;
	}


	public void setExportPrice(float exportPrice) {
		this.exportPrice = exportPrice;
	}


	public float getProfit() {
		return profit;
	}


	public void setProfit(float profit) {
		this.profit = profit;
	}


	public String getDescriptions() {
		return descriptions;
	}


	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}


	public boolean isProductStatus() {
		return productStatus;
	}


	public void setProductStatus(boolean productStatus) {
		this.productStatus = productStatus;
	}
	
	
	
	
	
	public Categories getCategory() {
		return catelog;
	}



	public void setCategory(Categories category) {
		this.catelog = category;
	}



	


	@Override
	public void displayData() {
		System.out.println("Mã sản phẩm: "+productId);
		System.out.println("Tên sản phẩm: "+productName);
		System.out.println("Tiêu đề sản phẩm: "+title);
		System.out.println("Giá nhập sản phẩm: "+importPrice);
		System.out.println("Giá bán sản phẩm: "+exportPrice);
		System.out.println("Mô tả sản phẩm: "+descriptions);
		System.out.println("Trạng thái sản phẩm: "+(productStatus ? "Hoat Dong":"Khong hoat dong"));
		System.out.println("Tên danh mục: "+catelog.getCatalogName());

		
		
	}
	@Override
	public void calProfit() {
		this.profit= exportPrice - importPrice;
		
	}
	public Categories findCateById(int categoryId,List<Categories> listCategory) {
		Categories cate = new Categories();
		for (Categories category : listCategory) {
			if (categoryId == category.getCatalogId()) {
				cate = category;
			}
			
			
		}
		return cate;
		
	}
	
	public boolean checkIdProEx(List<Product> listProduct, String maSP) {
		boolean check = false;
		for (Product product : listProduct) {
			if(product.productId.compareTo(maSP)==0) {
				check = true;
				break;
			}
		}
		return check;
	}



	@Override
	public void inputData(Scanner sc, List<Categories> listCategory, List<Product> listProduct) throws Exception {
		
		do {
			try {
				System.out.println("Mã sản phẩm: ");
				this.productId = sc.nextLine();
				if(this.productId.length() != 4) {
					System.err.println("Mã sản phẩm chỉ gồm 4 ký tự");

				} else {
					if (productId.charAt(0) != 'C') {
						System.err.println("Mã sản phẩm phải bắt đầu bằng ký tự 'C' ");
						
					} else {
						if(this.checkIdProEx(listProduct, productId)) {
							System.err.println(productId+" đã tồn tại, vui lòng nhập mã mới");
						} else {
							break;
						}
												
					}
					
				}
				
			} catch (Exception e) {
				System.err.println("Không phải ký tự");
			}
			
		} while (true);
		do {
			try {
				System.out.println("Tên sản phẩm: ");
				this.productName = sc.nextLine();
				if(this.productName.length() < 6 || this.productName.length() > 50) {
					System.err.println("Tên sản phẩm bao gồm 6-50 ký tự");
				} else {
					break;
				}
				
			} catch (Exception e) {
				System.err.println("Không phải ký tự");
			}
		} while (true);
		do {
			try {
				System.out.println("Tiêu đề sản phẩm: ");
				this.title = sc.nextLine();
				if(this.title.length() < 6 || this.title.length() > 30) {
					System.err.println("Tiêu đề sản phẩm bao gồm 6-30 ký tự");
					
				} else {
					break;
				}
				
			} catch (Exception e) {
				System.err.println("Không phải ký tự");
			}
			
		} while (true);
		do {
			try {
				System.out.println("Giá nhập sản phẩm: ");
				this.importPrice = Float.parseFloat(sc.nextLine());
				if (this.importPrice <= 0) {
					System.err.println("Giá nhập sản phẩm phải lớn hơn 0");
					
				} else {
					break;
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("Không phải số thực");
			}
			
		} while (true);
		do {
			try {
				System.out.println("Giá bán sản phẩm: ");
				this.exportPrice = Float.parseFloat(sc.nextLine());
				if (this.exportPrice < this.importPrice * MIN_INTEREST_RATE) {
					System.err.println("Giá trị phải lớn hơn giá nhập * 0.2");
				} else {
					break;
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("Không phải số thực");
			}
		} while (true);
		do {
				System.out.println("Mô tả sản phẩm: ");
				this.descriptions = sc.nextLine();
				if (this.descriptions.length() <= 0) {
					System.err.println("Không được để trống");
				} else {
					break;
				}
				
			
		} while (true);
		
		do {
			System.out.println("Trạng thái sản phẩm: ");
			String status = sc.nextLine();
			
			if (status.equals("true") || status.equals("false")) {
				this.productStatus = Boolean.parseBoolean(status);
				break;
			} else {
				System.err.println("Vui lòng nhập true hoặc false");
			}
			
		} while (true);
		do {
			try {
				System.out.println("Nhập vào mã danh mục: ");
				int maDM = Integer.parseInt(sc.nextLine());
				if (maDM <= 0 ) {
					System.err.println("Sai định dạng");
				} 
				else {
					this.catelog = this.findCateById(maDM, listCategory);
					break;
						
		
				}
				
			
				
				
			} catch (Exception e) {
				System.err.println("Ký tự không hợp lệ");
				
			}
			
		} while (true);
		
	}
	
	
	
	
	
	



	


	



	
	




	
	

}

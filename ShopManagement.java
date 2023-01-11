package Test;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import Class.Categories;
import Class.Product;

public class ShopManagement {
	static List<Categories> listCate = new ArrayList<Categories>();
	static List<Product> listPro = new ArrayList<Product>();
	
	public static <T> void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		listCate = ShopManagement.readObject("category.txt");
		listPro = ShopManagement.readObject("product.txt");
		
		
		do {
			int luachon = 0;
			System.out.println("***************************MENU**************************");
			System.out.println("1. Quan ly danh muc");
			System.out.println("2. Quan ly san pham");
			System.out.println("3. Thoat");
			try {
				System.out.println("Su lua chon cua ban: ");
				luachon = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.err.println("Không được bỏ trống hoặc nhập ký tự");
			}
			
			boolean check = true;
			
			switch (luachon) {
			case 1:
				do {
					System.out.println("*****************************QUAN LY DANH MUC******************************");
					System.out.println("1. Danh sach danh muc");
					System.out.println("2. Them danh muc");
					System.out.println("3. Xoa danh muc");
					System.out.println("4. Tim kiem danh muc");
					System.out.println("5. Quay lai");
					do {
						try {
							System.out.println("Su lua chon cua ban: ");
							luachon = Integer.parseInt(sc.nextLine());
							break;
						} catch (Exception e) {
							System.err.println("Không được bỏ trống hoặc nhập ký tự");
						}
					} while (true);
					
					boolean check1 = true;
					
					
					switch (luachon) {
					case 1:
						
						
						do {
							System.out.println("****************************DANH SACH DANH MUC*****************************");
							System.out.println("1. Danh sach cay danh muc");
							System.out.println("2. Thong tin chi tiet danh muc");
							System.out.println("3. Quay lai");
							do {
								try {
									System.out.println("Su lua chon cua ban: ");
									luachon = Integer.parseInt(sc.nextLine());
									break;
								} catch (Exception e) {
									System.err.println("Không được bỏ trống hoặc nhập ký tự");
								}
							} while (true);
							
							
							
							switch (luachon) {
							case 1:
								showCategoryTree();
								
								break;
							case 2:
								System.out.println("Nhap vao ten danh muc muon xem: ");
								String IdName = sc.nextLine();
								
								for (Categories category : listCate) {
									if (category.getCatalogName().compareTo(IdName)==0) {
										System.out.println("Ma danh muc: "+category.getCatalogId()+"- Ten danh muc: "+category.getCatalogName());
										System.out.println("Mo ta: "+category.getDecriptions());
										System.out.println("Danh muc cha: "+category.getParentId()+"- Trang thai: "+category.isCatalogStatus());
										
										
									} 
									
									
								}
								
								break;
							case 3:
								check1= false;
								break;
							default:
								System.out.println("Vui long chon tu 1-3");
								break;
							}
						} while (check1);
						break;
						
					case 2:
						int n = 0;
						do {
							try {
								System.out.println("Nhap vao so danh muc muon them moi: ");
								n = Integer.parseInt(sc.nextLine());
								break;
							} catch (Exception e) {
								System.err.println("Phải nhập số nguyên");
							}
						} while (true);
						
						for (int i=0;i<n;i++) {
							Categories category = new Categories();
							try {
								category.inputData(sc, listCate);
								listCate.add(category);
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						}
						break;
					case 3:
						int id = 0;
						boolean temp = false;
						do {
							try {
								do {
									try {
										System.out.println("Nhap vao ma danh muc muon xoa: ");
										id = Integer.parseInt(sc.nextLine());
										break;
									} catch (Exception e) {
										System.err.println("Phải nhập vào mã danh mục");
									}
								} while (true);
								for (Product<T> product : listPro) {
									if(product.getCategory().getCatalogId()==id) {
										temp = true;
										break;
									}
								}
								if (!temp) {
									for(int i=0;i<listCate.size();i++) {
										if(listCate.get(i).getCatalogId()==id) {
											listCate.remove(i);
										}
									}
								}
								else {
									System.err.println("Danh mục đã tồn tại sản phẩm vui lòng xóa sản phẩm trước");
								}
								
							} catch (Exception e) {
								System.err.println("Phải nhập số nguyên");
							}
							break;
						} while (true);
						
						break;
						
					case 4:
						System.out.println("Nhap vao ten danh muc muon xem: ");
						String IdName = sc.nextLine();
						
						for (Categories category : listCate) {
							if (category.getCatalogName().compareTo(IdName)==0) {
								System.out.println("Ma danh muc: "+category.getCatalogId()+"- Ten danh muc: "+category.getCatalogName());
								System.out.println("Mo ta: "+category.getDecriptions());
								System.out.println("Danh muc cha: "+category.getParentId()+"- Trang thai: "+category.isCatalogStatus());
								
							} 
							
						}
						
						break;
						
						
					case 5:
						check = false;
						break;

					default:
						System.out.println("Vui long chon tu 1-5");
						break;
					}
					
				} while (check);

				break;

				
			case 2:
				do {
					System.out.println("******************************QUAN LY SAN PHAM********************************");
					System.out.println("1. Them san pham moi");
					System.out.println("2. Tinh loi nhuan san pham");
					System.out.println("3. Hien thi thong tin san pham");
					System.out.println("4. Sap xep san pham");
					System.out.println("5. Cap nhat thong tin san pham");
					System.out.println("6. Cap nhat trang thai san pham");
					System.out.println("7. Quay lai");
					do {
						try {
							System.out.println("Su lua chon cua ban: ");
							luachon = Integer.parseInt(sc.nextLine());
							break;
							
						} catch (Exception e) {
							System.err.println("Không được bỏ trống hoặc nhập ký tự");
						}
					} while (true);
					
					boolean checksp = true;
					
					switch (luachon) {
					case 1:
						int n = 0;
						do {
							try {
								System.out.println("Nhap so san pham ban muon them: ");
								n = Integer.parseInt(sc.nextLine());
								break;
							} catch (Exception e) {
								System.err.println("Không được bỏ trống hoặc nhập ký tự");
							}
						} while (true);
						for(int i=0;i<n;i++) {
							Product product = new Product();
							try {
								product.inputData(sc, listCate, listPro);
								listPro.add(product);
								break;
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						}
						break;
						
					case 2:
						for (Product product : listPro) {
							product.calProfit();
							System.out.println("Ten san pham: "+product.getProductName());
							System.out.println("Loi nhuan: "+product.getProfit());
							product.calProfit();
						}
						
						break;
					case 3:
						
						do {
							System.out.println("****************************************THONG TIN SAN PHAM*******************************");
							System.out.println("1. Hien thi san pham theo danh muc");
							System.out.println("2. Hien thi chi tiet san pham");
							System.out.println("3. Quay lai");
							do {
								try {
									System.out.println("Su lua chon cua ban: ");
									luachon = Integer.parseInt(sc.nextLine());
									break;
								} catch (Exception e) {
									// TODO: handle exception
									System.err.println("Không được bỏ trống hoặc nhập ký tự khác");
								}
							} while (true);
							
							
							switch (luachon) {
							case 1:
								for (Product product : listPro) {
									product.displayData();
								}
								
								break;
							case 2:
								System.out.println("Nhap vao ten san pham muon xem: ");
								String tenSp = sc.nextLine();
								for (Product product : listPro) {
									if(product.getProductName().compareTo(tenSp)== 0) {
										product.displayData();
										
									}
								}
								
								
								break;
							case 3:
								checksp = false;
								break;

							default:
								System.out.println("Vui lòng chọn từ 1-3");
								break;
							}
							
						} while (checksp);
						break;
						
					case 4:
						
						do {
							
							System.out.println("******************************SAP XEP SAN PHAM*****************************");
							System.out.println("1. Sap xep san pham theo gia suat tang dan");
							System.out.println("2. Sap xep san pham theo loi nhuan giam dan");
							System.out.println("3. Quay lai");
							do {
								try {
								System.out.println("Su lua chon cua ban: ");
								luachon = Integer.parseInt(sc.nextLine());
								break;
							} catch (Exception e) {
								System.err.println("Không được bỏ trống hoặc nhập ký tự khác");
							}
								
							} while (true);
							
							switch (luachon) {
							case 1:
								ShopManagement.sortByExpPrice();
								for (Product<T> product : listPro) {
									product.displayData();
								}
								
								
								break;
							case 2:
								ShopManagement.sortByExpProfit();
								for (Product<T> product : listPro) {
									product.displayData();
								}
								
								
								break;
							case 3:
								checksp = false;
								break;
								

							default:
								System.out.println("Vui long chon tu 1 den 3");
								break;
							}
							
						} while (checksp);
						
						break;
					case 5:
						System.out.println("Nhap vao ma san pham muon cap nhat thong tin: ");
						String ttmsp = sc.nextLine();
						for (Product product : listPro) {
							if (product.getProductId().compareTo(ttmsp)==0) {
								try {
									listPro.remove(product);
									product.inputData(sc, listCate, listPro);
									listPro.add(product);
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
						
						break;
					case 6:
						System.out.println("Nhap vao ma san pham muon cap nhat trang thai: ");
						String msp = sc.nextLine();
						for (Product product : listPro) {
							if (product.getProductId().compareTo(msp)==0) {
								product.setProductStatus(!product.isProductStatus());
								System.out.println("Cap nhat thanh cong");
							}
						}
						
						
						break;
					case 7:
						check = false;
						break;
					
					default:
						System.out.println("Vui lòng chọn từ 1-7");
						break;
					}
					
				} while (check);
				
				
				
				break;
			case 3:
				ShopManagement.writeObject("category.txt", listCate);
				ShopManagement.writeObject("product.txt", listPro);
				System.exit(0);
				break;

			default:
				System.out.println("Vui long chon tu 1 - 3");
				break;
			}
			
		} while (true);
		

	}
	// ghi thông tin cho file
	public static <T> void writeObject(String path, List<T> list) {
		try {
			FileOutputStream cateOutStream = new FileOutputStream(path);
			ObjectOutputStream obCateOutStream = new ObjectOutputStream(cateOutStream);
			obCateOutStream.writeObject(list);
			cateOutStream.close();
			obCateOutStream.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	// đọc file 
	public static <T> List<T> readObject(String path){
		List<T> listCate = new ArrayList<T>();
		try {
			FileInputStream inputStream = new FileInputStream(path);
			try {
				ObjectInputStream stream = new ObjectInputStream(inputStream);
				listCate = (List<T>) stream.readObject();
				return listCate;
				
			} catch (IOException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	 
	return listCate;
	}
	
	  
	
	public static void showCategoryTree() {
		int stt = 1;
		for (Categories category : listCate) {
			if(category.getParentId() == 0) {
				System.out.printf("%d %s \n",stt,category.getCatalogName());
				stt += 1;
				int st2=1;
				for (Categories category2 : listCate) {
					if (category2.getParentId() == category.getCatalogId()) {
						System.out.printf("\t %d.%d %s \n",stt,st2,category2.getCatalogName());
						
						int st3=1;
						for (Categories category3 : listCate) {
							if(category3.getParentId() == category2.getCatalogId()) {
								System.out.printf("\t \t %d.%d.%d %s \n",stt,st2,st3,category3.getCatalogName());
								
							}
							st3 += 1;
							
							
						}
						
						
					}
					st2 += 1;
					
				}
				
			}
			 	
		}
		
		
	}
	
	public static <T> void sortByExpPrice() {
		listPro.sort((Comparator<? super Product>) new Comparator<Product<T>>() {

			@Override
			public int compare(Product<T> o1, Product<T> o2) {
				// TODO Auto-generated method stub
				return (int) (o1.getExportPrice() - o2.getExportPrice());
			}

			
		});
	}
	
	public static <T> void sortByExpProfit() {
		listPro.sort((Comparator<? super Product>) new Comparator<Product<T>>() {

			@Override
			public int compare(Product<T> o1, Product<T> o2) {
				// TODO Auto-generated method stub
				return (int) (o2.getProfit() - o1.getProfit());
			}

			
		});
	}
	
	

}

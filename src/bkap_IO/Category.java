package bkap_IO;

import java.io.Serializable;

public class Category implements Serializable{
	private String catelogID;
	private String cateName;
	private boolean status;
	public Category(String catelogID, String cateName, boolean status) {
		super();
		this.catelogID = catelogID;
		this.cateName = cateName;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Category [catelogID=" + catelogID + ", cateName=" + cateName + ", status=" + status + "]";
	}
	
	
	

}

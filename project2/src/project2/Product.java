package project2;

public class Product {

	private long id;
	private String ProductName;
	private String supplierName;
	
	public long getId() {
		return id;
	}
	
	public String getProductName() {
		return ProductName;
	}
	
	public String getSupplierName() {
		return supplierName;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setProductName(String productName) {
		this.ProductName = productName;
	}
	
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	
		
}

package project3new;

public class Product {
    private long id;
    private String ProductName;
    private String supplierName;

    public Product(long id, String productName, String supplierName) {
           super();
           this.id = id;
           ProductName = productName;
           this.supplierName = supplierName;
    }

    public Product() {
    }

    public long getId() {
           return id;
    }

    public void setId(long id) {
           this.id = id;
    }

    public String getProductName() {
           return ProductName;
    }

    public void setProductName(String productName) {
           ProductName = productName;
    }

    public String getSupplierName() {
           return supplierName;
    }

    public void setSupplierName(String supplierName) {
           this.supplierName = supplierName;
    }

    public void display() {
           System.out.println("Product id is " + getId());
           System.out.println("Product Name is " + getProductName());
           System.out.println("Supplier Name is " + getSupplierName());
    }
}



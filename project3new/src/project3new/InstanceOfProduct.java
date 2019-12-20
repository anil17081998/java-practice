package project3new;
import java.util.Scanner;
public class InstanceOfProduct {

	public static void main(String[] args) {
		          Scanner  sc = new Scanner(System.in);
		                Product pro = new Product();
		          System.out.println("Enter product Id \n");
		          long id = Integer.parseInt(sc.nextLine());
		          pro.setId(id);
		          
		          System.out.println("Enter the product name");
		          pro.setProductName(sc.nextLine());
		          
		          System.out.println("Enter the supplier name");
		          pro.setSupplierName(sc.nextLine());
		       
		          pro.display();
		       }


	}

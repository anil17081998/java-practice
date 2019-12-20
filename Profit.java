import java.util.Scanner;
class Profit {
 public static void main(String[] args) {
double r = myMethod();
		System.out.printf(" Sam's profit percentage is %.2f percentage",r );
		
 }
  public static double myMethod() {
	   Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of dozens of toys purchased");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the price per dozen ");
		int y = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the selling price of 1 toy  ");
		int z  = Integer.parseInt(sc.nextLine());
  double costPrice = y/12d;
		//System.out.println("cost"+costPrice);
		double profit = z-costPrice;
		//System.out.println("profit  "+profit);
		double profitPer = (profit/costPrice)*100;
   return profitPer;
  }
}

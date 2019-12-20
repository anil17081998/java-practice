import java.util.*;
public class ProfitPercentage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of dozens of toys purchased :");
		int dozenCount = sc.nextInt();
		System.out.println("Enter the price per dozen  :");
		int pricePerDozen = sc.nextInt();
		System.out.println("Enter the selling price of 1 toy :");
		int sellPrice = sc.nextInt();
		Calc s = new Calc();
		float profit = s.calculateProfit(dozenCount,pricePerDozen,sellPrice);

		System.out.printf("percentage::%.2f",profit);
		}
		}


import java.util.Scanner;
class compare
{
	public static void main(String...arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the second number :  ");
		int y = Integer.parseInt(sc.nextLine());
			if(x < y) {
            System.out.println(x + "  is less than  " + y);
        }
        else if(y < x) {
            System.out.println(y +"  is greater than  " + x);
        }
        else {
            System.out.println(x + "  is less than  " + y);
		}
	}
}
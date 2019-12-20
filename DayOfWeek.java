import java.util.Scanner;
class DayOfWeek
{
	public static void main(String...arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day number");
		int i = Integer.parseInt(sc.nextLine());
		 String[] a = {"", "Sun", "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat" };
		for (; i < a.length;) {
         
         System.out.println("Day of the week is   " +a[i]);
		 break;
	}
}
}
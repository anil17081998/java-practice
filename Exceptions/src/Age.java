import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your age :: ");
		int age = s.nextInt();

		try {
			if (age < 18)
				throw new AgeException("not valid");
			else
				System.out.println("welcome to vote");
		} catch (AgeException a) {
			System.out.println(a);
		}
	}

}

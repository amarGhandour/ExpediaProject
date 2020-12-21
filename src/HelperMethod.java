import java.util.InputMismatchException;
import java.util.Scanner;

public class HelperMethod {

	private static  Scanner input = new Scanner(System.in);

	private HelperMethod() {

	}

	public static int readInt(int low, int high) {
		int choice = -1;

		while (true) {
			try {
				System.out.printf("Enter choice in range[%d - %d]: ", low, high);
				choice = input.nextInt();

				if (choice >= low && choice <= high)
					break;
				System.out.printf("Error::Please enter choice in range[%d - %d].%n", low, high);
			} catch (InputMismatchException e) {
				System.out.print("Error::please Enter Integer number.%n");
				input.nextLine();
			}

		}
		return choice;
	}

	public static int showReadMenu(String[] menu) {
		System.out.println("\nMenu:");
		for (int choice = 0; choice < menu.length; choice++) {
			System.out.printf("\t%d)%s.%n", choice + 1, menu[choice]);
		}
		System.out.println();
		return readInt(1, menu.length);
	}
}

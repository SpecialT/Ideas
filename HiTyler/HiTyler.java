import java.util.Scanner;

public class HiTyler {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("\n\nEnter an insult: ");
		String insult = in.nextLine();
		if (insult.toLowerCase().equals("no")) {
			System.out.println("Good. I didn't want you to anyway, Tyler...\n\n");
		} else {
			System.out.println("That's not nice, Tyler...\n\n");
		}
	}
}

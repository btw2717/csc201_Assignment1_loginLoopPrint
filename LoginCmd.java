import java.util.Scanner;

public class LoginCmd {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String userName = "username";
		String password = "password";

		System.out.println("Please enter your username: ");
		String useAttempt = keyboard.next();
		System.out.println("Thanks guy or gal or zal!");
		System.out.println();

		System.out.println("Now please enter your password: ");
		String passAttempt = keyboard.next();
		System.out.println("Thanks bud or girl or zudel!");
		System.out.println();

		if ((useAttempt.equalsIgnoreCase(userName)) && (passAttempt.equals(password))) {
			System.out.println("\"Welcome username>\"");	
		} else {
			System.out.println("\"Invalid username or password\"");
		}
	}
}
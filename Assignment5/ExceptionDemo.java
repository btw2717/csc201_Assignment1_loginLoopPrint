import java.util.Scanner;
import java.util.ArrayList;

public class ExceptionDemo {
	public static double scanforDouble(String str) {
		Scanner scan = new Scanner(str);
		//scan.useLocale(Locale.US);
		if((scan.hasNextDouble() == true) && (Math.floor(Double.parseDouble(str) != Double.parseDouble(str)))) {
			return true;
		}
	}

	public static boolean scanForInteger(String str) {
		Scanner scan = new Scanner(str);
		//scan.useLocale(Locale.US);
		if((scan.hasNextDouble() == true) && (Math.floor(Double.parseDouble(str) == Double.parseDouble(str)))) {
			return true;
		}
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String input;
		ArrayList<Double> dub = new ArrayList<Double>();
		ArrayList<Integer> integer = new ArrayList<Integer>();
		int count = 1;

		System.out.println("Hello, I will ask you to enter numbers so I can sum them, just enter them one at a time and press enter after each entry.");
		//for(int i =0; i < count; i++) {
		while(!keyboard.next().equalsIgnoreCase("exit")) {
			System.out.println("Enter a number");
			input = keyboard.next();
			if (input.scanForDouble() == true) {
				dub.add(input.nextDouble());
				//count++;
			} else if(input.scanForInteger() == true) {
				integer.add(input.nextInt());
				//count++;
			} else {
				System.out.println("You did not enter a number");
			}
		}
	}
}

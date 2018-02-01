import java.util.Scanner;
//import java.util.InputMismatchException;

public class Trying {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double value = 0.0, sum = 0.0;
		do {
			System.out.println("Enter a number");
			value = keyboard.nextDouble();
			sum += value;
		} while(value != 0);
		System.out.println("The sum is " + sum);
	}
}

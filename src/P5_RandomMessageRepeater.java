import java.util.Scanner;

/*
	ISYS 320 DONE DONE DONE DONE DONE
	Name(s): Dave Rapp
	Date: 4-18-18
*/

public class P5_RandomMessageRepeater {

	public static void main(String[] args) {
		// Call your getRandomMessage method from here
		// Be sure you do not print out the message in the getRandomMessage method
		int SENTINEL = -1;
		System.out.println("Why would a pop tart want to live inside a toater?");
		System.out.print("Do you want to hear it again? ("+ SENTINEL + " for no): ");
		Scanner console = new Scanner(System.in);
		int input = console.nextInt();
		int min = input;
		int max = input;
		while (input != SENTINEL) {
		if (input < min) {
		min = input;
		} else if (input > max) {
		max = input;
		}

		System.out.print("Type a number (or " + SENTINEL + " to stop): ");
		input = console.nextInt();
		}

		
	}

}

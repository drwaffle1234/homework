package messageBase;

import java.util.Scanner;

public class EnigmaMachine {

	/**
	 * @param args
	 */
	Scanner kb = new Scanner(System.in);
	String key1 = kb.nextLine();
	String key2 = kb.nextLine();
	String key3 = kb.nextLine();

	public static void main(String[] args) {

		System.out
				.println("Please enter the Keys for Oute Rotor , Middle Rotor, Inner Rotor: ");
		@SuppressWarnings("resource")
		Scanner kb = new Scanner(System.in);
		String key1 = kb.nextLine();
		String key2 = kb.nextLine();
		String key3 = kb.nextLine();
		SimpleEnigma machine = new SimpleEnigma(key1, key2, key3);
		String close = "quit";
		String encode = "encode";
		String decode = "decode";
		System.out.println("Would you like to encode/decode or quit?: ");
		String input = kb.nextLine();
		while (!input.equals(close)) {
			if (input.equals(encode)) {
				System.out.println("What would you like to encode");
				String encrypt = kb.nextLine();
				System.out.println(machine.encode(encrypt));
				machine.reset();
			} else if (input.equals(decode)) {
				System.out.println("What would you like to decode");
				String decrypt = kb.nextLine();
				System.out.println(machine.decode(decrypt));
				machine.reset();
			}
			System.out.println("Would you like to encode/decode or quit?: ");
			input = kb.nextLine();
		}

	}

}

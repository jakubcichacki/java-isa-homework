package isa.jjdd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Task0 {

	private static final Logger STDOUT = LoggerFactory.getLogger("CONSOLE_OUT");

	public void run() {
		// Stwórz metodę do sprawdzania czy podany tekst jest palindromem.

		// Test!
		if (isPalindrome("Zakopane na pokaz")) {
			STDOUT.error("Ok 1");
		} else {
			STDOUT.error("Błąd 1");
		}

		if (isPalindrome("Akta generała ma mała renegatka")) {
			STDOUT.error("Ok 2");
		} else {
			STDOUT.error("Błąd 2");
		}

		if (isPalindrome("Jedziemy do domu")) {
			STDOUT.error("Błąd 3");
		} else {
			STDOUT.error("Ok 3");
		}

	}

	private boolean isPalindrome(String sentence) {
		// Implement here
		return false;
	}
}

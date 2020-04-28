package isa.jjdd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Task6 {

	private static final Logger STDOUT = LoggerFactory.getLogger("CONSOLE_OUT");

	public void run() {
		//All tests have to pass

		if (scramble("Alfabet", "Beata")) {
			STDOUT.info("1 - OK");
		} else {
			STDOUT.info("1 - Wrong");
		}

		if (!scramble("Lodowisko", "kiosk")) {
			STDOUT.info("2 - OK");
		} else {
			STDOUT.info("2 - Wrong");
		}
	}

	private boolean scramble(String sentence1, String sentence2) {
		//Mamy dwa wyrazy. Należy sprawdzić, czy można przestawić
		// litery w pierwszym wyrazie tak, żeby powstał drugi wyraz.
		// Niepotrzebne litery można odrzucić.
		boolean scramble = true;
		String[] arraySentence1 = sentence1.toLowerCase().split("");
		String[] arraySentence2 = sentence2.toLowerCase().split("");

		for (String el : arraySentence2) {
			for (int i = 0; i < arraySentence1.length; i++) {
				if (el.equals(arraySentence1[i])) {
					arraySentence1[i] = null;
					el = null;
					break;
				}
			}
			if (el != null) {
				scramble = false;
				break;
			}
		}
		return scramble;
	}
}

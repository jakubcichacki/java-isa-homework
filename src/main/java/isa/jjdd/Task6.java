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
		return false;
	}
}

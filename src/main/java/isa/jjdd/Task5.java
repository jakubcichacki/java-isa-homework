package isa.jjdd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Task5 {

	private static final Logger STDOUT = LoggerFactory.getLogger("CONSOLE_OUT");

	public void run() {
		//All tests have to pass

		if (longestWord("Jaka piękna dziś#$%!@ pogoda!!!") == 6) {
			STDOUT.info("1 - OK");
		} else {
			STDOUT.info("1 - Wrong");
		}

		if (longestWord("Dzisiaj pracowaliśmy nad Projekt1029384983.") == 17) {
			STDOUT.info("2 - OK");
		} else {
			STDOUT.info("2 - Wrong");
		}
	}

	private int longestWord(String sentence) {
		// Mamy podane zdanie.
		// Naszym zadaniem jest zwrócenie długości najdłuższego słowa
		// w danym zdaniu. Uwaga! Bierzemy pod uwagę tylko litery
		// i cyfry. Znaki interpunkcyjne i inne pomijamy.
		return 0;
	}
}

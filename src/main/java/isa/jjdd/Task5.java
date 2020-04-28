package isa.jjdd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		String [] sentenceToArray = sentence.split(" ");
		int maxLength = 0;

		Pattern pattern = Pattern.compile("(\\w+)(\\W+)");

		for (String el : sentenceToArray) {
			Matcher matcher = pattern.matcher(el);
			if (matcher.matches()) {
				if (maxLength < matcher.group(1).length()) {
					maxLength = matcher.group(1).length();
				}
			}
		}

		return maxLength;
	}
}

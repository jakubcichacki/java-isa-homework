package isa.jjdd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class Task1 {

	Random rnd = new Random();
	private static final Logger STDOUT = LoggerFactory.getLogger("CONSOLE_OUT");
	public void run() {
		// Remove all null check and convert "returns" of the functions to Optional.
		// Make it running!

		Boolean b = method1();
		if (b==null) {
			STDOUT.info("What is it?");
		} else if (b){
			STDOUT.info("It's true!");
		} else {
			STDOUT.info("It's FALSE!");
		}
		String s = method2();
		if (s==null) {
			STDOUT.info("No text!");
		} else {
			STDOUT.info("The text is {}", s);
		}
	}

	private Boolean method1() {
		return rnd.nextBoolean() ? null : true;
	}

	private String method2() {
		return rnd.nextBoolean() ? null : "To jest tekst";
	}

}

package isa.jjdd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger STDOUT = LoggerFactory.getLogger("CONSOLE_OUT");

	public static void main(String[] args) throws InterruptedException {
		STDOUT.info("Start system\n");
		Task8 task = new Task8();
		task.run();
	}

}

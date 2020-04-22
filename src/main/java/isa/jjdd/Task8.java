package isa.jjdd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Task8 {

	private static final Logger STDOUT = LoggerFactory.getLogger("CONSOLE_OUT");

	public void run() {
		//All tests have to pass

		if (checkRoute(new String[]{"0:1","2:2", "3:1", "2:1"})==2) {
			STDOUT.info("1 - OK");
		} else {
			STDOUT.info("1 - Wrong");
		}

		if (checkRoute(new String[]{"1:1", "0:2", "3:2", "3:3"})==-1) {
			STDOUT.info("2 - OK");
		} else {
			STDOUT.info("2 - Wrong");
		}

		if (checkRoute(new String[]{"0:1", "0:1", "0:1", "4:1"})==4) {
			STDOUT.info("3 - OK");
		} else {
			STDOUT.info("3 - Wrong");
		}
	}

	private int checkRoute(String[] route) {
		//Mamy podaną trasę pomiędzy stacjami benzynowymi w postaci
		// tablicy String z elementami: G:N, gdzie G oznacza ilość paliwa
		// dostępną na danej stacji, a N ilość paliwa potrzebną, żeby
		// dotrzeć do następnej stacji. Np. “0:1”,”2:2”,”3:1”,”2:1”.
		// Trasa jest “zapętlona” to znaczy z ostatniej stacji jedziemy
		// do pierwszej. Należy napisać program, który poda numer
		// stacji (od 1) od której należy rozpocząć podróż, żeby wrócić
		// na stację startową, lub -1 jeżeli nie jest to możliwe. Jeżeli jest
		// wiele możliwości startu podajemy pierwszą możliwą.
		return -1;
	}
}

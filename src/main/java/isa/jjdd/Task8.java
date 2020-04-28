package isa.jjdd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {

    private static final Logger STDOUT = LoggerFactory.getLogger("CONSOLE_OUT");

    public void run() {
        //All tests have to pass

        if (checkRoute(new String[]{"0:1", "2:2", "3:1", "2:1"}) == 2) {
            STDOUT.info("1 - OK\n");
        } else {
            STDOUT.info("1 - Wrong\n");
        }

        if (checkRoute(new String[]{"1:1", "0:2", "3:2", "3:3"}) == -1) {
            STDOUT.info("2 - OK\n");
        } else {
            STDOUT.info("2 - Wrong\n");
        }

        if (checkRoute(new String[]{"0:1", "0:1", "0:1", "4:1"}) == 4) {
            STDOUT.info("3 - OK\n");
        } else {
            STDOUT.info("3 - Wrong\n");
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

        Integer[][] arrayWithValues = new Integer[route.length][2];
        Pattern pattern = Pattern.compile("(\\d)(:)(\\d)");

        for (int i = 0; i < route.length; i++) {
            Matcher matcher = pattern.matcher(route[i]);
            if (matcher.matches()) {
                arrayWithValues[i][0] = Integer.parseInt(matcher.group(1));
                arrayWithValues[i][1] = Integer.parseInt(matcher.group(3));
            }
        }

        for (int i = 0; i < arrayWithValues.length; i++) {
            int actFuelLevel = 0;
            int j = i;
            int howManyCorrect = 0;

            do {
                if (arrayWithValues[j][0] + actFuelLevel >= arrayWithValues[j][1]) {
                    actFuelLevel += (arrayWithValues[j][0] - arrayWithValues[j][1]);
                    howManyCorrect++;
                } else {
                    break;
                }

                if (j == arrayWithValues.length - 1) {
                    j = -1;
                }
                j++;

                if (howManyCorrect == arrayWithValues.length) {
                    return i + 1;
                }
            } while (j != i);
        }
        return -1;
    }
}

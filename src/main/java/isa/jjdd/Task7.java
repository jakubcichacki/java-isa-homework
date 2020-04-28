package isa.jjdd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Task7 {

    private static final Logger STDOUT = LoggerFactory.getLogger("CONSOLE_OUT");

    public void run() {
        //All tests have to pass

        if (rest(25) == 3) {
            STDOUT.info("1 - OK");
        } else {
            STDOUT.info("1 - Wrong");
        }

        if (rest(15) == 3) {
            STDOUT.info("2 - OK");
        } else {
            STDOUT.info("2 - Wrong");
        }

        if (rest(1) == 1) {
            STDOUT.info("3 - OK");
        } else {
            STDOUT.info("3 - Wrong");
        }
    }

    private int rest(int amount) {
        //Mamy kwotę do wydania jako resztę płatności (liczba całkowita).
        // Algorytm ma podać minimalną liczbę monet jakich trzeba
        // użyć, żeby wydać resztę.
        // Dostępne monety o nominałach: 1,3,5,7,11.

        Integer[] denominationsOfCoins = new Integer[]{1, 3, 5, 7, 11};
        int length = denominationsOfCoins.length;
        int result = 0;

        while (amount > 0) {
            for (int i = length - 1; i >= 0; i--) {
                if (denominationsOfCoins[i] <= amount) {
                    int l = amount / denominationsOfCoins[i];
                    amount = amount - (denominationsOfCoins[i] * l);
                    result += l;
                }
            }

        }
        return result;
    }
}

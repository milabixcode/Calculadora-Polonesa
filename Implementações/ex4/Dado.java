package uff.ic.lleme.tcc00328.exercicios.CamilaFerrari.ex4;

import java.util.Random;

public class Dado {

    private Random random;
    public static int interval = 12;

    public Dado(Random random) {
        this.random = random;
    }

    public int lancar() {
        return random.nextInt(2, interval + 1);
    }
}

package uff.ic.lleme.tcc00328.exercicios.CamilaFerrari.ex4;

public class Rodada {
    private int ponto;

    public Rodada(int ponto) {
        if (ponto < 2 || ponto > 12) {
            throw new IllegalArgumentException("ponto devia estar entre (2, 12)");
        }
        this.ponto = ponto;
    }

    public Rodada() {
    }

    public boolean ehPrimeira() {
        return ponto == 0;
    }

    public static final int DERROTA = 0;
    public static final int INDEFINIDO = 1;
    public static final int VITORIA = 2;

    public int jogar(int release) {
        System.out.printf("release: %d  \n", release);

        if (this.ehPrimeira()) {
            switch (release) {
                case 7, 11:
                    return VITORIA;
                case 2, 3, 12:
                    return DERROTA;
                default:
                    return INDEFINIDO;
            }
        } else {
            if (release == ponto) {
                return VITORIA;
            } else if (release == 7) {
                return DERROTA;
            } else {
                return INDEFINIDO;
            }
        }
    }
}

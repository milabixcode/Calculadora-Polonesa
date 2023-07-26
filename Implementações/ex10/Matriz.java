package uff.ic.lleme.tcc00328.exercicios.CamilaFerrari.ex10;

public class Matriz {
    private int[][] elementos;

    public Matriz(int[][] elementos) {
        this.elementos = elementos;
    }

    public int get(int linha, int coluna) {
        return elementos[linha][coluna];
    }

    public int size() {
        return elementos.length;
    }

    // retorna uma nova matriz sem a linha e a coluna passadas.
    public Matriz submatriz(int linha, int coluna) {
        int[][] sub = new int[size() - 1][size() - 1];
        int linhaAtual = 0;
        int colunaAtual = 0;
        for (int i = 0; i < size(); i++) {
            if (i != linha) {
                for (int j = 0; j < size(); j++) {
                    if (j != coluna) {
                        sub[linhaAtual][colunaAtual] = get(i, j);
                        colunaAtual += 1;
                    }
                }
                colunaAtual = 0;
                linhaAtual += 1;
            }
        }

        return new Matriz(sub);
    }
}
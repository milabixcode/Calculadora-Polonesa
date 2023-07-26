package uff.ic.lleme.tcc00328.exercicios.CamilaFerrari.ex10.determinante;

import uff.ic.lleme.tcc00328.exercicios.CamilaFerrari.ex10.Matriz;

public class DeterminanteSingleThread implements CalculadorDeterminante {

    @Override
    public int calcular(Matriz matriz) {
        if (matriz.size() <= 2) {
            return resolucaoMatrizPequena(matriz);
        }

        return laplace(matriz);
    }

    public int resolucaoMatrizPequena(Matriz matriz) {
        if (matriz.size() == 1) {
            return matriz.get(0, 0);
        }

        if (matriz.size() == 2) {
            int produtoPrincipal = matriz.get(0, 0) * matriz.get(1, 1);
            int produtoSecundaria = matriz.get(0, 1) * matriz.get(1, 0);
            return produtoPrincipal - produtoSecundaria;
        }

        throw new IllegalArgumentException("matriz deve ter tamanho <= 2");
    }

    public int laplace(Matriz matriz) {
        int determinante = 0;

        for (int j = 0; j < matriz.size(); j++) {
            determinante += matriz.get(0, j) * cofator(matriz, 0, j);
        }

        return determinante;
    }

    public int cofator(Matriz matriz, int i, int j) {
        Matriz sub = matriz.submatriz(i, j);
        return ((int) Math.pow(-1, (i + 1) + (j + 1))) * calcular(sub);
    }
}

package uff.ic.lleme.tcc00328.exercicios.CamilaFerrari.ex10;

import uff.ic.lleme.tcc00328.exercicios.CamilaFerrari.ex10.determinante.DeterminanteSingleThread;

public class Main {
    public static void main(String[] args) {
        String input = """
                3
                1 2 3
                4 5 6
                7 8 9
                """;

        Matriz matriz = new LeitorMatriz().ler(input);

        int determinante = new DeterminanteSingleThread().calcular(matriz);

        System.out.printf("determinante: %d\n", determinante);

        new Testes().rodar();
    }
}
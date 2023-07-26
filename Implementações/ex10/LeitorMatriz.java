package uff.ic.lleme.tcc00328.exercicios.CamilaFerrari.ex10;

import java.util.Scanner;

public class LeitorMatriz {
    public Matriz ler(String texto) {
        try (Scanner scanner = new Scanner(texto)) {
            int tam = scanner.nextInt();

            int[][] elementos = new int[tam][tam];

            for (int i = 0; i < tam; i++) {
                for (int j = 0; j < tam; j++) {
                    elementos[i][j] = scanner.nextInt();
                }
            }
            return new Matriz(elementos);
        }
    }
}
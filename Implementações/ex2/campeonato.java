package uff.ic.lleme.tcc00328.exercicios.CamilaFerrari.ex2;

import java.io.*;
import java.util.Scanner;

public class campeonato {

    public static void main(String[] args) {
        int[][] matrixTeams = makeMatrixChampionship("src/main/java/uff/ic/lleme/tcc00328/exercicios/CamilaFerrari/ex2/tabela.txt");
        int leader = leaderCalculator(matrixTeams);
        System.out.printf("The winner is: TEAM %d", leader);

    }

    public static int[][] makeMatrixChampionship(String fileName) {
        try {
            File file = new File(fileName);
            Scanner myReader = new Scanner(file);

            int teams = myReader.nextInt();
            int[][] matrixChampionship = new int[teams][5];

            for (int i = 0; i < teams; i++) {
                for (int j = 0; j < 5; j++) {
                    int value = myReader.nextInt();
                    matrixChampionship[i][j] = value;
                }
            }
            myReader.close();

            return matrixChampionship;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return null;
        }
    }

    public static int leaderCalculator(int[][] matrixTeams) {
        int winner = 0;
        for (int i = 1; i < matrixTeams.length; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 1) {
                    // pular coluna de jogos
                    continue;
                }
                if (matrixTeams[i][j] > matrixTeams[winner][j]) {
                    // ganhador mudou, nao precisa mais tentar outras colunas
                    winner = i;
                    break;
                } else if (matrixTeams[i][j] < matrixTeams[winner][j]) {
                    // ganhador antigo permanece, nao precisa mais tentar tambem
                    break;
                }
            }
        }
        return winner;
    }

}

package uff.ic.lleme.tcc00328.exercicios.CamilaFerrari.ex4;

import java.util.*;

import uff.ic.lleme.tcc00328.exercicios.CamilaFerrari.ex3.jogoDados;

public class Main {
    // chamo um método jogar que retorna o
    // resultado se ganhou ou perdeu
    // main printa
    public static void main(String[] args) {
        // instancio um jogo passando o Dado
        Random random = new Random();
        Dado dado = new Dado(random);

        System.out.print("Digite seu nome: ");

        String nome;
        try (Scanner scanner = new Scanner(System.in)) {
            nome = scanner.nextLine().trim();
        }
        Jogador jogador = new Jogador(nome);

        Partida partida = new Partida(jogador, dado);
        partida.jogar();
    }
}

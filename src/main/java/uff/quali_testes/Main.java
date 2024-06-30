package uff.quali_testes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        // Roda a minha calculadora
        Interface calculator = new Interface();

        // Mostra o nome da classe e em que pasta ela está
        String nome = calculator.getClass().getName();
        System.out.println(nome);

        System.out.println("Reverse Polish Notation");
        System.out.println("------ Exemplo de uso: -------\n   4 7 + 1 * 5 8 * + ");
        System.out.print("Informe sua expressão:\n   ");

        String expressao = lerString();

        ComplexNumber resultado = Operations.calcular(expressao);
        System.out.println("Resposta = " + resultado.toString());
    }


    public static String lerString() throws IOException {
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(entrada);
        String str = br.readLine();
        return str;
    }
}

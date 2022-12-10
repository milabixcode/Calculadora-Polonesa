package CalculadoraPolonesa;

import java.io.*;

public class Operacoes {
    public static void main(String[] args) throws IOException {

        System.out.println("Calculadora com notação Polonesa");
        System.out.println("------ Exemplo de uso: -------\n   4 7 + 1 * 5 8 * + ");
        System.out.print("Informe sua expressão:\n   ");

        String expressao = lerString();

        ComplexNumber resultado = calcular(expressao);
        System.out.println("Resposta = " + resultado.toString());

    }

    public static ComplexNumber calcular(String expressao) {
        Pilha pilha = new Pilha();
        Leitor leitor = new Leitor(expressao);

        ComplexNumber num1, num2;

        while (!leitor.finished()) {

            try {
                pilha.push(leitor.proxNumero());
            } catch (NotANumberException e) {
                String operador = leitor.proxOperador();

                if (operador.equals("+")) {
                    num2 = pilha.pop();
                    num1 = pilha.pop();
                    pilha.push(num1.add(num2));
                } else if (operador.equals("*")) {
                    num2 = pilha.pop();
                    num1 = pilha.pop();
                    pilha.push(num1.mul(num2));
                } else if (operador.equals("-")) {
                    num2 = pilha.pop();
                    num1 = pilha.pop();
                    pilha.push(num1.sub(num2));
                } else if (operador.equals("/")) {
                    num2 = pilha.pop();
                    num1 = pilha.pop();
                    pilha.push(num1.div(num2));
                }
            }
        }
        ComplexNumber resultado = pilha.pop();
        return resultado;
    }

    public static String lerString() throws IOException {
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(entrada);
        String str = br.readLine();
        return str;
    }
}

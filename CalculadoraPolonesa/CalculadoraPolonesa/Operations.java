package CalculadoraPolonesa;

import java.io.*;

public class Operations {
    public static void main(String[] args) throws IOException {

        // Roda a minha calculadora
        Interface calculator = new Interface();

        // Mostra o nome da classe e em que pasta ela está
        String nome = calculator.getClass().getName();
        System.out.println(nome);

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
                String caracter = leitor.proxOperador();
                num2 = pilha.pop();
                num1 = pilha.pop();

                Operador operador = buildOperador(caracter);
                ComplexNumber resultado = operador.operar(num1, num2);
                pilha.push(resultado);
            }
        }
        ComplexNumber resultado = pilha.pop();
        return resultado;
    }

    private static Operador buildOperador(String caracter) {
        switch (caracter) {
            case "+":
                return new Soma();
            case "-":
                return new Subtracao();
            case "*":
                return new Multiplicacao();
            case "/":
                return new Divisao();
            default:
                throw new IllegalArgumentException("Operador não esperado");
        }
    }

    public static String lerString() throws IOException {
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(entrada);
        String str = br.readLine();
        return str;
    }
}

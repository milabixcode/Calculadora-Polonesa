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

        ComplexNumber num1, num2;
        char caractere;

        for (int i = 0; i < expressao.length(); i++) {
            caractere = expressao.charAt(i);
            if (Character.isDigit(caractere))
                // TODO: add support for imaginary part
                pilha.push(new ComplexNumber(Character.digit(caractere, 10), 0));
            else if (caractere == '+') {
                num1 = pilha.pop();
                num2 = pilha.pop();
                pilha.push(num1.add(num2));
            } else if (caractere == '*') {
                num1 = pilha.pop();
                num2 = pilha.pop();
                pilha.push(num1.mul(num2));
            } else if (caractere == '-') {
                num1 = pilha.pop();
                num2 = pilha.pop();
                pilha.push(num1.sub(num2));
            } else if (caractere == '/') {
                num1 = pilha.pop();
                num2 = pilha.pop();
                pilha.push(num1.div(num2));
            } else if (caractere == '^') {
                // num1 = pilha.pop();
                // num2 = pilha.pop();

                // if(num2 > 0){
                // pilha.push((int) Math.pow(num2,1.00/num1));
                // }
                // else if(num2 < 0) {
                // if(num2 % num1 == 0){
                // num2 = (int) num2 * (-1);
                // int a = (int) Math.pow(num2, 1/num1);
                // int b = 1;
                // ComplexNumber number = new ComplexNumber(a, b);
                // number.getReal();
                // number.getImaginaria();
                // number.toString();
                // break;
                // }
                // else if(num2 % num1 != 0) {
                // num2 = (int) num2 * (-1);
                // int a = (int) Math.pow(num2, 1/num1);
                // int b = (int)num2 % (int)num1;
                // ComplexNumber number = new ComplexNumber(a, b);
                // number.getReal();
                // number.getImaginaria();
                // number.toString();
                // break;
                // }
                // }
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

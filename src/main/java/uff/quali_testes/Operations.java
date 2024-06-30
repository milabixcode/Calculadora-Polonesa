package uff.quali_testes;


public class Operations {
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
}

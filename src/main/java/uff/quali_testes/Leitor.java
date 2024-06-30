package uff.quali_testes;

class Leitor {
    String[] parts;
    int position = 0;

    public Leitor(String input) {
        parts = input.split(" ");
    }

    private String currentToken() {
        return parts[position];
    }

    public boolean finished() {
        return position == parts.length;
    }

    // abordagem 1: fazer a proxNumero ser uma prox que retorna objetos
    // e a gente diferencia os numeros dos operadores através do tipo desse objeto

    // abordagem 2: fazer a proxNumero retornar null se não for um número e criar
    // uma proxOperador que retorna o operador.

    public ComplexNumber proxNumero() throws NotANumberException {
        try {
            return tryProxNumero();
        } catch (NumberFormatException e) {
            throw new NotANumberException();
        }
    }

    private ComplexNumber tryProxNumero() {
        ComplexNumber number = null;
        double a = 0, b = 0;
        String[] splitByR = currentToken().split("r");

        a = Double.parseDouble(splitByR[0]);

        if (hasImaginary(splitByR)) {
            // ['a', 'bi']
            String imaginary = splitByR[1];
            b = Double.parseDouble(imaginary.substring(0, imaginary.length() - 1));
        }

        number = new ComplexNumber(a, b);
        position += 1;

        return number;
    }

    public String proxOperador() throws NotAnOperatorException {
        String current = currentToken();
        switch (current) {
            case "+":
            case "-":
            case "*":
            case "/":
                position += 1;
                return current;

            default:
                throw new NotAnOperatorException();
        }
    }

    private boolean hasImaginary(String[] parts) {
        return parts.length == 2;
    }
}

/*
Apresenta o padrão de TDD - Test driven development 
foram elaborados testes unitários da classe para garantir o comportamento determinístico
assim, qualquer alteração na classe que introduza uma mudança na forma de obtenção do resultado acarretará no
lançamento de exceções pelo teste. Isso garante a manutenibilidade do código, pois qualquer desenvolvedor que posteriormente vier a dar
manutenção no código correrá menos riscos de introduzir efeitos colaterais
*/


class NotANumberException extends RuntimeException {
}

class NotAnOperatorException extends RuntimeException {
}

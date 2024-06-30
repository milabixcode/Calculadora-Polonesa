package uff.quali_testes;

abstract class Operador {
    abstract public ComplexNumber operar(ComplexNumber a, ComplexNumber b);
}

/*
Aplicação do princípio de SOLID - Dependency inversion principle
Cria-se uma classe abstrata de operações e implementa-se as classes concretas com responsabilidades únicas.
Assim a calculadora executa a operação sem necessáriamente saber como ela é feita
essa responsabilidade fica a cargo de cada classe concreta 
*/
class Soma extends Operador {
    @Override
    public ComplexNumber operar(ComplexNumber a, ComplexNumber b) {
        ComplexNumber output = new ComplexNumber();
        output.setReal(a.getReal() + b.getReal());
        output.setImaginaria(a.getImaginaria() + b.getImaginaria());

        return output;
    }
}

class Subtracao extends Operador {
    @Override
    public ComplexNumber operar(ComplexNumber a, ComplexNumber b) {
        ComplexNumber output = new ComplexNumber();
        output.setReal(a.getReal() - b.getReal());
        output.setImaginaria(a.getImaginaria() - b.getImaginaria());

        return output;
    }
}

class Multiplicacao extends Operador {
    @Override
    public ComplexNumber operar(ComplexNumber a, ComplexNumber b) {
        ComplexNumber output = new ComplexNumber();
        output.setReal(a.getReal() * b.getReal());
        output.setImaginaria(a.getImaginaria() * b.getImaginaria());

        return output;
    }
}

class Divisao extends Operador {
    @Override
    public ComplexNumber operar(ComplexNumber a, ComplexNumber b) {
        if (b.getReal() == 0.0 && b.getImaginaria() == 0.0) {
            throw new ArithmeticException("division by zero");
        }

        ComplexNumber output = div(a.getReal(), a.getImaginaria(), b.getReal(), b.getImaginaria());
        return output;
    }

    private static ComplexNumber div(double a, double b, double c, double d) {
        double real = (a * c - b * d) / (c * c - d * d);
        double imaginaria = (-a * d + c * b) / (c * c - d * d);
        return new ComplexNumber(real, imaginaria);
    }
}

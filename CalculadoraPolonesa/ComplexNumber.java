package CalculadoraPolonesa;

//Classe para representar um número complexo, que tem uma parte real e uma parte imaginária
public class ComplexNumber {
    // Atributos da Classe
    private double real;
    private double imaginaria;

    public ComplexNumber() {
    }

    // Método construtor da classe
    // a - parte real
    // b - parte imaginária
    public ComplexNumber(double a, double b) {
        this.real = a;
        this.imaginaria = b;
    }

    public double getReal() {
        return real;
    }

    public double getImaginaria() {
        return imaginaria;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginaria(double imaginaria) {
        this.imaginaria = imaginaria;
    }

    // Imprime o número complexo no formato (real,imaginaria)
    public String toString() {
        return "(" + this.real + ", " + this.imaginaria + "i)";
    }

    public ComplexNumber add(ComplexNumber other) {
        ComplexNumber output = new ComplexNumber();
        output.real = this.real + other.real;
        output.imaginaria = this.imaginaria + other.imaginaria;

        return output;
    }

    public ComplexNumber sub(ComplexNumber other) {
        ComplexNumber output = new ComplexNumber();
        output.real = this.real - other.real;
        output.imaginaria = this.imaginaria - other.imaginaria;

        return output;
    }

    public ComplexNumber mul(ComplexNumber other) {
        ComplexNumber output = new ComplexNumber();
        output.real = this.real * other.real;
        output.imaginaria = this.imaginaria * other.imaginaria;

        return output;
    }

    private static ComplexNumber div(double a, double b, double c, double d) {
        double real = (a * c - b * d) / (c * c - d * d);
        double imaginaria = (-a * d + c * b) / (c * c - d * d);
        return new ComplexNumber(real, imaginaria);
    }

    public ComplexNumber div(ComplexNumber other) {
        if (other.real == 0.0 && other.imaginaria == 0.0) {
            throw new ArithmeticException("division by zero");
        }

        ComplexNumber output = div(this.real, this.imaginaria, other.real, other.imaginaria);
        return output;
    }

    public ComplexNumber raiz(ComplexNumber other) {
        throw new RuntimeException("not implemented");
        // ComplexNumber output = new ComplexNumber();
        // output.real = this.real + other.real;
        // output.imaginaria = this.imaginaria + other.imaginaria;

        // return output;
    }

}

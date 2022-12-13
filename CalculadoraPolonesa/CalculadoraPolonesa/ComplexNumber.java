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
        return new Soma().operar(this, other);
    }

    public ComplexNumber sub(ComplexNumber other) {
        return new Subtracao().operar(this, other);
    }

    public ComplexNumber mul(ComplexNumber other) {
        return new Multiplicacao().operar(this, other);
    }

    public ComplexNumber div(ComplexNumber other) {
        return new Divisao().operar(this, other);
    }
}

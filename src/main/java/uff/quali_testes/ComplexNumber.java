package uff.quali_testes;

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
    
    /*
    Getters e setters para o objeto. Acessos a campos do objeto devem sempre ser indiretos, ou seja 
    nunca se deve acessar uma variável de um objeto de maneira direta, mas por meio de setters e getters 
    assim: controlamos a forma de acesso, garantimos que qualquer logica de inserção ou recuperação de dados 
    seja centralizada em um único ponto, evitamos efeitos colaterais
    */

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
    
    /*
    Encapsulamento. Encapsula-se a lógica dentro do objeto para evitar efeitos colaterais e centralizar a lógica,
    mantendo o principio da responsabilidade unica. Assim a classe sabe realizar as atividades matemáticas competentes a ela.
    
    */

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

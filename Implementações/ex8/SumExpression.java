/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex8;

/**
 *
 * @author giova
 */
public class SumExpression implements Expression {
    private Expression expressaoEsquerda;
    private Expression expressaoDireita;

    public SumExpression(Expression expressaoEsquerda, Expression expressaoDireita) {
        this.expressaoEsquerda = expressaoEsquerda;
        this.expressaoDireita = expressaoDireita;
    }

    public int interpret(Contexto contexto) {
        int valorEsquerda = expressaoEsquerda.interpret(contexto);
        int valorDireita = expressaoDireita.interpret(contexto);
        return valorEsquerda + valorDireita;
    }

    @Override
    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
        expressaoEsquerda.accept(visitor);
        expressaoDireita.accept(visitor);
    }
}

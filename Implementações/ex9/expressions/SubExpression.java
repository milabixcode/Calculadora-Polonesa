package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions;

import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.Contexto;
import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.visitor.ExpressionVisitor;


/**
 *
 * @author giova
 */
public class SubExpression implements Expression{
    private Expression expressaoEsquerda;
    private Expression expressaoDireita;

    public SubExpression(Expression expressaoEsquerda, Expression expressaoDireita) {
        this.expressaoEsquerda = expressaoEsquerda;
        this.expressaoDireita = expressaoDireita;
    }

    @Override
    public double interpret(Contexto contexto) {
        double valorEsquerda = expressaoEsquerda.interpret(contexto);
        double valorDireita = expressaoDireita.interpret(contexto);
        return valorEsquerda - valorDireita;
    }

    @Override
    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
        expressaoEsquerda.accept(visitor);
        expressaoDireita.accept(visitor);
    }
}

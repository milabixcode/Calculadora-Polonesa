package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions;

import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.Contexto;
import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.visitor.ExpressionVisitor;


public class ConstExpression implements Expression{
    
    private double valor;
    
    public ConstExpression(double valor){
        this.valor = valor;
    }

    @Override
    public double interpret(Contexto contexto) {
        return valor;
    }

    @Override
    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }
}

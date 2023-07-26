package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions;

import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.Contexto;
import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.visitor.ExpressionVisitor;

public class LogExpression implements Expression {
    private Expression expressao;
    
    public LogExpression(Expression expressao) {
        this.expressao = expressao;
    }
    
    @Override
    public double interpret(Contexto contexto) {
        return Math.log(expressao.interpret(contexto));
    }

    @Override
    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
        expressao.accept(visitor);
    }
    
}

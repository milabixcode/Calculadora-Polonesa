package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions;

import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.Contexto;
import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.visitor.ExpressionVisitor;

/**
 *
 * @author arthur
 */
public class VarExpression implements Expression{
    
    private String simbolo;
    
    public VarExpression(String simbolo){
        this.simbolo = simbolo;
    }
    
    public String getSimbolo(){
        return simbolo;
    }
    
    @Override
    public double interpret(Contexto contexto) {
        return contexto.obterValor(simbolo);
    }

    @Override
    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }
    
}

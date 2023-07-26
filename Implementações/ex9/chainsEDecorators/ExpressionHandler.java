package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.chainsEDecorators;

import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions.Expression;

public abstract class ExpressionHandler {
    
    protected ExpressionHandler sucessor;
    
    public ExpressionHandler(ExpressionHandler sucessor){
        
        this.sucessor = sucessor;
    }
    
    public abstract Expression handleRequest(String str);
    
    public abstract Expression handleRequest(String[] vet, int i);
}

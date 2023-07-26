package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.chainsEDecorators;

import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions.Expression;
import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions.LogExpression;

public class LogOperationDecorator extends BuildingDecorator{

    public LogOperationDecorator(BuildingDecorator componente) {
        super(componente);
    }

    @Override
    protected Expression buildTree(String[] vet, int i) {
        
        String exp = vet[i];
        
        if (exp.equals("log")) return new LogExpression(handleRequest(vet, i-1));
        return componente.handleRequest(vet, i);
    }
    
}

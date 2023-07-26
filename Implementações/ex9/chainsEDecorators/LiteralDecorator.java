package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.chainsEDecorators;

import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions.*;

public class LiteralDecorator extends BuildingDecorator{

    public LiteralDecorator(BuildingDecorator componente) {
        super(componente);
    }

    @Override
    public Expression handleRequest(String str) {
        return null;
    }

    @Override
    protected Expression buildTree(String[] vet, int i) {
        
        String exp = vet[i];
        
        if (exp.startsWith("_")) return new VarExpression(exp);
        try{
            return new ConstExpression(Double.parseDouble(exp));
        }
        catch(Exception e){
            return componente.handleRequest(vet, i);
        }
    }
}

package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.chainsEDecorators;

import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions.Expression;

public class StringHandler extends ExpressionHandler{

    public StringHandler(ExpressionHandler sucessor) {
        super(sucessor);
    }

    @Override
    public Expression handleRequest(String str) {
        
        String[] vet = str.split(" ");
        return sucessor.handleRequest(vet, vet.length-1);
    }

    @Override
    public Expression handleRequest(String[] vet, int i) {
        return sucessor.handleRequest(vet, i);
    }

}

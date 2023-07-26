package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.chainsEDecorators;

import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions.*;

public class BasicOperationDecorator extends BuildingDecorator{

    public BasicOperationDecorator(BuildingDecorator componente) {
        super(componente);
    }

    @Override
    protected Expression buildTree(String[] vet, int i) {
        
        String exp = vet[i];
        
        switch(exp){
            
            case("+")->{
                return new SumExpression(handleRequest(vet, i-1), handleRequest(vet, i-2));
            }
            case("-")->{
                return new SubExpression(handleRequest(vet, i-1), handleRequest(vet, i-2));
            }
            case("*")->{
                return new MultExpression(handleRequest(vet, i-1), handleRequest(vet, i-2));
            }
            case("/")->{
                return new DivExpression(handleRequest(vet, i-1), handleRequest(vet, i-2));
            }
            default->{
                return componente.handleRequest(vet, i);
            }
        }
    }
    
}

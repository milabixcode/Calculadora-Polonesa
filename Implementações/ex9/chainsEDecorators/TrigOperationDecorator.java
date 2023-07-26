package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.chainsEDecorators;

import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions.*;

public class TrigOperationDecorator extends BuildingDecorator{

    public TrigOperationDecorator(BuildingDecorator componente) {
        super(componente);
    }

    @Override
    protected Expression buildTree(String[] vet, int i) {
        
        String exp = vet[i];
        
        switch(exp){
            
            case("sen")->{
                return new SenExpression(handleRequest(vet, i-1));
            }
            case("cos")->{
                return new CosExpression(handleRequest(vet, i-1));
            }
            case("tg")->{
                return new TgExpression(handleRequest(vet, i-1));
            }
            default->{
                return componente.handleRequest(vet, i);
            }
        }
    }
    
}

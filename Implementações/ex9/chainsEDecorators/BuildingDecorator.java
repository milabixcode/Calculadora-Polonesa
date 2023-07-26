package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.chainsEDecorators;

import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions.Expression;

public abstract class BuildingDecorator extends ExpressionHandler{
    
    protected BuildingDecorator componente;

    public BuildingDecorator(BuildingDecorator componente) {
        super(null);
        this.componente = componente;
    }

    @Override
    public Expression handleRequest(String str) {
        throw new UnsupportedOperationException("Not supported");
    }
        
    @Override
    public Expression handleRequest(String[] vet, int i) {
        
        if (i < 0) return null;
        return buildTree(vet, i);
    }
    
    protected abstract Expression buildTree(String[] vet, int i);
    
    public void setComponent(BuildingDecorator componente){
        this.componente = componente;
    }
}

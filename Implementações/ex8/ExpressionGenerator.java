package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex8;

public abstract class ExpressionGenerator {
       
    protected ExpressionGenerator sucessor;
    
    public abstract Expression handleRequest(String str);
    public abstract Expression handleRequest(String[] str);
}

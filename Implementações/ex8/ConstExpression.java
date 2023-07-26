package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex8;

public class ConstExpression implements Expression{
    
    private int valor;
    
    public ConstExpression(int valor){
        this.valor = valor;
    }

    @Override
    public int interpret(Contexto contexto) {
        return valor;
    }

    @Override
    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }
}

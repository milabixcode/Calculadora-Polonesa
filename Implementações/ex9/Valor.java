package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9;

import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions.Expression;
import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.mediatorEObservador.*;

public class Valor implements Observer{
    
    private double valor;
    private Expression exp;
    
    public Valor(double valor, Expression exp){
        this.valor = valor;
    }
    
    public double getValor(){
        return valor;
    }
    
    public void setValor(double valor){ //Nenhuma classe tem interesse na mudança do valor, então não precisa de mediação
        this.valor = valor;
    }

    @Override
    public void update(Subject sub) { //Valor só observa contextos
        valor = exp.interpret((Contexto) sub);
    }
}

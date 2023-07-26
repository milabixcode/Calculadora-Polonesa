/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex8;

/**
 *
 * @author arthur
 */
public class VarExpression implements Expression{
    
    private String simbolo;
    
    public VarExpression(String simbolo){
        this.simbolo = simbolo;
    }
    
    public String getSimbolo(){
        return simbolo;
    }
    
    @Override
    public int interpret(Contexto contexto) {
        return contexto.obterValor(simbolo);
    }

    @Override
    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }
    
}

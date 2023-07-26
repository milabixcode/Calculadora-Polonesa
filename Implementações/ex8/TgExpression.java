/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex8;

/**
 *
 * @author giova
 */
public class TgExpression implements Expression{
    private Expression expressao;


    public TgExpression(Expression expressao) {
        this.expressao = expressao;
    }

    public int interpret(Contexto contexto) {
        int valor = expressao.interpret(contexto);

        return (int) Math.sin(valor);
    }

    @Override
    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
        expressao.accept(visitor);
    }
}

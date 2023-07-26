package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.commands;

import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.Contexto;
import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.chainsEDecorators.*;
import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions.Expression;

public class CalculaExpressao implements Command{

    private String str;
    private Contexto cont;
    
    public CalculaExpressao(String str, Contexto cont){
        this.str = str;
        this.cont = cont;
    }
    
    @Override
    public void execute() {
        ExpressionBuilder builder = new ExpressionBuilder();
        Expression exp = builder.buildExpression(str);
        System.out.println(exp.interpret(cont));
        
    }
    
}

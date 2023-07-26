package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.fachada;

import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.*;
import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.chainsEDecorators.ExpressionBuilder;
import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.commands.CalculaExpressao;
import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.commands.Command;
import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.commands.ListarVariaveis;
import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions.Expression;
import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.mediatorEObservador.MediadorDeExpressao;

public class Calculadora implements Fachada{
    
    private Contexto cont;
    private Texto txt;
    private Valor val;
    private Expression exp;
    private MediadorDeExpressao mediador;
    
    public Calculadora(String str){
        cont = new Contexto();
        txt = new Texto(str);
        
        ExpressionBuilder builder = new ExpressionBuilder();
        exp = builder.buildExpression(str);
        
        mediador = new MediadorDeExpressao(txt, cont, exp);
        txt.setMediador(mediador);
    }
    
    public void setExpressao(String str){
        txt.setString(str);
        
        ExpressionBuilder builder = new ExpressionBuilder();
        exp = builder.buildExpression(str);
        mediador = new MediadorDeExpressao(txt, cont, exp);        
    }
    
    public void iniciaVariavel(String var, double val){
        cont.atribuirValor(var, val);
    }
    
    public void listarVariaveis(){
        Command cmd = new ListarVariaveis(exp);
        cmd.execute();
    }
    
    public void calculaExpressao(){
        
        if (cont == null || txt == null) return;
        Command cmd = new CalculaExpressao(txt.getStr(), cont);
        cmd.execute();
    }
}

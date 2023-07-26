package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.visitor;

import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions.SumExpression;
import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions.VarExpression;
import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions.TgExpression;
import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions.SenExpression;
import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions.CosExpression;
import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions.MultExpression;
import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions.ConstExpression;
import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions.SubExpression;
import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions.DivExpression;
import java.util.Set;
import java.util.TreeSet;
import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions.LogExpression;

public class VariableLister implements ExpressionVisitor{

    private final Set<String> variaveis;
    
    public VariableLister(){
        this.variaveis = new TreeSet<>();
    }
    
    public void listar(){
        for(String str: variaveis) System.out.println(str);
    }
    
    public Set getVariaveis(){
        return Set.copyOf(variaveis);
    }
    
    @Override
    public void visit(VarExpression exp) {
        variaveis.add(exp.getSimbolo());
    }

    @Override
    public void visit(ConstExpression exp) {
    }

    @Override
    public void visit(SenExpression exp) {
    }

    @Override
    public void visit(CosExpression exp) {
    }

    @Override
    public void visit(TgExpression exp) {
    }

    @Override
    public void visit(SumExpression exp) {
    }

    @Override
    public void visit(SubExpression exp) {
    }

    @Override
    public void visit(MultExpression exp) {
    }

    @Override
    public void visit(DivExpression exp) {
    }

    @Override
    public void visit(LogExpression exp) {
    }
}

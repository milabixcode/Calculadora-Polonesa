package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.visitor;

import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions.*;

/**
 *
 * @author giova
 */
public interface ExpressionVisitor {//define o contrato para os visitantes das expressões.
    
    public void visit(VarExpression exp);
    public void visit(ConstExpression exp);
    public void visit(SenExpression exp);
    public void visit(CosExpression exp);
    public void visit(TgExpression exp);
    public void visit(SumExpression exp);
    public void visit(SubExpression exp);
    public void visit(MultExpression exp);
    public void visit(DivExpression exp);
    public void visit(LogExpression exp);
    
    //métodos visit() para cada tipo de expressão
    //void visit(NumberExpression expression); //representa uma expressão aritmética que realiza uma operação (adição, subtração, multiplicação ou divisão) entre duas expressões.
    //void visit(OperationExpression expression); //Ela serve como base para todas as expressões que envolvem operações aritméticas.
    //Os visitantes podem implementar esses métodos para realizar operações específicas em cada tipo de expressão.


}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex8;

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

    //métodos visit() para cada tipo de expressão
    //void visit(NumberExpression expression); //representa uma expressão aritmética que realiza uma operação (adição, subtração, multiplicação ou divisão) entre duas expressões.
    //void visit(OperationExpression expression); //Ela serve como base para todas as expressões que envolvem operações aritméticas.
    //Os visitantes podem implementar esses métodos para realizar operações específicas em cada tipo de expressão.
}

package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.chainsEDecorators;

import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions.Expression;

public class ExpressionBuilder {
    
    private final ExpressionHandler prim;
    
    public ExpressionBuilder(){
        
        BuildingDecorator literal = new LiteralDecorator(null); 
        
        BuildingDecorator log = new LogOperationDecorator(literal);
        BuildingDecorator trig = new TrigOperationDecorator(log);
        BuildingDecorator basic = new BasicOperationDecorator(trig);
        
        literal.setComponent(basic);
        
        prim = new StringHandler(literal);
    }
    
    public Expression buildExpression(String str){
        return prim.handleRequest(str);
    }
}

package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex8;

public class StringHandler extends ExpressionGenerator{
    
    public StringHandler(){
        sucessor = new ArrayHandler();
    }
    
    @Override
    public Expression handleRequest(String str){
        
        String[] resp = str.split(" ");
        return sucessor.handleRequest(resp);
    }

    @Override
    public Expression handleRequest(String[] str) {
        return sucessor.handleRequest(str);
    }
}
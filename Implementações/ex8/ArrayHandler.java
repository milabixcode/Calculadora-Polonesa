package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex8;

public class ArrayHandler extends ExpressionGenerator{
    
    public Expression handleRequest(String[] vet){
        
        return buildTree(vet, vet.length-1);
    }
    
    private Expression buildTree(String[] vet, int i){
        
        if (i < 0) return null;
        
        String exp = vet[i];
        
        if (exp.startsWith("_")) return new VarExpression(exp);
        
        switch (exp){
            
            case ("+")->{
                return new SumExpression(buildTree(vet, i-1), buildTree(vet, i-2));
            }
            case ("-")->{
                return new SubExpression(buildTree(vet, i-1), buildTree(vet, i-2));
            }
            case ("*")->{
                return new MultExpression(buildTree(vet, i-1), buildTree(vet, i-2));
            }
            case ("/")->{
                return new DivExpression(buildTree(vet, i-1), buildTree(vet, i-2));
            }
            case ("tg")->{
                return new TgExpression(buildTree(vet, i-1));
            }
            case ("sen")->{
                return new SenExpression(buildTree(vet, i-1));
            }
            case ("cos")->{
                return new CosExpression(buildTree(vet, i-1));
            }
            default ->{
                return new ConstExpression(Integer.parseInt(exp));
            }
        }
    }

    @Override
    public Expression handleRequest(String str) {
        return null;
    }
    
}
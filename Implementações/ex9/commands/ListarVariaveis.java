package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.commands;

import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions.Expression;
import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.visitor.VariableLister;

public class ListarVariaveis implements Command{

    private Expression reciever;
    private VariableLister lister;
    
    public ListarVariaveis(Expression reciever){
        this.reciever = reciever;
        lister = new VariableLister();
    }
    
    @Override
    public void execute() {
        
        reciever.accept(lister);
        lister.listar();
    }
    
}

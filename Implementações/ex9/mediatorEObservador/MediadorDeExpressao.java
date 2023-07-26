package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.mediatorEObservador;

import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.*;
import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.commands.Command;
import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.commands.InicializaContexto;
import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.expressions.*;

public class MediadorDeExpressao implements Mediador{
    
    private final Texto txt;
    private final Contexto cont;
    private Expression exp;
    
    public MediadorDeExpressao(Texto txt, Contexto cont, Expression exp){
        
        this.txt = txt;
        this.cont = cont;
        this.exp = exp;
    }
    
    @Override
    public void media(Texto txt) {
         Command cmd = new InicializaContexto(cont, txt.getStr());
         cmd.execute();
    }
    
}

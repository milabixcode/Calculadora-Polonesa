/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.commands;

import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.Contexto;

/**
 *
 * @author arthur
 */
public class InicializaContexto implements Command{

    private Contexto reciever;
    private String parameter;
    
    public InicializaContexto(Contexto reciever, String exp){
        this.reciever = reciever;
        this.parameter = exp;
    }
    
    @Override
    public void execute() {
        
        String[] tmp = parameter.split(" ");
        for (String s: tmp) if (s.startsWith("_")) reciever.atribuirValor(s, 1D);
    }
    
}

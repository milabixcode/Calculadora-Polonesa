package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9;

import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.mediatorEObservador.*;

public class Texto extends ObjetoMediavel{
    
    private String str;
    
    public Texto(String str){
        this.str = str;
    }
    
    public void setString(String str){
        this.str = str;
        mediador.media(this);
    }
    
    public String getStr(){
        return str;
    }
}

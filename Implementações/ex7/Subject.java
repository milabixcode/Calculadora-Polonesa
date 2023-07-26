package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex7;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    
    private List<Observer> observadores = new ArrayList<>();
    
    public void addObserver(Observer obs){
        observadores.add(obs);
    }
    
    public void rmvObserver(Observer obs){
        observadores.remove(obs);
    }
    
    protected void notificarObserver(){
        
        for (Observer o: observadores) o.atualizar(this);
    }
}

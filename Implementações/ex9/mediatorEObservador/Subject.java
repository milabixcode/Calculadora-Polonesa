package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.mediatorEObservador;

import java.util.*;

public abstract class Subject {
    
    protected List<Observer> observadores;
    
    protected Subject(){
        observadores = new LinkedList<>();
    }
    
    protected void addObserver(Observer obs){
        observadores.add(obs);
    }
    protected void rmvObserver(Observer obs){
        observadores.remove(obs);
    }
    
    protected void notificar(){
        for (Observer o: observadores) o.update(this);
    }
}

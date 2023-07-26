package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9;

/**
 *
 * @author giova
 */
import java.util.HashMap;
import java.util.Map;
import uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex9.mediatorEObservador.Subject;

public class Contexto extends Subject{
    
    private final Map<String, Double> variaveis;
    //se necessario trocar o Hash por outr coisa
    public Contexto() {
        this.variaveis = new HashMap<>();
    }

    public void atribuirValor(String variavel, double valor) {
        variaveis.put(variavel, valor);
    }

    public double obterValor(String variavel) {
        return variaveis.get(variavel);
    }
    
}
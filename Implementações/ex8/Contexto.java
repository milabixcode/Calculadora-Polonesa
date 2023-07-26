/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex8;

/**
 *
 * @author giova
 */
import java.util.HashMap;
import java.util.Map;

public class Contexto {
    private Map<String, Integer> variaveis;
    //se necessario trocar o Hash por outr coisa
    public Contexto() {
        this.variaveis = new HashMap<>();
    }

    public void atribuirValor(String variavel, int valor) {
        variaveis.put(variavel, valor);
    }

    public int obterValor(String variavel) {
        return variaveis.get(variavel);
    }
}
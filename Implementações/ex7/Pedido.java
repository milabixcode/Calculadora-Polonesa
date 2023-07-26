package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex7;

import java.util.*;

public class Pedido extends Subject{
    
    //Associação uniderecional entre pedido e estado
    private EstadoPedido status;
    
    // Associação unidirecional entre Pedido e Item.
    public List<Item> itens = new ArrayList<>();

    // método obrigatório nesta classe
    public double valor() {
        double valor = 0;
        for (Item item : itens)
            if (item != null)
                valor += item.valor();
        return valor;
    }

    public EstadoPedido getStatus() {
        return this.status;
    }

    public void setStatus(EstadoPedido novo) {
        this.status = novo;
        this.notificarObserver();
    }
    
    /*valido uma função em pedido ou no app para checar mudança de estado do pedido
    public int mudouEstado(Pedido pedido){
        checar se o pedido existe
        checar se o pedido mudou de estado
            se sim, retorna 1
            se nao, retorna 0
    }*/
}

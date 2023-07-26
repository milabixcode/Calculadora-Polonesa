package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex7;

public class Item {

    // Associação unidirecional entre Item e Prato.
    public Prato prato = null;
    public int quantidade = 0;

    public Item(Prato prato, int quantidade) {
        this.prato = prato;
        this.quantidade = quantidade;
    }

    // método obrigatório nesta classe
    public double valor() {
        return quantidade * prato.valor;
    }

}

package Classes;

public class Pedido {
    private Produto[] itens;
    private int indice, cont;
    private double total;

    public Pedido(int qdtDeItens){
        itens = new Produto[qdtDeItens];
        indice = 0;
        cont = 0;
        total = 0;
    }

    public void setItens(Produto prod){
        itens[indice++] = prod;
    }
    public void resetIndice(){
        this.indice = 0;
    }
    public double getTotal(){
        return total;
    }
    public void calculaTotal(int qdtDeItens){
        total += itens[cont++].calculaSubTotal();
    }
}
    
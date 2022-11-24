package lista1.Exercicio19;

public class Pedido {
    private int idPedido;
    private Produto[] itens;
    private int qtd;

    public int getIdPedido(){
        return this.idPedido;
    }
   
    public void addPedido(int idPedido, int qdtDeItens){
        qtd = 0;
    }
    public void setItens(Produto produto){
        itens[qtd++] = produto;
    }   
    public int getQtdItens(){
        return this.qtd;
    }
     public void resetQtd(){
        this.qtd = 0;
    }
}
    
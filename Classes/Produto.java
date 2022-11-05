package Classes;

public class Produto {
    private int id;
    private Double preco;
    private int qtdEstoque = 10;
    private int qtdCarrinho;

    public Produto(int idProduto, double precoProduto, int qtdProdutoCarrinho){
        id = idProduto;
        preco = precoProduto;
        if(qtdProdutoCarrinho < qtdEstoque){
            qtdCarrinho = qtdProdutoCarrinho;
        } else {
            System.out.println("Não há estoque para este prduto");
            qtdCarrinho = 10;
        }
    }
    public int getIdProduto(){
        return this.id;
    }
    public double calculaSubTotal(){
        return preco*qtdCarrinho;
    }
}
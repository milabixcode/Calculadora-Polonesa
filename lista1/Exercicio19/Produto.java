package lista1.Exercicio19;

public class Produto {
    private int id;
    private Double preco;
    private int qtdEstoque;

    public Produto(int idProduto, double precoProduto, int qtdEstoqueProduto){
        this.id = idProduto;
        this.preco = precoProduto;
        this.qtdEstoque = qtdEstoqueProduto;   
    }
    public int getIdProduto(){
        return this.id;
    }
    public Double getPreco(){
        return this.preco;
    }
    public int getQtdEstoque(){
        return this.qtdEstoque;
    }
}
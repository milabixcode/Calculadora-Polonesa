package herança;

public class Produto {
    int idProduto = 1;
    Double precoProduto = 10.00;
    int qtdEstoque = 10;

    public int getIdProduto(){
        return idProduto;
    }
    public void setIdProduto(int idProduto){
        this.idProduto = idProduto;
    }
    public Double getPrecoProduto(){
        return precoProduto;
    }
    public void setPrecoProduto(Double precoProduto){
        this.precoProduto = precoProduto;
    }
    public int getQtdEstoque(){
        return qtdEstoque;
    }
    public void setQtdEstoque(int qtdEstoque){
        this.qtdEstoque = qtdEstoque;
    }    
}

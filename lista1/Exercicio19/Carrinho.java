package lista1.Exercicio19;

public class Carrinho {
    private Double total;

    Produto produto = new Produto(1, 5.00, 10);
    Pedido pedido = new Pedido();
    
    public Double calculaTotal(int qdtProdutoCarrinho){
        total = produto.getPreco()*pedido.getQtdItens();
        return total; 
    }

    /*public static void carrinho(Scanner teclado, Pedido pedido, int qdtDeItens){
        Random random = new Random();
        for(int i=0;i<qdtDeItens;i++){
            System.out.println("Informe o id do item" + (i+1) + "do seu pedido: ");
            int idProduto = teclado.nextInt();
            System.out.println("Informe a quantidade desejada do item"+ (i+1) + "do seu pedido: ");
            int qtdProdutoCarrinho = teclado.nextInt();
            Produto produto = new Produto(idProduto, random.nextDouble(), qtdProdutoCarrinho);
            pedido.setItens(produto);
        }
        System.out.println("Informe a forma de pagamento: (0)-Dinheiro, (1)-Cheque, (2)-Cartão");
    }*/
}
   
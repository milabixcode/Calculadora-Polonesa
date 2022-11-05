package Classes;
import java.util.Random;
import java.util.Scanner;

public class Supermercado {
    public static void Caixa(Scanner teclado, Pedido pedido, int qdtDeItens){
        Random random = new Random();
        for(int i=0;i<qdtDeItens;i++){
            System.out.println("Informe o id do item" + (i+1) + "do seu pedido: ");
            int idProduto = teclado.nextInt();
            System.out.println("Informe a quantidade desejada do item"+ (i+1) + "do seu pedido: ");
            int qtdProdutoCarrinho = teclado.nextInt();
            Produto produto = new Produto(idProduto, random.nextDouble(), qtdProdutoCarrinho);
            pedido.setItens(produto);
            pedido.calculaTotal(qdtDeItens);
        }
        System.out.println("Informe a forma de pagamento: (0)-Dinheiro, (1)-Cheque, (2)-Cartão");
    }
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a quantidade de itens no seu pedido: ");
        int qdtDeItens = teclado.nextInt();
        String formasDePagamento[] = {"Dinheiro","Cheque","Cartao"};

        Pedido pedido = new Pedido(qdtDeItens);

        int pagamento = teclado.nextInt();
        System.out.println("O pedido foi pago em " + formasDePagamento[pagamento]+ " e o valor total do pedido é: "+pedido.getTotal());
        teclado.close();
    }
}
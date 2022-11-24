package lista1.Exercicio19;import 

java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args){
        
        Random random = new Random();
        for (int i; i<quantidadeDeItens;i++){
            System.out.print("Informe o nome do item " + (i+1) + "do seu pedido: ");
            String nome = teclado.next();
            System.out.print("Informe a quantidade desejada do item " + (i+1) + "do seu pedido: ");
            int quantidadeDeProdutoDesejada = teclado.nextInt();
            Produto produto = new Produto(nome, ran.nextDouble(), quantidadeDeProdutoDesejada);
            pedido.setItens(produto);
            pedido.calculaTotal(quantidadeDeItens);
        }
        
        String formasDePagamento[] = {"Dinheiro","Cheque","Cartao"};
        
        Produto chocolate = new Produto(1, 2.00, 20);
        Carrinho carrinho_1 = new Carrinho();
        Pedido pedido_1 = new Pedido();        
        
        pedido_1.addPedido(1, 5);
        pedido_1.getQtdItens();

        Double total = carrinho_1.calculaTotal(5);       


        System.out.println("O pedido foi pago em " + formasDePagamento[1] + " e o valor total do pedido é: "+ total);
      
    }
}
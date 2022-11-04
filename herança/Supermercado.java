package herança;
import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
        /* int [] idsProdutos = {0,1,2,3,4,5,6,7,8,9};
        Double [] precosProdutos = {5.00,10.00, 11.00, 2.00, 4.00,5.00,10.00, 11.00, 2.00, 4.00};
        int [] idsPedidos = {}; 
        Double valorTotal;*/

        Produto produto = new Produto();
        Pedido pedido = new Pedido();
        Caixa caixa = new Caixa();

        System.out.println("Estoque Inicial: %d" + produto.getQtdEstoque());
        pedido.getIdPedido();
        pedido.imprimeItens();
        Double valorTotal = pedido.calculaValorTotal();
        System.out.println("Valor Total do Pedido "+pedido.idPedido+ ":"+valorTotal);
        caixa.informarFormaDePagamento();

        System.out.println("Estoque Atualizado: %d" + produto.qtdEstoque);

    }    

}

package herança;

import java.util.Random;
import java.util.Scanner;

public class Pedido {
    Random random = new Random();
    int idPedido = random.nextInt(100);
    int itens;
    Double valorItens, valorTotal;
    String continuar;
    Produto produto = new Produto();
    Caixa caixa = new Caixa();

    public int calculaItens(int idProduto, int qtdCarrinho){
        itens = caixa.qtdCarrinho;
        return itens;
    }
    public Double calculaValorTotal(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite ENTER para continuar,ESC para encerrar: ");
        continuar = teclado.nextLine();
        while(continuar == "ENTER"){
            valorItens = itens * produto.precoProduto;
            valorTotal += valorItens;
        }
        teclado.close();
        return valorTotal;       
    }
    public void imprimeItens(){
        System.out.println("Produto " + produto.idProduto + ":" + caixa.qtdCarrinho + "unidades");
    }    
    public int getIdPedido() {
        return idPedido;
    }
    public int getItens() {
        return itens;
    }
    public void setItens(int itens){
        this.itens = itens;
    }
}

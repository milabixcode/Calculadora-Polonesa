package herança;
import java.util.Scanner;

public class Caixa {
    int qtdCarrinho;
    int idProduto;    
    int formaDePagamento;
    Produto produto = new Produto();
    
    public int informaProdutoAdd(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o ID do produto: ");
        idProduto = teclado.nextInt();
        System.out.println("Produto: ");
        return idProduto;
    }    
    public void AddProdutoNoCarrinho(int idProduto){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade do produto: ");
        qtdCarrinho = teclado.nextInt();
        System.out.println("Quantidade do produto"+idProduto+ ": "+qtdCarrinho);
        if(produto.qtdEstoque<=qtdCarrinho){
            setQtdCarrinho(qtdCarrinho);
        } else {
            System.out.println("Não há essa quantidade de Produto no Estoque! ");
        }
        teclado.close();
    }
       
    public void setQtdCarrinho(int qtdCarrinho){
        this.qtdCarrinho = qtdCarrinho;
    }
    
    public void setIdProduto(int idProduto){
        this.idProduto = idProduto;
    }

    public void informarFormaDePagamento(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 1 para cartão, 2 para cheque ou 3 para dinheiro: ");
        formaDePagamento = teclado.nextInt();
        if(formaDePagamento==1){
            System.out.println("Pagamento no cartão");
        } else if(formaDePagamento==2){
            System.out.println("Pagamento no cheque");
        } else if(formaDePagamento==3){
            System.out.println("Pagamento no dinheiro");
        }else {
            System.out.println("Pagamento inválido");
        }
        teclado.close();
    } 
}    


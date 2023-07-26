package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App implements Observer<Pedido>{

    private List<Prato> pratos = new ArrayList<>();
    private List<Pedido> pedidos = new ArrayList<>();

    public App(List<Prato> pratos, List<Pedido> pedidos) {
        this.pratos = pratos;
        this.pedidos = pedidos;
    }

    public void atualizar(Pedido pedido) {
        System.out.printf("valor do pedido: %.2f (status %s)\n", pedido.valor(), pedido.getStatus());
    }

    public void run() {
        for (Pedido p : pedidos) {
            p.addObserver(this);
        }

        var pedido = pedidos.get(0);
        pedido.setStatus(EstadoPedido.SOLICITADO);
        pedido.setStatus(EstadoPedido.PREPARACAO);
        pedido.setStatus(EstadoPedido.PRONTO);

        // Simulacao do pedido de conta
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe numero de pedido: ");
        int numeroPedido = sc.nextInt(); // Recebe do usuario numero de pedido para calcular a conta
        System.out.println(
                String.format(
                        "Pedido %d foi de R$ %.2f",
                        numeroPedido,
                        calcularConta(numeroPedido)
                )
        ); // Calcula e imprime o valor da conta

        // Simulacao do pedido de histograma
        desenharHistograma(calcularHistograma()); // Calcula e imprime o histograma de pratos
    }


    public double calcularConta(int numeroPedido) {
        return buscarPedido(numeroPedido).valor();
    }

    public Pedido buscarPedido(int numero) {
        return pedidos.get(numero);
    }
    
    /*função para calcular conta se o pedido mudar
    public static double calcularContaNovoEstado(int numeroPedido){
        usar função de checagem de existencia do pedido com função busca
         se existir, checar se mudou o estado com função mudou pedido
            se mudou, chama calcularConta
    }
    */


    public double[] calcularHistograma() {
        double[] histograma = new double[pratos.size()];
        double totalPedidos = 0;
        for (Pedido pedido : pedidos)
            if (pedido != null)
                for (Item item : pedido.itens)
                    if (item != null) {
                        histograma[pratos.indexOf(item.prato)] += item.quantidade;
                        totalPedidos += item.quantidade;
                    }
        for (int i = 0; i < histograma.length; i++)
            if (totalPedidos > 0)
                histograma[i] /= totalPedidos;
        return histograma;
    }

    private void desenharHistograma(double[] histograma) {
        for (int i = 0; i < histograma.length; i++) {
            String prato = "                 " + pratos.get(i).nome;
            System.out.println(prato.substring(prato.length() - 17) + ": "
                    + new String(new char[(int) (100 * histograma[i])]).replace("\0", "X") + "|-> "
                    + histograma[i] * 100 + "%");
        }
    }

}

package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        // Simulacao do carregamento do BD
        List<Prato> pratos = carregarPratos("uff/ic/lleme/tcc00328/trabalhos/grupo1/P1_Observer/pratos.txt");
        List<Pedido> pedidos = carregarPedidos("uff/ic/lleme/tcc00328/trabalhos/grupo1/P1_Observer/pedidos.txt", pratos);

        new App(pratos, pedidos).run();
    }

    public static List<Prato> carregarPratos(String filename) throws FileNotFoundException {
        List<Prato> pratos = new ArrayList<>();
        // pratos.txt
        // valor, nome
        // 15.00 pizza
        // 5.00 coca-cola
        try (InputStream is = new FileInputStream(filename)) {
            Scanner sc = new Scanner(is);
            int i = 0;
            while (sc.hasNext()) {
                double valor = sc.nextDouble();
                String nome = sc.nextLine();
                Prato prato = new Prato(nome, valor);
                pratos.add(prato);
                i++;
            }
        } catch (Exception e) {
            System.out.println("Erro" + e);
            e.printStackTrace();
        }
        return pratos;
    }

    public static List<Pedido> carregarPedidos(String filename, List<Prato> pratos) throws FileNotFoundException {
        List<Pedido> pedidos = new ArrayList<>();

        // pedidos.txt
        // numero, qtd, prato
        // 1 1 pizza
        // 1 2 lasagna
        // 2 2 filet com fritas
        // 2 2 sprite
        try (InputStream is = new FileInputStream(filename)) {
            Scanner sc = new Scanner(is);

            Pedido pedidoCorrente = null;
            int numeroAnterior = -1;
            while (sc.hasNext()) {
                int numeroCorrente = sc.nextInt();
                int quantidade = sc.nextInt();
                String nomePrato = sc.nextLine();
                Prato prato = buscarPrato(pratos, nomePrato);

                if (pedidoCorrente == null || numeroCorrente != numeroAnterior) {
                    pedidoCorrente = new Pedido();
                    pedidos.add(pedidoCorrente);
                    numeroAnterior = numeroCorrente;
                }

                Item item = new Item(prato, quantidade);
                pedidoCorrente.itens.add(item); // navegacao unidirecional
            }
        } catch (Exception e) {
            System.out.println("Erro");
        }

        return pedidos;
    }

    public static Prato buscarPrato(List<Prato> pratos, String nome) {
        for (Prato prato : pratos)
            if (prato != null && prato.nome.equals(nome))
                return prato;
        return null;
    }

    public static Pedido buscarPedido(List<Pedido> pedidos, int numero) {
        return pedidos.get(numero);
    }
}

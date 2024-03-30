import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Pedido {

    Scanner leitor = new Scanner(System.in);
    List<Pizza> pedidos;

    Pedido () {
        this.pedidos = new ArrayList<>();
    }

    void adicionarPedido () {
        Pizza pizza = new Pizza(0, 0, "");

        System.out.println(">> Armazenando novo pedido");

        int tipoPizza = pizza.opcoesTipo();
        int tamanhoPizza = pizza.opcoesTamanho();
        float valorPizza = pizza.getValor();

        System.out.print("Digite o seu endereço: ");
        String endereco = leitor.nextLine();

        Pizza novoPedido = new Pizza(tipoPizza, tamanhoPizza, endereco);
        novoPedido.setValor(valorPizza);
        pedidos.add(novoPedido);
    }

    void exibirPedido() {
        System.out.print("Digite o índice do pedido que deseja exibir: ");
        int indicePedido = leitor.nextInt();

        if (indicePedido >= 0 && indicePedido < pedidos.size()) {
            Pizza pedidoBuscado = pedidos.get(indicePedido);
            System.out.println(">> Relatório de pedido " + indicePedido);
            System.out.println("---------------------------------");

            if (pedidoBuscado.getTipoPizza() == 1)
                System.out.println("Tipo: quatro queijos");
            else if (pedidoBuscado.getTipoPizza() == 2) 
                System.out.println("Tipo: frango com catupiry");
            else
                System.out.println("Tipo: calabresa");

            System.out.println("Endereço: " + pedidoBuscado.getEndereco());
            System.out.println("---------------------------------");
        } else {
            System.out.println("O pedido buscado não existe.");
        }
    }

    void cancelarPedido () {
        System.out.print("Digite o índice do pedido que deseja cancelar: ");
        int indicePedido = leitor.nextInt();

        leitor.nextLine();
    
        if (indicePedido >= 0 && indicePedido < pedidos.size()) {
            pedidos.remove(indicePedido);
            System.out.println("Pedido cancelado com sucesso.");
        } else {
            System.out.println("Pedido não encontrado.");
        }
    }

    void exibirRelatorio() {
        System.out.println(">> Relatório de todos os pedidos");

        int totalPedidos = pedidos.size();
        float totalPreco = 0;

        if (totalPedidos > 0) {
            for (int i = 0; i < totalPedidos; i++) {
                Pizza pedido = pedidos.get(i);
                totalPreco += pedido.valor;
            }

            float mediaPreco = totalPreco / totalPedidos;
            System.out.println("Número total de pedidos: " + totalPedidos);
            System.out.println("Média de preço dos pedidos: " + mediaPreco);
        } else {
            System.out.println("Nenhum pedido encontrado.");
        }
    }
}
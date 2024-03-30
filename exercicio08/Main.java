import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Pedido novoPedido = new Pedido();

        int opcao;

        do {
            System.out.println("################################");
            System.out.println("1. Adicionar um novo pedido");
            System.out.println("2. Exibir detalhe de um pedido");
            System.out.println("3. Cancelar um pedido");
            System.out.println("4. Exibir relatório de todos os pedidos");
            System.out.println("5. Sair");
            System.out.println("################################");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    novoPedido.adicionarPedido();
                break;
                case 2:
                    novoPedido.exibirPedido();
                break;
                case 3:
                    novoPedido.cancelarPedido();
                break;
                case 4:
                    novoPedido.exibirRelatorio();
                break;
                case 5:
                    System.out.println(">> Saindo...");
                break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 5);
    }
}
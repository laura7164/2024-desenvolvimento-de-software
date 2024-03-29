import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Produto novoProduto = new Produto();

        int opcao;

        do {
            System.out.println("################################");
            System.out.println("1. Adicionar um produto");
            System.out.println("2. Atualizar um produto");
            System.out.println("3. Remover um produto");
            System.out.println("4. Relatório sobre o estoque atual");
            System.out.println("5. Sair");
            System.out.println("################################");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    novoProduto.adicionarProduto();
                break;
                case 2:
                    novoProduto.atualizarInformacao();
                break;
                case 3:
                    novoProduto.removerProduto();
                break;
                case 4:
                    novoProduto.exibirInformacao();
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
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Agenda agenda = new Agenda();
           
        int opcao;

        do {
            System.out.println("################################");
            System.out.println("1. Adicionar novo contato");
            System.out.println("2. Buscar um contato pelo nome");
            System.out.println("3. Sair");
            System.out.println("################################");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    agenda.adicionarContato();
                break;
                case 2:
                    agenda.buscarContato();
                break;
                case 3:
                    System.out.println(">> Saindo...");
                break;
                default:
                    System.out.println("Opção inválida.");
                
            }
        } while (opcao != 3);
    }
}
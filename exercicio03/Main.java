import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        List<ContaBancaria> banco = new ArrayList<ContaBancaria>();

        String resposta;

        do {
            System.out.println(">> Armazenando conta nova");

            System.out.print("Digite o número da conta: ");
            String numeroConta = leitor.nextLine();

            System.out.print("Digite o nome do titular: ");
            String nomeTitular = leitor.nextLine();

            System.out.print("Digite o saldo da conta: ");
            float saldo = leitor.nextFloat();

            ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldo);

            banco.add(conta);

            conta.depositar(saldo);
        
            conta.sacar();
            
            leitor.nextLine();
            System.out.print("Deseja armazenar uma nova conta? (s/n): ");
            resposta = leitor.nextLine();
        } while (!resposta.equals("n") && !resposta.equals("N"));

        for (int i = 0; i < banco.size(); i++) {
            System.out.println("---------------------");
            System.out.println("Saldo atual da conta (" + (i + 1) + "):");
            banco.get(i).retornarSaldo();
            //banco.get(i) -> retorna o objeto ContaBancaria na posição i da lista teste
            System.out.println("---------------------");
        }
    }
}

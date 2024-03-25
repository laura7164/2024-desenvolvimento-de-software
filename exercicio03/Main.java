import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        List<ContaBancaria> teste = new ArrayList<ContaBancaria>();

        String resposta;
        String deposito;
        String saque;

        do {
            ContaBancaria conta = new ContaBancaria();
            conta.lerDados();

            System.out.print("Deseja depositar? (s/n): ");
            deposito = leitor.nextLine();

            if (deposito.equals("s") || deposito.equals("S")) {
                conta.depositar();
            }

            System.out.print("Deseja sacar? (s/n): ");
            saque = leitor.nextLine();

            if (saque.equals("s") || saque.equals("S")) {
                conta.sacar();
            }

            System.out.print("Deseja continuar armazenado? (s/n): ");
            resposta = leitor.nextLine();

            teste.add(conta);
            
        } while (!resposta.equals("n") && !resposta.equals("N"));

        for (int i = 0; i < teste.size(); i++) {
            System.out.println("---------------------");
            System.out.println("Conta (" + (i + 1) + "):");
            teste.get(i).retornarSaldo();
            //teste.get(i) -> retorna o objeto ContaBancaria na posição i da lista teste
            System.out.println("---------------------");
        }
    }
}
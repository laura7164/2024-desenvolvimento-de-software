import java.util.Scanner;
public class ContaBancaria {
    
    private String numeroConta;
    private String nomeTitular;
    private float saldo;

    ContaBancaria () {
        System.out.println(">> Armazenando conta nova");
    }

    Scanner leitor = new Scanner(System.in);

    void lerDados () {
        System.out.print("Digite o número da conta: ");
        numeroConta = leitor.nextLine();
        System.out.print("Digite o nome do titular: ");
        nomeTitular = leitor.nextLine();
        System.out.print("Digite o saldo da conta: ");
        saldo = leitor.nextFloat();
    }

    String getNumeroConta () {
        return numeroConta;
    }

    float depositar () {
        System.out.println(">> Depositando");
        System.out.print("Quanto você deseja depositar? ");
        float deposito = leitor.nextFloat();

        return saldo = saldo + deposito;
    }

    float sacar () {
        System.out.println(">> Sacando");
        System.out.print("Quanto você deseja sacar? ");
        float saque = leitor.nextFloat();

        return saldo = saldo - saque;
    }

    void retornarSaldo () {
        System.out.println("Saldo: " + saldo);
    }
}
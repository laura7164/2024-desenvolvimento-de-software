import java.util.Scanner;
public class ContaBancaria {
    
    private String numeroConta;
    private String nomeTitular;
    private float saldo;

    ContaBancaria (String numeroConta, String nomeTitular, float saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    String getNumeroConta () {
        return numeroConta;
    }

    String getNomeTitular () {
        return nomeTitular;
    }

    float getSaldo () {
        return saldo;
    }

    Scanner leitor = new Scanner(System.in);

    float depositar (float saldo) {
        System.out.print("Deseja fazer um depósito? (s/n): ");
        String resposta1 = leitor.nextLine();

        if (resposta1.equals("s") || resposta1.equals("S")) {
            System.out.println(">> Depositando...");

            System.out.print("Quanto você deseja depositar? ");
            float quantiaDeposito = leitor.nextFloat();
            leitor.nextLine();

            System.out.println(">> Depósito de R$" + quantiaDeposito + " feito");

            return this.saldo += quantiaDeposito;   
        } else {
            return this.getSaldo();
        }
    }

    float sacar () {
        System.out.print("Deseja fazer um saque? (s/n): ");
        String resposta2 = leitor.nextLine();

        if (resposta2.equals("s") || resposta2.equals("S")) {
            System.out.println(">> Sacando...");

            System.out.print("Quanto você deseja sacar? ");
            float quantiaSaque = leitor.nextFloat();

            System.out.println(">> Saque de R$" + quantiaSaque + " feito");

            return this.saldo -= quantiaSaque;
        } else {
            return this.getSaldo();
        }
    }

    void retornarSaldo () {
        System.out.println("" + this.getSaldo());
    }
}

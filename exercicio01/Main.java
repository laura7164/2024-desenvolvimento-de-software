import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in); 

        String resposta;

        do {
            System.out.println(">> Realizando novo cálculo...");

            System.out.print("Digite o valor do primeiro número: ");
            float numero_1 = leitor.nextInt();

            System.out.print("Digite o valor do segundo número: ");
            float numero_2 = leitor.nextInt();
            leitor.nextLine();

            System.out.print("Escolha a operação desejada (+, -, *, /): ");
            String operacao = leitor.nextLine();
            
            Calculadora.mostrarResultado(numero_1, numero_2, operacao);
            
            System.out.print("Deseja continuar usando a calculadora? (s/n): ");
            resposta = leitor.nextLine();
        } while (!resposta.equals("n") && !resposta.equals("N"));

        System.out.println(">> Saindo da calculadora...");
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in); 

        String resposta;

        do {
        
            System.out.print("Digite o valor do primeiro número: ");
            float numero_1 = leitor.nextInt();

            System.out.print("Digite o valor do segundo número: ");
            float numero_2 = leitor.nextInt();
            leitor.nextLine();

            System.out.print("Escolha a operação desejada (+, -, *, /): ");
            String operacao = leitor.nextLine();

            Calculadora calculo = new Calculadora(numero_1, numero_2, operacao);
    
            System.out.println("Número 1: " + calculo.getNumero1());
            System.out.println("Número 2: " + calculo.getNumero2());
            System.out.println("" + calculo.getNumero1() + " " + calculo.getOperacao() + " " + calculo.getNumero2() + " = " + calculo.calcularOperacao());
            
            System.out.print("Deseja fazer outra operação? (s/n): ");
            resposta = leitor.nextLine();
            
        } while (!resposta.equals("n") && !resposta.equals("N"));
    }
}

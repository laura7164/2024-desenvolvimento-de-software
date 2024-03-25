import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in); 
        
        System.out.print("Digite o valor do primeiro número: ");
        float numero_1 = leitor.nextInt();

        System.out.print("Digite o valor do segundo número: ");
        float numero_2 = leitor.nextInt();
        leitor.nextLine();

        System.out.print("Escolha a operação desejada (+, -, *, /): ");
        String operacao = leitor.nextLine();

        Calculadora teste = new Calculadora(numero_1, numero_2, operacao);
    
        System.out.println("Número 1: " + teste.getNumero1());
        System.out.println("Número 2: " + teste.getNumero2());
        System.out.println("" + teste.getNumero1() + " " + teste.getOperacao() + " " + teste.getNumero2() + " = " + teste.calcularOperacao());
    }
}
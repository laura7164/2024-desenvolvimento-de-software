import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        List<Carro> colecao = new ArrayList<Carro>();

        String resposta;

        do {
            System.out.println(">> Armazenando novo carro");

            System.out.print("Digite a marca do carro: ");
            String marca = leitor.nextLine();

            System.out.print("Digite o modelo do carro: ");
            String modelo = leitor.nextLine();

            System.out.print("Digite o ano do carro: ");
            int ano = leitor.nextInt();
            leitor.nextLine();

            System.out.print("Digite a placa do carro: ");
            String placa = leitor.nextLine();

            System.out.print("Digite a velocidade atual do carro: ");
            float velocidadeAtual = leitor.nextFloat();

            Carro novoCarro = new Carro(marca, modelo, ano, placa, velocidadeAtual);

            colecao.add(novoCarro);

            novoCarro.acelerar(velocidadeAtual);
            novoCarro.frear(velocidadeAtual);

            leitor.nextLine();
            System.out.print("Deseja armazenar um novo carro? (s/n): ");
            resposta = leitor.nextLine();
        } while (!resposta.equals("n") && !resposta.equals("N"));

        for (int i = 0; i < colecao.size(); i++) {
           colecao.get(i).exibirInformacao();
        }
    }
}
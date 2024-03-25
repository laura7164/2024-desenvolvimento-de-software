import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<Livro> teste = new ArrayList<Livro>();

        String resposta;
        int quantidade = 0;
        Livro livro;

        do {
            livro = new Livro();
            livro.lerDados();

            System.out.print("Deseja continuar armazenado? (n/s): ");
            resposta = leitor.nextLine();

            quantidade++;
            
        } while (!resposta.equals("n") && !resposta.equals("N"));

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Livro (" + (i + 1) + ")");
            livro.exibirInfo();
        }
    }
}
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<Livro> biblioteca = new ArrayList<Livro>();

        String resposta;

        do {
            System.out.println(">> Armazenando novo livro");

            System.out.print("Qual é o titulo do livro? ");
            String titulo = leitor.nextLine();
        
            System.out.print("Qual é o autor do livro? ");
            String autor = leitor.nextLine();

            System.out.print("Qual é o ano do livro? ");
            int ano = leitor.nextInt();
            leitor.nextLine();

            Livro livro = new Livro(titulo, autor, ano);

            biblioteca.add(livro);

            System.out.print("Deseja continuar armazenando livros na biblioteca? (s/n): ");
            resposta = leitor.nextLine();
        } while (!resposta.equals("n") && !resposta.equals("N"));

        for (int i = 0; i < biblioteca.size(); i++) {
            System.out.println("Informações do livro (" + (i + 1) + ")");
            biblioteca.get(i).exibirInfo();
        }

        System.out.println(">> Saindo da biblioteca...");
    }
}

import java.util.Scanner;
public class Jogador {
    
    private String nome;
    private float pontuacao;
    private int nivel;

    Jogador () {
        System.out.println(">> Armazenando novo jogador");
    }

    Scanner leitor = new Scanner(System.in);

    void lerDados () {
        System.out.print("Digite o nome do jogador: ");
        nome = leitor.nextLine();
        System.out.print("Digite a pontuação do jogador: ");
        pontuacao = leitor.nextFloat();
        System.out.print("Digite o nivel do jogador: ");
        nivel = leitor.nextInt();
    }

    float aumentarPontuacao () {
        System.out.print("Quantos pontos o jogador ganhou? ");
        float pontosAumentados = leitor.nextFloat();

        return pontuacao = pontuacao + pontosAumentados;
    }

    int subirNivel () {
        System.out.print("Quantos niveis o jogador subiu? ");
        int niveisAumentados = leitor.nextInt();

        return nivel = nivel +  niveisAumentados;
    }

    void exibirInfomacao () {
        System.out.println("------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Nivel: " + nivel);
        System.out.println("------------------");
    }
}
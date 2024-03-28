import java.util.Scanner;
public class Jogador {
    
    private String nome;
    private float pontuacao;
    private int nivel;

    Jogador (String nome, float pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    String getNome () {
        return nome;
    }

    float getPontuacao () {
        return pontuacao;
    }

    int getNivel () {
        return nivel;
    }

    Scanner leitor = new Scanner(System.in);
    
    public float aumentarPontuacao () {
        System.out.print("Quantos pontos o jogador ganhou? ");
        float pontosAumentados = leitor.nextFloat();

        return this.pontuacao += pontosAumentados;
    }

    public int subirNivel () {
        System.out.print("Quantos niveis o jogador subiu? ");
        int niveisAumentados = leitor.nextInt();

        return this.nivel += niveisAumentados;
    }

    public void exibirInfomacao () {
        System.out.println("------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Pontuação: " + this.getPontuacao());
        System.out.println("Nivel: " + this.getNivel());
        System.out.println("------------------");
    }
}

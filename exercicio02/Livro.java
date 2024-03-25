import java.util.Scanner;
public class Livro {
    
    private String titulo;
    private String autor;
    private String ano;

    Livro() {
        System.out.println(">> Armazenando novo livro");
    }

    Scanner leitor = new Scanner(System.in);

    void lerDados () {
        System.out.print("Qual é o titulo do livro? ");
        titulo = leitor.nextLine();
        System.out.print("Qual é o autor do livro? ");
        autor = leitor.nextLine();
        System.out.print("Qual é o ano do livro? ");
        ano = leitor.nextLine();
    }

    String getTitulo () {
        return titulo;
    }   

    String getAutor () {
        return autor;
    }

    String getAno () {
        return ano;
    }

    void exibirInfo () {
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Ano: " + this.getAno());
    }
}
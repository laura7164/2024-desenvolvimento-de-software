public class Livro {
    
    public String titulo;
    public String autor;
    public int ano;

    public Livro (String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo () {
        return titulo;
    }   

    public String getAutor () {
        return autor;
    }

    public int getAno () {
        return ano;
    }

    public void exibirInfo () {
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Ano: " + this.getAno());
    }
}

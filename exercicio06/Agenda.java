import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Agenda {

    Scanner leitor = new Scanner(System.in);
    List<Contato> contatos;

    Agenda () {
        this.contatos = new ArrayList<>();
    }
    
    void adicionarContato () {
        System.out.println(">> Armazenando novo contato");

        System.out.print("Digite o nome do contato: ");
        String nome = leitor.nextLine();

        System.out.print("Digite o telefonde do contato (xx-xxxxx.xxxx): ");
        String telefone = leitor.nextLine();

        Contato novoContato = new Contato(nome, telefone);
        contatos.add(novoContato);
    }

    Contato buscarContato () {
        System.out.print("Digite o nome do contato que deseja buscar: ");
        String contatoBuscado = leitor.nextLine();

        //comparamos cada contato com o nome buscado
        for (Contato contato : contatos) {
            if (contato.getNome().equals(contatoBuscado)) {
                System.out.println("---------------------------------");
                System.out.println("Telefone de " + contato.getNome() + " " + contato.getTelefone());
                System.out.println("---------------------------------");
                return contato;
            }
        }

        System.out.println("O contato buscado não existe.");
        return null;
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Produto {
    
    private String nome;
    private String codigo;
    private int quantidadeEstoque;
    private float preco;

    Scanner leitor = new Scanner(System.in);
    List<Produto> mercado;

    Produto (String nome, String codigo, int quantidadeEstoque, float preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
    }

    Produto () {
        this.mercado = new ArrayList<>();
    }
    
    void adicionarProduto () {
        System.out.println(">> Armazenando novo produto");
        leitor.nextLine();

        System.out.print("Digite o nome do produto: ");
        nome = leitor.nextLine();

        System.out.print("Digite o código do produto: ");
        codigo = leitor.nextLine();

        System.out.print("Digite a quantidade do produto em estoque: ");
        quantidadeEstoque = leitor.nextInt();

        System.out.print("Digite o preço do produto: ");
        preco = leitor.nextFloat();

        Produto novoProduto = new Produto(nome, codigo, quantidadeEstoque, preco);
        mercado.add(novoProduto);
    }

    String getNome () {
        return nome;
    }

    String getCodigo () {
        return codigo;
    }

    int getQuantidadeEstoque () {
        return quantidadeEstoque;
    }

    float getPreco () {
        return preco;
    }

    void setNome (String nome) {
        System.out.println(">> Alterando nome para: " + nome);
        this.nome = nome;
    }

    void setQuantidadeEstoque (int quantidadeEstoque) {
        System.out.println(">> Alterando quantidade em estoque para: " + quantidadeEstoque);
        this.quantidadeEstoque = quantidadeEstoque;
    }

    void setPreco (float preco) {
        System.out.println(">> Alterando preço para: " + preco);
        this.preco = preco;
    }

    void atualizarInformacao() {
        leitor.nextLine();
        System.out.print("Digite o código do produto que deseja atualizar: ");
        String codigoBuscado = leitor.nextLine();
    
        for (Produto produto : mercado) {
            if (produto.getCodigo().equals(codigoBuscado)) { 
                System.out.println("------------------------");
                System.out.println("1. Nome");
                System.out.println("2. Quantidade em estoque");
                System.out.println("3. Preço");
                System.out.println("------------------------");
    
                System.out.print("Qual informação você deseja atualizar? ");
                int opcao = leitor.nextInt();
                leitor.nextLine();
    
                switch (opcao) {
                    case 1:
                        System.out.print("Digite o novo nome do produto: ");
                        String novoNome = leitor.nextLine();
                        produto.setNome(novoNome); 
                        break;
                    case 2:
                        System.out.print("Digite a nova quantidade em estoque do produto: ");
                        int novaQuantidadeEstoque = leitor.nextInt();
                        produto.setQuantidadeEstoque(novaQuantidadeEstoque);
                        break;
                    case 3:
                        System.out.print("Digite o novo preço do produto: ");
                        float novoPreco = leitor.nextFloat();
                        produto.setPreco(novoPreco);
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
                return;
            }
        }
    
        System.out.println("Produto não encontrado.");
    }

    void removerProduto () {
        leitor.nextLine();
        System.out.print("Digite o código do produto que deseja remover: ");
        String codigoBuscado = leitor.nextLine();

        for (Produto produto : mercado) {
            if (produto.getCodigo().equals(codigoBuscado)) {
                mercado.remove(produto); 
                System.out.println(">> Removendo produto...");
                System.out.println("Produto removido com sucesso.");
                return;
            }
        }

        System.out.println("Produto não encontrado.");
    }

    void exibirInformacao() {
        for (Produto produto : mercado) {
            System.out.println("---------------------");
            System.out.println("" + produto.getNome() + ": " + produto.getQuantidadeEstoque() + " em estoque.");
            System.out.println("Valor total em estoque: " + (produto.getQuantidadeEstoque() * produto.getPreco()));
            System.out.println("---------------------");
        }
    }
}
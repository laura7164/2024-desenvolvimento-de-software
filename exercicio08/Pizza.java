import java.util.Scanner;
public class Pizza {
    
    private int tipoPizza;
    private int tamanhoPizza;
    public float valor;
    private String endereco;

    Pizza (int tipoPizza, int tamanhoPizza, String endereco) {
        this.tipoPizza = tipoPizza;
        this.tamanhoPizza = tamanhoPizza;
        this.endereco = endereco;
    }
    
    int getTipoPizza () {
        return tipoPizza;
    }

    int getTamanhoPizza () {
        return tamanhoPizza;
    }

    float getValor () {
        return valor;
    }

    String getEndereco () {
        return endereco;
    }

    void setValor (float valor) {
        System.out.println(">> Alterando valor para: " + valor);
        this.valor = valor;
    }

    Scanner leitor = new Scanner(System.in);

    int opcoesTipo () {
        System.out.println("################################");
        System.out.println("1. Quatro queijos -  R$5,00");
        System.out.println("2. Frango com catupiry -  R$10,00");
        System.out.println("3. Calabresa -  R$10,00");
        System.out.println("################################");
        System.out.print("Digite o tipo da pizza: ");
        int tipoPizza = leitor.nextInt();

        float valorAdicional = 0;

        switch (tipoPizza) {
            case 1:
                System.out.println(">> Tipo de pizza escolhida: quatro queijos");
                valorAdicional = 5;
            break;
            case 2:
                System.out.println(">> Tipo de pizza escolhida: frango com catupiry");
                valorAdicional = 10;
            break;
            case 3:
                System.out.println(">> Tipo de pizza escolhida: calabresa");  
                valorAdicional = 10;
            break;
            default:
                System.out.println("Opção inválida.");
        }

        this.updateValor(valorAdicional);
        return tipoPizza;
    }

    int opcoesTamanho () {
        System.out.println("################################");
        System.out.println("1. Pequeno (4 pedaços) -    R$4,00");
        System.out.println("2. Médio (6 pedaços) -  R$6,00");
        System.out.println("3. Grande (8 pedaços) -  R$8,00");
        System.out.println("4. Familia (12 pedaços) -  R$10,00");
        System.out.println("################################");
        System.out.print("Digite o tamanho da pizza: ");
        int tamanhoPizza = leitor.nextInt();

        float valorAdicional = 0;

        switch (tamanhoPizza) {
            case 1:
                System.out.println(">> Tamanho de pizza escolhido: pequeno");
                valorAdicional = 4;
            break;
            case 2:
                System.out.println(">> Tamanho de pizza escolhido: médio");
                valorAdicional = 6;
            break;
            case 3:
                System.out.println(">> Tamanho de pizza escolhido: grande");  
                valorAdicional = 8;
            break;
            case 4:
                System.out.println(">> Tamanho de pizza escolhido: familia");  
                valorAdicional = 10;
            break;
            default:
                System.out.println("Opção inválida.");
        }

        this.updateValor(valorAdicional);
        return tamanhoPizza;
    }

    void updateValor (float valorAdicional) {
        System.out.println(">> Alterando valor para: " + (this.getValor() + valorAdicional));
        this.valor += valorAdicional;
    }
}
import java.util.Scanner;
public class Carro {
    
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private float velocidadeAtual;

    Carro (String marca, String modelo, int ano, String placa, float velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = velocidadeAtual;
    }

    String getMarca () {
        return marca;
    }

    String getModelo () {
        return modelo;
    }

    int getAno () {
        return ano;
    }

    String getPlaca () {
        return placa;
    }

    float getVelocidadeAtual () {
        return velocidadeAtual;
    }

    void setVelocidadeAtual (float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    Scanner leitor = new Scanner(System.in);

    public float acelerar (float velocidadeAtual) {
        String resposta1;
        String resposta2;

        System.out.print("Deseja aumentar a velocidade do carro? (s/n): ");
        resposta1 = leitor.nextLine();

        do {
            if (resposta1.equals("s") || resposta1.equals("S")) {
                System.out.println(">> Aumentando a velocidade do carro...");

                if (this.getVelocidadeAtual() <= 195) {
                    this.setVelocidadeAtual(this.getVelocidadeAtual() + 1);
                    System.out.println(">> Velocidade aumentada para " + this.getVelocidadeAtual() + " km/h");
                } else {
                    System.out.println(">> Velocidade máxima atingida.");
                }
            } else {
                return this.getVelocidadeAtual();
            }

            System.out.print("Deseja continuar aumentando a velocidade do carro? (s/n): ");
            resposta2 = leitor.nextLine();
        } while (!resposta2.equals("n") && !resposta2.equals("N"));

        return this.getVelocidadeAtual();
    }

    public float frear (float velocidadeAtual) {
        String resposta1;
        String resposta2;

        System.out.print("Deseja diminuir a velocidade do carro? (s/n): ");
        resposta1 = leitor.nextLine();
        do {
            if (resposta1.equals("s") || resposta1.equals("S")) {
                System.out.println(">> Diminuindo a velocidade do carro...");

                if (this.getVelocidadeAtual() == 0) {
                    System.out.println(">> Velocidade minima atingida.");
                } else {
                    this.setVelocidadeAtual(this.getVelocidadeAtual() - 1); 
                    System.out.println(">> Velocidade diminuida para " + this.getVelocidadeAtual() + " km/h");
                }
            } else {
                return this.getVelocidadeAtual();
            }

            System.out.print("Deseja continuar diminuindo a velocidade do carro? (s/n): ");
            resposta2 = leitor.nextLine();
        } while (!resposta2.equals("n") && !resposta2.equals("N"));

        return this.getVelocidadeAtual();
    }

    public void exibirInformacao () {
        System.out.println("------------------------");
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Velocidade atual: " + this.getVelocidadeAtual() + " km/h");
        System.out.println("------------------------");
    }
}
public class Calculadora {
    
    private float numero_1;
    private float numero_2;
    private String operacao;

    Calculadora (float numero_1, float numero_2, String operacao) {
        this.numero_1 = numero_1;
        this.numero_2 = numero_2;
        this.operacao = operacao;
    }

    float getNumero1 () {
        return numero_1;
    }

    float getNumero2 () {
        return numero_2;
    }

    String getOperacao() {
        return operacao;
    }

    float soma () {
        return this.getNumero1() + this.getNumero2();
    }

    float subtracao () { 
        return this.getNumero1() - this.getNumero2();
    }

    float multiplicacao () {
        return this.getNumero1() * this.getNumero2();
    }

    float divisao () {
        if (this.getNumero2() == 0) {
            System.out.println("Não é possível a divisão por 0.");
            return 0;
        } else 
            return this.getNumero1() / this.getNumero2();
    }

    float calcularOperacao () {
        switch (this.getOperacao()) {
            case "+":
                return soma();
            case "-":
                return subtracao();
            case "*":
                return multiplicacao();
            case "/":
                return divisao();
            default: 
                System.out.println("Operação aritmética inválida.");
                return 0;
        }
    }
}
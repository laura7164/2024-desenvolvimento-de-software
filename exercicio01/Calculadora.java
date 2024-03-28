public class Calculadora {

    static float soma (float numero_1, float numero_2) {
        return numero_1 + numero_2;
    }

    static float subtracao (float numero_1, float numero_2) { 
        return numero_1 - numero_2;
    }

    static float multiplicacao (float numero_1, float numero_2) {
        return numero_1 * numero_2;
    }

    static float divisao (float numero_1, float numero_2) {
        if (numero_2 == 0) {
            System.out.println("Não é possível realizar a divisão por 0.");
            return 0;
        } else 
            return numero_1 / numero_2;
    }

    static float calcularOperacao (float numero_1, float numero_2, String operacao) {
        switch (operacao) {
            case "+":
                return Calculadora.soma(numero_1, numero_2);
            case "-":
                return Calculadora.subtracao(numero_1, numero_2);
            case "*":
                return Calculadora.multiplicacao(numero_1, numero_2);
            case "/":
                return Calculadora.divisao(numero_1, numero_2);
            default: 
                System.out.println("Operação aritmética inválida.");
                return 0;
        }
    }

    static void mostrarResultado (float numero_1, float numero_2, String operacao) {
        System.out.println("" + numero_1 + " " + operacao + " " + numero_2 + " = " + calcularOperacao(numero_1, numero_2, operacao));
    }
}

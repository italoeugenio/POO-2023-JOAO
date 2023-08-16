package atividade1;

/**
 * verificaNumeroPrimo
 */
public class verificaNumeroPrimo {

    public static int verificarNumeroPrimo(Integer n) {
        if (n <= 1) {
            return 0; // Números menores ou iguais a 1 não são primos.
        }

        // Verifica divisibilidade do número por todos os inteiros de 2 até a raiz
        // quadrada de n.
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0; // Se n for divisível por algum número, não é primo.
            }
        }

        return 1; // Se não foi encontrado divisor, n é primo.
    }

    public static String mensagemPrimo(int n) {
        if (verificarNumeroPrimo(n) == 1) {
            return n + " é um número primo."; // Se o número for primo, retorna a mensagem afirmativa.
        } else {
            return n + " não é um número primo."; // Se o número não for primo, retorna a mensagem negativa.
        }
    }

   
    public static void main(String[] args) {
        System.out.println(mensagemPrimo(11)); 
        System.out.println(mensagemPrimo(15)); 
        System.out.println(mensagemPrimo(3)); 
    }
}

package atividade1;

/**
 * verificaNumeroPrimo
 */
public class verificaNumeroPrimo {

    public static int verificarNumeroPrimo(Integer n) {
        if (n <= 1) {
            return 0;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        
        return 1;
    }
    
    public static String mensagemPrimo(int n) {
        if (verificarNumeroPrimo(n) == 1) {
            return n + " é um número primo.";
        } else {
            return n + " não é um número primo.";
        }
    }

    public static void main(String[] args) {
        System.out.println(mensagemPrimo(11));
        System.out.println(mensagemPrimo(15));
        System.out.println(mensagemPrimo(3)); 
    }
}

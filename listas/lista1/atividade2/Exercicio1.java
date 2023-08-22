package lista1.atividade2;

import java.util.Scanner;

/* * Calculadora Simples Crie um programa Java que funcione como uma calculadora * simples. Peça ao usuário para inserir dois
 números e uma operação (+, -, *, * /). 
 Realize a operação escolhida e exiba o resultado. */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        float num1 = scanner.nextFloat();

        System.out.print("Digite o segundo número: ");
        float num2 = scanner.nextFloat();

        System.out.print("Digite a operação (+, -, *, /): ");
        char calculadora = scanner.next().charAt(0);

        float resultado = 0;
        switch (calculadora) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Divisão por zero não existe.");
                    return;
                }
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.println("Resultado: " + resultado);

        scanner.close(); //AJUDA NO DESEMPENHO 
    }
}

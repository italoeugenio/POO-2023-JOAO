package lista1.atividade2;

import java.util.Scanner;

/*Conversor de Temperatura Crie um conversor de temperatura que permita ao usuário converter entre 
Celsius e Fahrenheit. Peça ao usuário para escolher a direção da conversão e, em seguida, 
faça a conversão e exiba o resultado.
 */

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float Fahrenheit;
        float Celsius;
        int Escolha;

        System.out.println("---------------MENU----------------\n");
        System.out.println("Conversor de Temperatura\n");
        System.out.println("Escolha a direção da Conversão\n");
        System.out.println("1. Celsius para Fahrenheit\n");
        System.out.println("2. Fahrenheit para Celsius:\n");
        System.out.print("DIGITE A OPÇÃO 1 OU 2: ");

        Escolha = input.nextInt();

        switch (Escolha) {
            case 1:
                System.out.print("Digite a temperatura em Celsius: ");
                Celsius = input.nextFloat();
                Fahrenheit = (Celsius * 9 / 5) + 32;
                System.out.println("Temperatura em Fahrenheit: " + Fahrenheit);
                break;

            case 2:
                System.out.print("Digite a temperatura em Fahrenheit: ");
                Fahrenheit = input.nextFloat();
                Celsius = (Fahrenheit - 32) * 5 / 9;
                System.out.println("Temperatura em Celsius: " + Celsius);
                break;

            default:
                System.out.println("Opção inválida.");
        }
        input.close(); // Fechar o Scanner ao final do programa
    }
}
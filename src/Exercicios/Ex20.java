package Exercicios;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {

        int contDiv = 0;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = leia.nextInt();

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                contDiv++;
            }
        }

        switch (contDiv) {

            case 0:
                System.out.println("O numero " + numero + " é um numero primo.");
                break;

            default:
                System.out.println("O numero " + numero + "  não é um numero primo.");

        }

    }
}
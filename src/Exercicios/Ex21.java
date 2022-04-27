package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int cont;
        int numSorteado;
        int tentativas;
        int num;

        do {
            System.out.println("Sorteando numero entre 0 e 100...\n");
            Random numeroAleatorio = new Random();
            numSorteado = numeroAleatorio.nextInt(101);

            System.out.println("Começou o jogo! Sera que consegue me vencer?");
            tentativas = 0;

            do {
                tentativas++;
                System.out.printf("Tentativa %d: ", tentativas);
                num = scanner.nextInt();

                if (num > numSorteado) {

                    System.out.printf("O numero sorteado e menor que %d\n", num);

                } else if (num < numSorteado) {

                    System.out.printf("O numero sorteado e maior que %d\n", num);

                } else {

                    System.out.printf("Parabens! Voce acertou o numero em %d tentativas!\n", tentativas);

                }

            } while (num != numSorteado);

            System.out.println("Digite 0 para sair, ou qualquer outro numero para continuar: ");
            cont = scanner.nextInt();

        } while (cont != 0);

        scanner.close();
    }
}
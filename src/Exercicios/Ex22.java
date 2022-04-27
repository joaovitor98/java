package Exercicios;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int somaNumeros = 0;
        int num = 0;

        while (num >= 0) {
            System.out.println("Digite um numero inteiro (zero ou negativo para sair): ");
            num = leia.nextInt();
            if (num >= 0) {
                somaNumeros += num;
                System.out.printf("Soma até o momento: %d\n", somaNumeros);
            }
        }
    }

}
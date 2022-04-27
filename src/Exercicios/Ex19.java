package Exercicios;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {

        int contDiv = 0;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = leia.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                contDiv++;
            }
        }

        if (contDiv == 0) {
            System.out.println("O numero " + num + " é primo.");
        } else {
            System.out.println("O numero " + num + " não é primo.");
        }


    }

}
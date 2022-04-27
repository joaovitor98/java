package Exercicios;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um numero: ");

        int num = leia.nextInt();
        if (num >= 0 && num <= 10) {
            if (num % 2 == 0) {
                System.out.println("Par");
            } else if (num % 2 == 1) {
                System.out.println("Impar");
            }
        }
    }
}

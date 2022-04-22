package Exercicios;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um valor");
        int num = leia.nextInt();
        System.out.println("O valor ao quadrado é " + (int)Math.pow(num, 2));
        System.out.println("O valor ao cubo é " + (int)Math.pow(num, 3));
    }
}

package Exercicios;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int ano;

        System.out.print("Digite um ano: ");
        ano = leia.nextInt();
        if (ano % 400 == 0) {
            System.out.println(ano + " é bissexto.");
        } else if ((ano % 4 == 0) && (ano % 100 != 0)) {
            System.out.println(ano + " é bissexto.");
        } else {
            System.out.println(ano + " não é bissexto");
        }
    }
}
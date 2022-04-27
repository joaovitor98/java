package Exercicios;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite uma nota: ");
        double nota1 = leia.nextDouble();
        System.out.print("Digite uma nota: ");
        double nota2 = leia.nextDouble();
        double media = (nota1 + nota2) / 2;

        if (media >= 7.0 && media <= 10) {
            System.out.println("Aprovado");
        } else if (media < 7.0 && media >= 4.0) {
            System.out.println("Recuperação");
        } else if (media < 4.0) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Invalido");
        }
    }
}

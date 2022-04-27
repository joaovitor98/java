package Exercicios;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um dia da semana");

        String dia = leia.nextLine();

        if (dia.equalsIgnoreCase("Domingo")) {
            System.out.println(1);
        } else if (dia.equalsIgnoreCase("Segunda")) {
            System.out.println(2);
        } else if (dia.equalsIgnoreCase("Terça")) {
            System.out.println(3);
        } else if (dia.equalsIgnoreCase("Quarta")) {
            System.out.println(4);
        } else if (dia.equalsIgnoreCase("Quinta")) {
            System.out.println(5);
        } else if (dia.equalsIgnoreCase("Sexta")) {
            System.out.println(6);
        } else if (dia.equalsIgnoreCase("Sabado")) {
            System.out.println(7);
        } else {
            System.out.println("Invalido");
        }
    }
}

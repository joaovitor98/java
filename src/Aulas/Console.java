package Aulas;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print("dia!\n\n");

        System.out.println("Bom");
        System.out.println("dia!");

        System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);

        System.out.printf("Salario: %.2f%n", 1234.5678);
        System.out.printf("Nome: %s%n", "João");

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = leitura.nextLine();

        System.out.println("Digite seu sobrenome");
        String sobrenome = leitura.nextLine();

        System.out.println("\n\nNome: " + nome + "" + sobrenome);
    }
}

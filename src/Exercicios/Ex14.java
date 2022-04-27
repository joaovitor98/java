package Exercicios;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int qtdNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1) {
            System.out.print("Informe a nota: ");
            nota = leia.nextDouble();
            total += nota;
            qtdNotas++;
        }

        double media = total / qtdNotas;

        System.out.println("Média: " + media);
        System.out.println("Quantidade de notas: " + qtdNotas);
        System.out.println("Total: " + total);
    }
}

package Exercicios;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a palavra: ");
        String palavra = leia.nextLine();

        char letras[] = palavra.toCharArray();

        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }
    }
}
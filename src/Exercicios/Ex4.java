package Exercicios;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("Quantos trabalhos foram concluidos");
            boolean trabalho1 = true;
            boolean trabalho2 = true;

            boolean comprouTV50 = trabalho1 && trabalho2;
            boolean comprouTV32 = trabalho1 ^ trabalho2;
            boolean comprouSorvete = trabalho1 || trabalho2;
            boolean maisSaudavel = !comprouSorvete;
        System.out.println("Comprou TV\"50" + comprouTV50);
        System.out.println("Comprou TV\"32" + comprouTV32);
        System.out.println("Comprou Sorvete" + comprouSorvete);
        System.out.println("Mais saudavel" + maisSaudavel);
    }
}

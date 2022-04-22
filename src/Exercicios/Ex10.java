package Exercicios;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
       int c = 2;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor da base do triangulo");
        int b = leia.nextInt();
        System.out.println("Digite o valor da altura do triangulo");
        int h = leia.nextInt();
        int a = b*h/c;
        System.out.println("A area do triangulo é " + a);


    }
}

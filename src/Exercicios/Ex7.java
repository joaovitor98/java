package Exercicios;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        double a = 9;
        double b = 5;
        double d = 32;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a temperatura em celsius");
        double c = leia.nextDouble();
        double f = c*a/b+d;

        System.out.println("A temperatura em Fahrenheit é: º" + f);
    }
}

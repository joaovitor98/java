package Exercicios;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit");
        double a = 32;
        double b = 5;
        double c = 9;
        double f = leia.nextDouble();
        double celcius = (f-a)*b/c;
        System.out.println("A temperatura em Celsius é: º" + celcius);
    }
}

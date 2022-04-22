package Exercicios;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite seu peso");
        double peso = leia.nextDouble();
        System.out.println("Digite sua altura");
        double altura = leia.nextDouble();
        double imc = peso/(altura*altura);

        System.out.printf("IMC: %.2f ", imc);
    }
}

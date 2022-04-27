package Exercicios;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int maiorValor = 0;
        int cont = 0;

        do {
            System.out.print("Digite um numero: ");
            int valor = leia.nextInt();

            if (valor > maiorValor) {
                maiorValor = valor;
            }

            cont++;
        } while (cont != 10);

        System.out.printf("O maior valor foi: " + maiorValor);
        leia.close();
    }

}
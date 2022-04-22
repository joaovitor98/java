package Exercicios;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite 2 numeros");
        int num1 = leia.nextInt();
        int num2 = leia.nextInt();
        System.out.println("Digite qual operacao deseja?");
        String a = leia.next();
        int resultado = "+".equals(a)? num1 + num2 : 0;
        resultado = "-".equals(a)? num1 - num2 : resultado;
        resultado = "*".equals(a)? num1 * num2 : resultado;
        resultado = "/".equals(a)? num1 / num2 : resultado;

        System.out.printf("%d %s %d = %d", num1, a, num2, resultado);
        }
    }

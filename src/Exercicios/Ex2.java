package Exercicios;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite 3 salários");
        String num1 = leia.nextLine();
        String num2 = leia.nextLine();
        String num3 = leia.nextLine();
        double num4 = Double.parseDouble(num1);
        double num5 = Double.parseDouble(num2);
        double num6 = Double.parseDouble(num3);

        double soma = (num4 + num5 + num6)/3;

        System.out.printf("A média dos salarios é %.2f", soma);
    }
}

package Aulas;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite 4 notas");
        double nota = leia.nextDouble();

        if (nota <= 10 && nota >= 7.0) {
            System.out.println("Aprovado");
            System.out.println("Parabéns");
        }

        if (nota < 7.0 && nota >= 4.5)
            System.out.println("Recuperação");

        boolean criterioReprovacaoAtingindo = nota < 4.5 && nota >= 0;
        if (criterioReprovacaoAtingindo) {
            System.out.println("Reprovado");
        }
    }
}

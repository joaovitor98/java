package Aulas;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String texto = "";

        while (!texto.equalsIgnoreCase("Sair") && !texto.equalsIgnoreCase("sair")) {
            System.out.println("Digite algo");
            texto = leia.nextLine();
        }
        System.out.println("Fim");
    }
}

package Aulas;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite algo");
        String s = leia.nextLine();

        System.out.println("2".equals(s.trim()));
    }
}

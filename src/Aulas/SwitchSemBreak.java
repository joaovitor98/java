package Aulas;


import java.util.Scanner;

public class SwitchSemBreak {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Qual sua faixa de Karatê");
        String faixa = leia.nextLine();

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei o Bassai-Dai...");
            case "marron":
                System.out.println("Sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Heian Godan");
            case "verde":
                System.out.println("Sei o Heian Yodan");
            case "laranja":
                System.out.println("Sei o Heian Sandan");
            case "vermelha":
                System.out.println("Sei o Heian Nidan");
            case "amarela":
                System.out.println("Sei o Heian Shodan");
            default:
                System.out.println("Não sei nada");
        }
        System.out.println("Fim");
    }
}

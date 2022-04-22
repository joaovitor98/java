package Exercicios;

public class Ex3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int c = 6;
        int d = 7;
        int e = 10;
        int potenciacao1 = (int) Math.pow(c * (3 + 2), 2);
        int calculo2 = potenciacao1/(3*2);
        int potenciacao2 = (int) Math.pow((a - b) * (2 - d) / 2, 2);
        int potenciacao3 = (int) Math.pow(calculo2 - potenciacao2, 3);
        int potenciacao4 = (int) Math.pow(e, 3);
        int calculofinal = potenciacao3/potenciacao4;
        System.out.println(calculofinal);
    }
}

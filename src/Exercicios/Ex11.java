package Exercicios;

public class Ex11 {
    public static void main(String[] args) {
        int a = 1;
        int b = 12;
        int c = -13;
        int e = 4;
        int p = 2;
        int f = (int) Math.pow(b, p);
        int d =  b-e*a*c;
        int rd = (int) Math.sqrt(d);
        int x1 = f-rd/p*a;
        int x2 = f+rd/p*a;
        System.out.printf("x1: %d \nx2: %d", x1, x2);
    }
}

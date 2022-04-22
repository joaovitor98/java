package Aulas;

public class VariaveiseConstantes {
    public static void main(String[] args) {
        double raio = 3.4;
        final double pi = 3.14159;
        double result = pi * raio * raio;

        System.out.println("Area: " + result);

        raio = 10;
        result = pi * raio * raio;
        System.out.println("Area: " + result);
    }
}


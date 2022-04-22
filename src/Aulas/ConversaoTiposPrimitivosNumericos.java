package Aulas;

public class ConversaoTiposPrimitivosNumericos {
    public static void main(String[] args) {
        double a = 1; //implícita
        System.out.println(a);

        float b = (float) 1.12345;  //explícita (CAST)
        System.out.println(b);

        double e = 1.9999999;
        int f = (int) e; //explícita (CAST)
        System.out.println(f);
    }
}


package Aulas;

public class Ternario {
    public static void main(String[] args) {
        double media = 5.6;

        String resultadoParcial = media>=5.0 ? "de recuperação" : "reprovado";
        String resultadoFinal = media>=7.0 ? "aprovado.": resultadoParcial;

        System.out.println("O aluno está " + resultadoFinal);

    }
}

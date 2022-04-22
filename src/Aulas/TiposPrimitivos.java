package Aulas;

public class TiposPrimitivos {
    public static void main(String[] args) {

        // Tipos númericos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        final int id = 56789;
        long pontosAcumulados = 2134845223;

        // Tipos númericos reais
        float salario = 11.445F;
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo booleano
        boolean estaDeFerias = false;

        // Tipo caractere
        char status = 'A';

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // Número de viagens
        System.out.println(numeroDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);


    }
}

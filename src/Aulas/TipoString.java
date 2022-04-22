package Aulas;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Salve".charAt(2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toUpperCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("tarde"));
        System.out.println(s.length());
        System.out.println(s.toLowerCase().equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));


        var nome = "JoÃ£o Vitor";
        var sobrenome = "BrandÃ£o";
        var idade = 23;
        var salario = 12345.987;

        System.out.printf("\n\n%s %s tem %d anos e ganha %f", nome, sobrenome, idade, salario);

        String frase = String.format("\n%s %s tem %d anos e ganha %f", nome, sobrenome, idade, salario);
        System.out.println(frase);
    }
}


package Aulas;

public class Wrappers {
    public static void main(String[] args) {
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000;
        Long l = 100000L;
        Float f = 123.0F;
        Double d = 1234.5678;
        Boolean bo = Boolean.parseBoolean("true");
        Character c = '#';


        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i*3);
        System.out.println(l/3);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());
        System.out.println(c + "...");
    }
}

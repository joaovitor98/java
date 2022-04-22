package Aulas;

import javax.swing.*;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo numero");

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);
        int soma = num1+num2;
        System.out.println(soma);
        System.out.println(soma / 2);
    }
}


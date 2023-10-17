package io.github.guifdsk.curso.application.aula001TiposPrimitivos;

public class Aula001TiposPrimitivos {
    public static void main(String[] args) {
/*
        Tipo primitivos:
        int, double, float, char, byte, short, long, boolean
*/
/*
        Casting:
        Força a mudança do tipo de variável, podendo perder informações caso for realizado de um tipo diferente que não
        comporta o valor de outro tipo:
        Ex:
        int idade = (int) 100000000000L;
        Resultado = 1215752192

*/

        int idade = (int) 100000000000L;
        long numeroGrande = (long) 100000.50;
        double salarioDouble = 2000.00D;
        float salarioFloat = (float) 2500.00;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';

        System.out.println("A idade é: " + idade + " anos.");
        System.out.println(numeroGrande);
        System.out.println(salarioDouble);
        System.out.println(salarioFloat);
        System.out.println(idadeByte);
        System.out.println(idadeShort);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(caractere);
    }
}

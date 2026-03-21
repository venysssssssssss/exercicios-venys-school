/*Escreva um programa que conte quantos dígitos existem em um número. */

public class ex7 {

    public static int ContarNumeros(int numero){
        return String.valueOf(numero).length();
    }

    public static void main(String[] args) {
        int numero = 47854848;
        System.out.println("Quantidade de caracteres: "+ ContarNumeros(numero));

    }
}

/*Escreva um programa que conte quantos caracteres existem em uma string. */

public class ex14 {

    public static void main(String[] args) {
        String verdade = "Eu sou linda";
    
        int apenasLetras = verdade.replaceAll("[^\\p{L}]", "").length();
        System.out.println("Quantidade de carcteres: "+ apenasLetras);
    }
    
    
}

// Escreva um programa que calcule o troco de uma compra, recebendo o valor da compra e o valor pago.
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){

        System.out.print("Informe o valor da compra: ");

        Scanner valorDacompra = new Scanner(System.in);
        double vc = valorDacompra.nextDouble();

        System.out.print("Insira o valor a pagar: ");

        Scanner valorApagar = new Scanner(System.in);
        double va = valorApagar.nextDouble();

        double troco;

        troco = va - vc;

        if(va == vc){
            System.out.println("Valor exato, não há troco!");
        }else if(va > vc){
            System.out.println("Seu troco é "+ troco);
        }else{
            System.out.println("Valor insuficiente para a compra!");
        }

    }
}
//Crie um programa que verifique se uma pessoa é maior de idade.
import java.util.Scanner;

public class ex2 {
        public static void main (String[] args){

            System.out.print("Informe a sua idade: ");
            Scanner idade = new Scanner(System.in);
            int i = idade.nextInt();

            if(i >= 18){
                System.out.println("Você é maior de idade");
            }else{
                System.out.println("Você é menor de idade");
            }
        }
    }

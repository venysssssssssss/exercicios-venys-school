/*1. **O Segredo da Portaria:** Crie um programa que receba a idade de um visitante e se ele tem convite (sim/não). 
Ele só entra se for maior de 18 **OU** se tiver o convite. */

import java.util.Scanner;

public class exercicio_1 {
    public static void main(String[] args) {
        
        System.out.println("Bem-vindo!");
        System.out.println("----------");
        System.out.println("Informe sua idade: ");
        
        Scanner idade = new Scanner(System.in);
        int id = idade.nextInt();

        if(id >= 18){
            System.out.println("Você pode entrar!");
        }else{
            System.out.println("Você não tem idade suficiente para entrar!");
            System.out.println("------------------------------------------");
            System.out.println("Você possui um convite?");
            System.out.println("[1] - Sim");
            System.out.println("[2] - Não");

            Scanner resp = new Scanner(System.in);
            int rp = resp.nextInt();

            if(rp == 1){
                System.out.println("Pode entrar!");
            }else if(rp == 2){
                System.out.println("Você não está autorizado a entrar!");
            }
        }

        
        

    }
}
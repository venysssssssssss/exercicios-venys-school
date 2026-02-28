/*13. **Menu de Opções (While):** Exiba um menu: [1] Somar, [2] Subtrair, [3] Sair. O programa deve rodar até o usuário digitar 3. */

import java.util.Scanner;

public class exercicio_13{
    public static void main(String[] args) {
        
        Scanner valor_1 = new Scanner(System.in);
        double vl_1;
        Scanner valor_2 = new Scanner(System.in);
        double vl_2;
        Scanner resposta = new Scanner(System.in);
        int resp;
        double soma;
        double subtrair;


        System.out.println("[1] - Somar");
        System.out.println("[2] - Subtrair");
        System.out.println("[3] - Sair");
        resp = resposta.nextInt();

        if(resp == 1){
            System.out.print("Insira um valor: ");
            vl_1 = valor_1.nextDouble();
            System.out.print("Insira outro valor: ");
            vl_2 = valor_2.nextDouble();
            soma = vl_1 + vl_2;
            System.out.println("Resultado da soma: "+ soma);
        }else if(resp == 2){
            System.out.print("Insira um valor: ");
            vl_1 = valor_1.nextDouble();
            System.out.print("Insira outro valor: ");
            vl_2 = valor_2.nextDouble();
            subtrair = vl_1 - vl_2;
            System.out.println("Resultado da subtração: "+ subtrair);
        }

        while(resp != 3){

            System.out.println("[1] - Somar");
            System.out.println("[2] - Subtrair");
            System.out.println("[3] - Sair");
            resp = resposta.nextInt();

           if(resp == 1){
            System.out.print("Insira um valor: ");
            vl_1 = valor_1.nextDouble();
            System.out.print("Insira outro valor: ");
            vl_2 = valor_2.nextDouble();
            soma = vl_1 + vl_2;
            System.out.println("Resultado da soma: "+ soma);
            }else if(resp == 2){

                System.out.print("Insira um valor: ");
                vl_1 = valor_1.nextDouble();
                System.out.print("Insira outro valor: ");
                vl_2 = valor_2.nextDouble();
                subtrair = vl_1 - vl_2;
                System.out.println("Resultado da subtração: "+ subtrair);
            }
        }

    }
}
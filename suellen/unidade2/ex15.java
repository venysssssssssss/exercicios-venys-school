/*Crie um programa que simule um caixa eletrônico, permitindo saques e depósitos. */
import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 0;
        double valor_deposito, valor_saque;
        int op;
        

        do {
            System.out.println("====CAIXA ELETRÔNICO====");
            System.out.println("[1] - Saldo");
            System.out.println("[2] - Deposito");
            System.out.println("[3] - Saque");
            System.out.println("[4] - Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Saldo: "+ saldo);
                    break;
                case 2:
                    System.out.print("Insira o valor a depositar: ");
                    valor_deposito = sc.nextDouble();
                    saldo = valor_deposito + saldo;
                    System.out.println("Saldo após o deposito: "+ saldo);
                    break;
                
                case 3:
                    System.out.print("Insira o valor a sacar: ");
                    valor_saque = sc.nextDouble();
                    
                    if(valor_saque > saldo){
                        System.out.println("Saldo indisponível");
                    }else{
                        saldo = saldo - valor_saque;
                        System.out.println("Saldo pós saque: "+ saldo);
                    }

                    break;    

            
                default:
                    break;
            }
        }while(op != 4);
        


    }
}
package exercicio9;
import java.util.Scanner;
public class venolas90 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
//Conversor de Temperatura: Pergunte ao usuário se ele quer converter de C para F ou F para C, e faça o cálculo baseado na escolha.       
        System.out.print("Voce quer converter f para c ou c para f:");
        String opcao  = sc.nextLine();       
        
     if (opcao.equals("c para f")){
         System.out.print("Digite a temperatura em celsius:");
         double c = sc.nextDouble();
         double resultado = (c * 1.8) + 32;     
         System.out.print ("Temperatura em Fahrenheit: " + resultado);
     }
     else if (opcao.equals("f para c")){
         System.out.print("Digite a temperatura em Fahrenheit: ");
         double f = sc.nextDouble();
         double resultado = (f - 32) / 1.8;
         System.out.println("Temperatura em Celsius: " + resultado);        
     }
     else {
            System.out.println("Opção inválida.");
        }
       sc.close();
    }
    
}
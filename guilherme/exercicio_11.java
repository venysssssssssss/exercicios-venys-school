package venolas11;
import java.util.Scanner;
public class Venolas11 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        //Criei a entrada de um numero "int" para a pergunta.
       System.out.print("Digite um ano e logo sabera se ele é bissexto ou não:");
        int ano = sc.nextInt();            
        //aqui criei uma condição onde o codigo lia a prioridade logica de %=DIVISÃO resto 0 por 4. &&="E" se o ano !=NAO era divisivel por 100. porem se ele ||= OU fosse divisivel por 400 era bissexto.
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
            System.out.print("Este ano de "+ ano +" e bissexto.");            
        }
        else {
            System.out.print("Este ano de "+ ano +" não é bissexto.");
        }
        
    }
    
}
//Fiz um codigo onde ele lia a prioridade dos operadores logicos sendo eles (%,&&,||,()). No qual verificava se um ano era bissexto ou não.

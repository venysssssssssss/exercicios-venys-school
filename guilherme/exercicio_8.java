package venolas8;
import java.util.Scanner;
public class Venolas8 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     //Dada a idade: 5-10 (Infantil), 11-17 (Juvenil), 18+ (Sênior).
     System.out.println("Qual e a idade do atleta?");
     int idade = sc.nextInt();
     
     if (idade <5){
         System.out.print("Invalido.");
     }
     else if (idade <=10){
         System.out.print("Infantil.");
     }
     else if (idade <= 17){
         System.out.print("Juvenil.");
     }
     else{
         System.out.print("Senior.");
     }
    }
    
}
//Fiz um codigo no qual o programa fez a leitura da idade e designou a classe do atleta
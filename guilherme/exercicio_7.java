package venolas7;
import java.util.Scanner;
public class Venolas7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Receba um número e diga se ele é par ou ímpar usando o operador de resto (%).        
        
        System.out.print("Digite um numero:");
        int a = sc.nextInt();
        
        if (a % 2 == 0){
            System.out.print("Este numero e par");
        }
        else{
            System.out.println("Este nuemro e impar");
        }
        sc.close();
    }
    
}
//Par ou Ímpar: O clássico. Receba um número e diga se ele é par ou ímpar usando o operador de resto (%).
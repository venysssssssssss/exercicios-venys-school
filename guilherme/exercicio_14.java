package venolas14;
import java.util.Scanner;
public class Venolas14 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um numero e saiba sua tabuada:");
        //uma unica entrada para o numerador
        int n = sc.nextInt();
        //multiplicador == i, enquanto i menor que 10 repetir a multiplicação aumentando em 1 o multiplicador.
        for (int i = 1; i <= 10; i++){
            int resultado = (n * i);
            System.out.println(+ n + " x " + i + " = " + resultado);
        }
    }
}
//Tabuada Automática (For): Peça um número e exiba a tabuada dele de 1 a 10 usando a estrutura for.
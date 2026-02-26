/*7. **Par ou Ímpar:** O clássico. Receba um número e diga se ele é par ou ímpar usando o operador de resto (`%`). */

import java.util.Scanner;

public class exercicio_7{
    public static void main(String[] args) {
        System.out.println("Insira um número inteiro: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();

        if(n % 2 == 0){
            System.out.println("Número par");
        }else{
            System.out.println("número ímpar");
        }
    }
}